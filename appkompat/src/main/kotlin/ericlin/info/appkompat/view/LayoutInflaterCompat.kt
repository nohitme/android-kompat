package ericlin.info.appkompat.view

import android.support.v4.view.LayoutInflaterCompat
import android.support.v4.view.LayoutInflaterFactory
import android.view.LayoutInflater

/**
 * Call through [LayoutInflaterCompat.getFactory] and [LayoutInflaterCompat.setFactory]
 */
var LayoutInflater.FactoryCompat: LayoutInflaterFactory
    get() = LayoutInflaterCompat.getFactory(this)
    set(value) = LayoutInflaterCompat.setFactory(this, value)