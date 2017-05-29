package info.ericlin.kompat.text.util

import android.support.v4.text.util.LinkifyCompat
import android.text.Spannable
import android.text.util.Linkify
import android.widget.TextView
import java.util.regex.Pattern

fun TextView.addLinksCompat(@LinkifyCompat.LinkifyMask mask: Int) = LinkifyCompat.addLinks(this, mask)

fun Spannable.addLinksCompat(@LinkifyCompat.LinkifyMask mask: Int) = LinkifyCompat.addLinks(this, mask)

fun TextView.addLinksCompat(pattern: Pattern,
                            defaultScheme: String? = null,
                            schemes: Array<String>? = null,
                            matchFilter: Linkify.MatchFilter? = null,
                            transformFilter: Linkify.TransformFilter? = null) =
        LinkifyCompat.addLinks(this, pattern, defaultScheme, schemes, matchFilter, transformFilter)

fun Spannable.addLinksCompat(pattern: Pattern,
                             defaultScheme: String? = null,
                             schemes: Array<String>? = null,
                             matchFilter: Linkify.MatchFilter? = null,
                             transformFilter: Linkify.TransformFilter? = null) =
        LinkifyCompat.addLinks(this, pattern, defaultScheme, schemes, matchFilter, transformFilter)




