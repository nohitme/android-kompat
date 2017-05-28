package ericlin.info.kompat.graphics

import android.graphics.Paint
import android.support.v4.graphics.PaintCompat

/**
 * Call through [PaintCompat.hasGlyph]
 */
fun Paint.hasGlyphCompat(string: String) = PaintCompat.hasGlyph(this, string)