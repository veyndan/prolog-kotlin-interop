package replaceAll

fun main(args: Array<String>) {
    check(replaceAll(listOf("a", "b", "a", "c", "a", "d"), "a", "mike") == listOf("mike", "b", "mike", "c", "mike", "d"))
    check(replaceAll(listOf("a", "b", "a", "c", "a", "d"), "b", "foo") == listOf("a", "foo", "a", "c", "a", "d"))
    check(replaceAll(listOf("a", "b", "a", "c", "a", "d"), "prolog", "logic") == listOf("a", "b", "a", "c", "a", "d"))
}

fun <T> replaceAll(xs: List<T>, y: T, z: T): List<T> = when {
    xs.isEmpty() -> emptyList()
    else -> {
        val head = xs.first()
        val tails = xs.drop(1)
        when {
            head == y -> listOf(z) + replaceAll(tails, y, z)
            else -> listOf(head) + replaceAll(tails, y, z)
        }
    }
}
