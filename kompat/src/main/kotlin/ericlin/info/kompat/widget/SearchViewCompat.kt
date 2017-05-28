package ericlin.info.kompat.widget

import android.content.ComponentName
import android.support.v4.widget.SearchViewCompat
import android.support.v7.widget.SearchView

/**
 * Call through [SearchViewCompat.setSearchableInfo]
 */
fun SearchView.setSearchableInfoCompat(searchableComponent: ComponentName) =
        SearchViewCompat.setSearchableInfo(this, searchableComponent)

/**
 * Call through [SearchViewCompat.setImeOptions] and [SearchView.getImeOptions]
 */
var SearchView.imeOptionsCompat: Int
    get() = this.imeOptions
    set(value) = SearchViewCompat.setImeOptions(this, value)

/**
 * Call through [SearchViewCompat.setInputType] and [SearchView.getInputType]
 */
var SearchView.inputTypeCompat: Int
    get() = this.inputType
    set(value) = SearchViewCompat.setInputType(this, value)

/**
 * Call through [SearchViewCompat.setOnQueryTextListener]
 */
fun SearchView.setOnQueryTextListenerCompat(listener: SearchViewCompat.OnQueryTextListener?) = SearchViewCompat.setOnQueryTextListener(this, listener)

/**
 * Call through [SearchViewCompat.setOnCloseListener]
 */
fun SearchView.setOnCloseListenerCompat(listener: SearchViewCompat.OnCloseListener) = SearchViewCompat.setOnCloseListener(this, listener)

/**
 * Call through [SearchViewCompat.getQuery]
 */
val SearchView.queryCompat get() = SearchViewCompat.getQuery(this)

/**
 * Call through [SearchViewCompat.setQuery]
 */
fun SearchView.setQueryCompat(query: CharSequence?, submit: Boolean) = SearchViewCompat.setQuery(this, query, submit)

/**
 * Call through [SearchViewCompat.setQueryHint] and [SearchView.getQueryHint]
 */
var SearchView.queryHintCompat: CharSequence?
    get() = this.queryHint
    set(value) = SearchViewCompat.setQueryHint(this, value)

/**
 * Call through [SearchViewCompat.isIconified] and [SearchViewCompat.setIconified]
 */
var SearchView.isIconifiedCompat: Boolean
    get() = SearchViewCompat.isIconified(this)
    set(value) = SearchViewCompat.setIconified(this, value)

/**
 * Call through [SearchViewCompat.isSubmitButtonEnabled] and [SearchViewCompat.setSubmitButtonEnabled]
 */
var SearchView.isSubmitButtonEnabledCompat: Boolean
    get() = SearchViewCompat.isSubmitButtonEnabled(this)
    set(value) = SearchViewCompat.setSubmitButtonEnabled(this, value)

/**
 * Call through [SearchViewCompat.isQueryRefinementEnabled] and [SearchViewCompat.setQueryRefinementEnabled]
 */
var SearchView.isQueryRefinementEnabledCompat: Boolean
    get() = SearchViewCompat.isQueryRefinementEnabled(this)
    set(value) = SearchViewCompat.setQueryRefinementEnabled(this, value)

/**
 * Call through [SearchViewCompat.setMaxWidth] and [SearchView.getMaxWidth]
 */
var SearchView.maxWidthCompat: Int
    get() = this.maxWidth
    set(value) = SearchViewCompat.setMaxWidth(this, value)
