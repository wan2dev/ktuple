package io.github.wan2dev.ktuple

/**
 *
 * @author wanggj@thinkive.com
 */
interface Tuple {
    val size: Int
}

fun Tuple() = Tuple0

fun <A> Tuple(first: A) = Tuple1(first)

fun <A, B> Tuple(first: A, second: B) = Tuple2(first, second)

fun <A, B, C> Tuple(first: A, second: B, third: C) =
    Tuple3(first, second, third)

fun <A, B, C, D> Tuple(first: A, second: B, third: C, fourth: D) =
    Tuple4(first, second, third, fourth)

fun <A, B, C, D, E> Tuple(first: A, second: B, third: C, fourth: D, fifth: E) =
    Tuple5(first, second, third, fourth, fifth)

fun <A, B, C, D, E, F> Tuple(first: A, second: B, third: C, fourth: D, fifth: E, sixth: F) =
    Tuple6(first, second, third, fourth, fifth, sixth)

fun <A, B, C, D, E, F, G> Tuple(first: A, second: B, third: C, fourth: D, fifth: E, sixth: F, seventh: G) =
    Tuple7(first, second, third, fourth, fifth, sixth, seventh)

fun <A, B, C, D, E, F, G, H> Tuple(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
    eighth: H
) = Tuple8(first, second, third, fourth, fifth, sixth, seventh, eighth)