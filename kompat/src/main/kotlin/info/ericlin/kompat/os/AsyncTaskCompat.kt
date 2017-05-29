package info.ericlin.kompat.os

import android.os.AsyncTask
import android.support.v4.os.AsyncTaskCompat

/**
 * Call through [AsyncTaskCompat.executeParallel]
 */
fun <Params, Progress, Result> AsyncTask<Params, Progress, Result>.executeParallelCompat(vararg params: Params) =
        AsyncTaskCompat.executeParallel(this, *params)