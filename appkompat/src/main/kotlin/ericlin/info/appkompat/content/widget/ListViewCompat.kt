package ericlin.info.appkompat.content.widget

import android.support.v4.widget.ListViewCompat
import android.widget.ListView

/**
 * Call through [ListViewCompat.scrollListBy]
 */
fun ListView.scrollListByCompat(y: Int) = ListViewCompat.scrollListBy(this, y)