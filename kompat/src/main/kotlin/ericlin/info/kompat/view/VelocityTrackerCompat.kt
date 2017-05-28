package ericlin.info.kompat.view

import android.support.v4.view.VelocityTrackerCompat
import android.view.VelocityTracker

/**
 * Call through [VelocityTrackerCompat.getXVelocity]
 */
fun VelocityTracker.getXVelocityCompat(pointerId: Int) = VelocityTrackerCompat.getXVelocity(this, pointerId)

/**
 * Call through [VelocityTrackerCompat.getYVelocity]
 */
fun VelocityTracker.getYVelocityCompat(pointerId: Int) = VelocityTrackerCompat.getYVelocity(this, pointerId)