package deleteAll

fun main(args: Array<String>) {
    check(deleteAll(listOf('a', 'b', 'a', 'c', 'a', 'd'), 'a') == listOf('b', 'c', 'd'))
    check(deleteAll(listOf('a', 'b', 'a', 'c', 'a', 'd'), 'b') == listOf('a', 'a', 'c', 'a', 'd'))
    check(deleteAll(listOf('a', 'b', 'a', 'c', 'a', 'd'), 'z') == listOf('a', 'b', 'a', 'c', 'a', 'd'))
}

fun deleteAll(xs: List<Char>, y: Char): List<Char> = when {
    xs.isEmpty() -> emptyList()
    else -> {
        val head = xs.first()
        val tail = xs.drop(1)
        when {
            head == y -> deleteAll(tail, y)
            else -> listOf(head) + deleteAll(tail, y)
        }
    }
}
