package ericlin.info.appkompat.content.os

import android.os.AsyncTask
import android.support.v4.os.AsyncTaskCompat

/**
 * Call through [AsyncTaskCompat.executeParallel]
 */
fun <Params, Progress, Result> AsyncTask<Params, Progress, Result>.executeParallelCompat(varargs: Params) = AsyncTaskCompat.executeParallel(this, varargs)