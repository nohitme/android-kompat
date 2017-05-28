package ericlin.info.kompat.app

import android.app.Notification
import android.support.v4.app.NotificationCompat

/**
 * Call through [NotificationCompat.MessagingStyle.extractMessagingStyleFromNotification]
 */
fun Notification.extractMessagingStyleFromNotificationCompat() = NotificationCompat.MessagingStyle.extractMessagingStyleFromNotification(this)

/**
 * Call through [NotificationCompat.getExtras]
 */
val Notification.extrasCompat get() = NotificationCompat.getExtras(this)

/**
 * Call through [NotificationCompat.getActionCount]
 */
val Notification.actionCountCompat get() = NotificationCompat.getActionCount(this)

/**
 * Call through [NotificationCompat.getAction]
 */
fun Notification.getActionCompat(actionIndex: Int) = NotificationCompat.getAction(this, actionIndex)

/**
 * Call through [NotificationCompat.getCategory]
 */
val Notification.categoryCompat get() = NotificationCompat.getCategory(this)

/**
 * Call through [NotificationCompat.getLocalOnly]
 */
val Notification.localOnlyCompat get() = NotificationCompat.getLocalOnly(this)

/**
 * Call through [NotificationCompat.getGroup]
 */
val Notification.groupCompat get() = NotificationCompat.getGroup(this)

/**
 * Call through [NotificationCompat.isGroupSummary]
 */
fun Notification.isGroupSummaryCompat() = NotificationCompat.isGroupSummary(this)

/**
 * Call through [NotificationCompat.getSortKey]
 */
val Notification.sortKeyCompat get() = NotificationCompat.getSortKey(this)