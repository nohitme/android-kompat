package ericlin.info.kompat.view

import android.support.v4.view.ViewGroupCompat
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityEvent

/**
 * Call through [ViewGroupCompat.onRequestSendAccessibilityEvent]
 */
fun ViewGroup.onRequestSendAccessibilityEventCompat(child: View,
                                                    event: AccessibilityEvent) =
        ViewGroupCompat.onRequestSendAccessibilityEvent(this, child, event)

/**
 * Call through [ViewGroupCompat.setMotionEventSplittingEnabled] and [ViewGroup.isMotionEventSplittingEnabled]
 */
var ViewGroup.isMotionEventSplittingEnabledCompat: Boolean
    get() = this.isMotionEventSplittingEnabled
    set(value) = ViewGroupCompat.setMotionEventSplittingEnabled(this, value)

/**
 * Call through [ViewGroupCompat.getLayoutMode] and [ViewGroupCompat.setLayoutMode]
 */
var ViewGroup.layoutModeCompat: Int
    get() = ViewGroupCompat.getLayoutMode(this)
    set(value) = ViewGroupCompat.setLayoutMode(this, value)

/**
 * Call through [ViewGroupCompat.isTransitionGroup] and [ViewGroupCompat.setTransitionGroup]
 */
var ViewGroup.isTransitionGroupCompat: Boolean
    get() = ViewGroupCompat.isTransitionGroup(this)
    set(value) = ViewGroupCompat.setTransitionGroup(this, value)

/**
 * Call through [ViewGroupCompat.getNestedScrollAxes]
 */
val ViewGroup.nestedScrollAxesCompat
    get() = ViewGroupCompat.getNestedScrollAxes(this)
