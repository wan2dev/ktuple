package io.github.wan2dev.ktuple

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

/**
 *
 * @author wanggj@thinkive.com
 */
class Tuple0Test {

    val tuple = Tuple()

    @Test
    fun test() {
        assert(tuple.isEmpty())
        assertFalse(tuple.isNotEmpty())
        assertEquals(
            0,
            tuple.size
        )
        assertEquals(
            "()",
            tuple.toString()
        )
        assertEquals(
            Tuple(1),
            tuple.append(1)
        )
    }

}