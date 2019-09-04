package me.muhammadali.qpersonalaccounting.ui.setting

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import me.muhammadali.qpersonalaccounting.MainActivity
import me.muhammadali.qpersonalaccounting.R
import me.muhammadali.qpersonalaccounting.ServiceLocator
import me.muhammadali.qpersonalaccounting.model.task.DatabaseBackupTask
import me.muhammadali.qpersonalaccounting.model.task.DatabaseRestoreTask
import me.muhammadali.qpersonalaccounting.ui.BaseNavigationFragment
import me.muhammadali.qpersonalaccounting.ui.report.CashEntryReportFragment
import kotlinx.android.synthetic.main.fragment_more.*
import kotlinx.android.synthetic.main.layout_appbar.*
import java.io.File
import java.io.InputStream

class SettingFragment : BaseNavigationFragment() {

    companion object {
        private const val WRITE_STORAGE_PERMISSION_FOR_BACKUP_REQUEST = 1
        private const val WRITE_STORAGE_PERMISSION_FOR_RESTORE_REQUEST = 2
        private const val BACKUP_DIRECTORY_REQUEST = 3
        private const val RESTORE_FILE_REQUEST = 4
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_more, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val activity = activity as MainActivity

        toolbar.setTitle(R.string.more)

        tvDailyReport.setOnClickListener {
            val args = bundleOf(CashEntryReportFragment.KEY_REPORT_TYPE to 0)
            findNavController().navigate(R.id.action_settingFragment_to_cashEntryReportFragment, args)
        }

        tvMonthlyReport.setOnClickListener {
            val args = bundleOf(CashEntryReportFragment.KEY_REPORT_TYPE to 1)
            findNavController().navigate(R.id.action_settingFragment_to_cashEntryReportFragment, args)
        }

        tvBackup.setOnClickListener {
            checkStoragePermission(activity, WRITE_STORAGE_PERMISSION_FOR_BACKUP_REQUEST)
        }

        tvRestore.setOnClickListener {
            checkStoragePermission(activity, WRITE_STORAGE_PERMISSION_FOR_RESTORE_REQUEST)
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when (requestCode) {
            WRITE_STORAGE_PERMISSION_FOR_BACKUP_REQUEST -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    executeBackup()
                } else {
                    AlertDialog.Builder(context!!)
                        .setTitle("Error")
                        .setIcon(R.drawable.ic_warning_red)
                        .setMessage("Write storage permission denied.")
                        .show()
                }
            }

            WRITE_STORAGE_PERMISSION_FOR_RESTORE_REQUEST -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
                    intent.type = "*/*"
                    startActivityForResult(intent, RESTORE_FILE_REQUEST)
                } else {
                    AlertDialog.Builder(context!!)
                        .setTitle("Error")
                        .setIcon(R.drawable.ic_warning_red)
                        .setMessage("Write storage permission denied.")
                        .show()
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            RESTORE_FILE_REQUEST -> {
                data?.data?.also {
                    val file = it.toString()
                    context?.also { ctx ->
                        if (file.endsWith(".wkp")) {
                            AlertDialog.Builder(ctx)
                                    .setTitle("Confirm")
                                    .setMessage("Are you sure to restore data?")
                                    .setNegativeButton(android.R.string.cancel) { di, _ -> di.dismiss() }
                                    .setPositiveButton(android.R.string.ok) { di, _ ->
                                        executeRestore(context?.contentResolver?.openInputStream(it))
                                        di.dismiss()
                                    }
                                    .setCancelable(false)
                                    .show()
                        } else {
                            AlertDialog.Builder(ctx)
                                    .setTitle("Error")
                                    .setIcon(R.drawable.ic_warning_red)
                                    .setMessage("Unsupported file.")
                                    .show()
                        }
                    }
                }
            }
        }
    }

    private fun checkStoragePermission(activity: Activity, requestCode: Int) {
        if (ContextCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE)
            == PackageManager.PERMISSION_GRANTED) {

            when (requestCode) {
                WRITE_STORAGE_PERMISSION_FOR_BACKUP_REQUEST -> {
                    executeBackup()
                }

                WRITE_STORAGE_PERMISSION_FOR_RESTORE_REQUEST -> {
                    val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
                    intent.type = "*/*"
                    startActivityForResult(intent, RESTORE_FILE_REQUEST)
                }
            }

        } else {
            requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), requestCode)
        }
    }

    private fun executeBackup() {
        val outFileName = "wallet-qpersonalaccounting-${System.currentTimeMillis()}.wkp"
        val outFile = File(Environment.getExternalStorageDirectory(), outFileName)

        context?.also { ctx ->
            DatabaseBackupTask { result ->
                if (result) {
                    showSnackBar("Backup success: ${outFile.absolutePath}")
                } else {
                    AlertDialog.Builder(ctx)
                        .setTitle("Error")
                        .setIcon(R.drawable.ic_warning_red)
                        .setMessage("Backup failed.")
                        .show()
                }
            }.execute(outFile)
        }
    }

    private fun executeRestore(input: InputStream?) {
        context?.also { ctx ->
            val locator = ServiceLocator.instance(ctx)
            locator.closeDatabase()

            DatabaseRestoreTask { result ->
                locator.initDatabase()
                if (result) {
                    showSnackBar("Restore success.")
                } else {
                    AlertDialog.Builder(ctx)
                        .setTitle("Error")
                        .setIcon(R.drawable.ic_warning_red)
                        .setMessage("Restore failed.")
                        .show()
                }
            }.execute(input)
        }

    }

    private fun showSnackBar(message: String) {
        val snackBar = Snackbar.make(coordinatorLayout, message, Snackbar.LENGTH_LONG)
        val params = snackBar.view.layoutParams as CoordinatorLayout.LayoutParams
        val scale = resources.displayMetrics.density
        params.bottomMargin = ((64 * scale) + 0.5f).toInt()
        snackBar.show()
    }

}