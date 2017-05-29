package info.ericlin.kompat.content

import android.content.ContentResolver
import android.net.Uri
import android.support.v4.content.ContentResolverCompat
import android.support.v4.os.CancellationSignal

/**
 * Call through [ContentResolverCompat.query]
 */
fun ContentResolver.queryCompat(uri: Uri,
                                projection: Array<String>,
                                selection: String,
                                selectionArgs: Array<String>,
                                sortOrder: String, cancellationSignal: CancellationSignal) =
        ContentResolverCompat.query(this, uri, projection, selection, selectionArgs, sortOrder, cancellationSignal)