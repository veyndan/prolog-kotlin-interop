package append

fun main(args: Array<String>) {
    println(append(listOf('a', 'b', 'c'), listOf('1', '2', '3')))
}

fun append(xs: List<Char>, ys: List<Char>): List<Char> = when {
    xs.isEmpty() -> ys
    else -> {
        val head = xs.first()
        val tail = xs.drop(1)
        listOf(head) + append(tail, ys)
    }
}
