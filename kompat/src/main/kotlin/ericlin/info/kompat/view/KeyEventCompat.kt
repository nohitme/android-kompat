package ericlin.info.kompat.view

import android.support.v4.view.KeyEventCompat
import android.view.KeyEvent

/**
 * Call through [KeyEventCompat.hasModifiers]
 */
fun KeyEvent.hasModifiersCompat(modifiers: Int) = KeyEventCompat.hasModifiers(this, modifiers)

/**
 * Call through [KeyEventCompat.hasNoModifiers]
 */
fun KeyEvent.hasNoModifiersCompat() = KeyEventCompat.hasNoModifiers(this)

/**
 * Call through [KeyEventCompat.isCtrlPressed]
 */
fun KeyEvent.isCtrlPressedCompat() = KeyEventCompat.isCtrlPressed(this)