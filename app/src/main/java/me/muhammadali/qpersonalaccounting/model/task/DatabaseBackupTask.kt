package me.muhammadali.qpersonalaccounting.model.task

import android.annotation.SuppressLint
import java.io.*
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

class DatabaseBackupTask(completion: ((Boolean) -> Unit)?) : AbstractTask<File>(completion) {

    @SuppressLint("SdCardPath")
    override fun doInBackground(vararg params: File?): Boolean {
        try {
            val outFile = params[0]
            val dbDir = File("/data/data/me.muhammadali.qpersonalaccounting/databases")
            if (outFile != null && dbDir.exists() && !dbDir.listFiles().isEmpty()) {

                val fos = FileOutputStream(outFile)
                val zipOut = ZipOutputStream(BufferedOutputStream(fos))

                return zipOut.use {

                    for (file in dbDir.listFiles()) {
                        writeFileToZip(it, file)
                    }

                    return@use true
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return false
    }

    private fun writeFileToZip(zipOut: ZipOutputStream, file: File) {
        val fIn = FileInputStream(file)

        fIn.use {
            val zipEntry = ZipEntry(file.name)
            zipOut.putNextEntry(zipEntry)

            val bytes = ByteArray(1024)
            var len = it.read(bytes)

            while (len >= 0) {
                zipOut.write(bytes, 0, len)
                len = it.read(bytes)
            }
        }
    }

}