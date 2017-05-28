package ericlin.info.appkompat.content.view

import android.support.v4.view.ScaleGestureDetectorCompat

var Any.quickScaleEnabled: Boolean
    get() = ScaleGestureDetectorCompat.isQuickScaleEnabled(this)
    set(value) = ScaleGestureDetectorCompat.setQuickScaleEnabled(this, value)