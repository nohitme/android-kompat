package ericlin.info.kompat.widget

import android.support.v4.widget.PopupWindowCompat
import android.view.View
import android.widget.PopupWindow

/**
 * Call through [PopupWindowCompat.showAsDropDown]
 */
fun PopupWindow.showAsDropDownCompat(anchor: View,
                                     xoff: Int,
                                     yoff: Int,
                                     gravity: Int) =
        PopupWindowCompat.showAsDropDown(this, anchor, xoff, yoff, gravity)

/**
 * Call through [PopupWindowCompat.getOverlapAnchor] and [PopupWindowCompat.setOverlapAnchor]
 */
var PopupWindow.overlapAnchorCompat: Boolean
    get() = PopupWindowCompat.getOverlapAnchor(this)
    set(value) = PopupWindowCompat.setOverlapAnchor(this, value)

/**
 * Call through [PopupWindowCompat.getWindowLayoutType] and [PopupWindowCompat.setWindowLayoutType]
 */
var PopupWindow.windowLayoutTypeCompat: Int
    get() = PopupWindowCompat.getWindowLayoutType(this)
    set(value) = PopupWindowCompat.setWindowLayoutType(this, value)