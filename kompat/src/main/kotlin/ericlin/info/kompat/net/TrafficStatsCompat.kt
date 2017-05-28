package ericlin.info.kompat.net

import android.support.v4.net.TrafficStatsCompat
import java.net.DatagramSocket
import java.net.Socket
import java.net.SocketException

/**
 * Call through [TrafficStatsCompat.tagSocket]
 */
@Throws(SocketException::class)
fun Socket.tagSocketCompat() = TrafficStatsCompat.tagSocket(this)

/**
 * Call through [TrafficStatsCompat.untagSocket]
 */
@Throws(SocketException::class)
fun Socket.untagSocketCompat() = TrafficStatsCompat.untagSocket(this)

/**
 * Call through [TrafficStatsCompat.tagDatagramSocket]
 */
@Throws(SocketException::class)
fun DatagramSocket.tagDatagramSocketCompat() = TrafficStatsCompat.tagDatagramSocket(this)

/**
 * Call through [TrafficStatsCompat.untagDatagramSocket]
 */
@Throws(SocketException::class)
fun DatagramSocket.untagDatagramSocketCompat() = TrafficStatsCompat.untagDatagramSocket(this)