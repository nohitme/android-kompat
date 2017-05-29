package ericlin.info.kompat.view

import android.support.v4.view.MenuItemCompat
import android.view.MenuItem

/**
 * Call through [MenuItemCompat.setShowAsAction]
 */
fun MenuItem.setShowAsActionCompat(actionEnum: Int) = MenuItemCompat.setShowAsAction(this, actionEnum)

/**
 * Call through [MenuItemCompat.setActionView] and [MenuItemCompat.getActionView]
 */
var MenuItem.actionViewCompat
    get() = MenuItemCompat.getActionView(this)
    set(value) {
        MenuItemCompat.setActionView(this, value)
    }

/**
 * Call through [MenuItemCompat.setActionView]
 */
fun MenuItem.setActionViewCompat(resId: Int) = MenuItemCompat.setActionView(this, resId)

/**
 * Call through [MenuItemCompat.getActionProvider] and [MenuItemCompat.setActionProvider]
 */
var MenuItem.actionProviderCompat
    get() = MenuItemCompat.getActionProvider(this)
    set(value) {
        MenuItemCompat.setActionProvider(this, value)
    }

/**
 * Call through [MenuItemCompat.expandActionView]
 */
fun MenuItem.expandActionViewCompat() = MenuItemCompat.expandActionView(this)

/**
 * Call through [MenuItemCompat.collapseActionView]
 */
fun MenuItem.collapseActionViewCompat() = MenuItemCompat.collapseActionView(this)

/**
 * Call through [MenuItemCompat.isActionViewExpanded]
 */
val MenuItem.isActionViewExpandedCompat
    get() = MenuItemCompat.isActionViewExpanded(this)

/**
 * Call through [MenuItemCompat.setOnActionExpandListener]
 */
fun MenuItem.setOnActionExpandListenerCompat(listener: MenuItemCompat.OnActionExpandListener) =
        MenuItemCompat.setOnActionExpandListener(this, listener)