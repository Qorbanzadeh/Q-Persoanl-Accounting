package me.muhammadali.qpersonalaccounting.model.task

import android.annotation.SuppressLint
import android.util.Log
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream

class DatabaseRestoreTask(completion: ((Boolean) -> Unit)?) : AbstractTask<InputStream>(completion) {

    @SuppressLint("SdCardPath")
    override fun doInBackground(vararg params: InputStream?): Boolean {
        try {
            val input = params.first()
            val dbDir = File("/data/data/me.muhammadali.qpersonalaccounting/databases")
            if (input != null) {
                val zipIn = ZipInputStream(input)
                val buff = ByteArray(1024)

                return zipIn.use {
                    var entry: ZipEntry? = it.nextEntry ?: return@use false

                    do {
                        if (entry!!.name.startsWith("qpersonalaccounting")) {
                            val fos = FileOutputStream(File(dbDir, entry.name), false)

                            fos.use { fOut ->
                                var len = it.read(buff)
                                while (len > 0) {
                                    fOut.write(buff, 0, len)
                                    len = it.read(buff)
                                }
                            }
                            entry = it.nextEntry
                        }
                    } while (entry != null)

                    return@use true
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return false
    }

}