package ericlin.info.kompat.view

import android.support.v4.view.LayoutInflaterCompat
import android.view.LayoutInflater

/**
 * Call through [LayoutInflaterCompat.getFactory] and [LayoutInflaterCompat.setFactory]
 */
var LayoutInflater.factoryCompat
    get() = LayoutInflaterCompat.getFactory(this)
    set(value) = LayoutInflaterCompat.setFactory(this, value)