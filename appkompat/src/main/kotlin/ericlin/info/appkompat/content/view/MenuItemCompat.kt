package ericlin.info.appkompat.content.view

import android.support.v4.view.ActionProvider
import android.support.v4.view.MenuItemCompat
import android.view.MenuItem
import android.view.View

/**
 * Call through [MenuItemCompat.setShowAsAction]
 */
fun MenuItem.setShowAsActionCompat(actionEnum: Int) = MenuItemCompat.setShowAsAction(this, actionEnum)

/**
 * Call through [MenuItemCompat.setActionView]
 */
fun MenuItem.setActionViewCompat(view: View) = MenuItemCompat.setActionView(this, view)

/**
 * Call through [MenuItemCompat.setActionView]
 */
fun MenuItem.setActionViewCompat(resId: Int) = MenuItemCompat.setActionView(this, resId)

/**
 * Call through [MenuItemCompat.getActionView]
 */
fun MenuItem.getActionViewCompat() = MenuItemCompat.getActionView(this)

/**
 * Call through [MenuItemCompat.setActionProvider]
 */
fun MenuItem.setActionProviderCompat(provider: ActionProvider) = MenuItemCompat.setActionProvider(this, provider)

/**
 * Call through [MenuItemCompat.getActionProvider]
 */
fun MenuItem.getActionProviderCompat() = MenuItemCompat.getActionProvider(this)

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
fun MenuItem.isActionViewExpandedCompat() = MenuItemCompat.isActionViewExpanded(this)

/**
 * Call through [MenuItemCompat.setOnActionExpandListener]
 */
fun MenuItem.setOnActionExpandListenerCompat(listener: MenuItemCompat.OnActionExpandListener) = MenuItemCompat.setOnActionExpandListener(this, listener)