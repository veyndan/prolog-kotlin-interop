package sift

fun main(args: Array<String>) {
    println(sift(listOf(1,12,3,14,5,8)))
}

fun sift(xs: List<Int>): List<Int> = when {
    xs.isEmpty() -> emptyList()
    else -> {
        val head = xs.first()
        val tail = xs.drop(1)
        when {
            head > 6 -> listOf(head) + sift(tail)
            else -> sift(tail)
        }
    }
}

