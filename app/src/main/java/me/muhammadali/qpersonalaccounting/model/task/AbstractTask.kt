package me.muhammadali.qpersonalaccounting.model.task

import android.os.AsyncTask

abstract class AbstractTask<Params>(private val completion: ((Boolean) -> Unit)?) : AsyncTask<Params, Void, Boolean>() {

    override fun onPostExecute(result: Boolean?) {
        super.onPostExecute(result)
        completion?.invoke(result ?: false)
    }

}