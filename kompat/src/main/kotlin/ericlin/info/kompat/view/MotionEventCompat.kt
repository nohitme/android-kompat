package ericlin.info.kompat.view

import android.support.v4.view.MotionEventCompat
import android.view.MotionEvent

/**
 * Call through [MotionEventCompat.getActionMasked]
 */
val MotionEvent.actionMaskedCompat get() = MotionEventCompat.getActionMasked(this)

/**
 * Call through [MotionEventCompat.getActionIndex]
 */
val MotionEvent.actionIndexCompat get() = MotionEventCompat.getActionIndex(this)

/**
 * Call through [MotionEventCompat.isFromSource]
 */
fun MotionEvent.isFromSourceCompat(source: Int) = MotionEventCompat.isFromSource(this, source)

/**
 * Call through [MotionEventCompat.getAxisValue]
 */
fun MotionEvent.getAxisValueCompat(axis: Int) = MotionEventCompat.getAxisValue(this, axis)

/**
 * Call through [MotionEventCompat.getAxisValue]
 */
fun MotionEvent.getAxisValueCompat(axis: Int, pointerIndex: Int) = MotionEventCompat.getAxisValue(this, axis, pointerIndex)

/**
 * Call through [MotionEventCompat.getButtonState]
 */
val MotionEvent.buttonStateCompat get() = MotionEventCompat.getButtonState(this)

