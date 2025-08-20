package com.sodax.ktuple

/**
 *
 * @author wanggj@thinkive.com
 */
object Tuple0 : Tuple {
    override val size: Int = 0

    override fun toString() = "()"

    fun <T> append(value: T) = Tuple(value)
}