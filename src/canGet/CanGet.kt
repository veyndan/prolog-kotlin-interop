package canGet

fun main(args: Array<String>) {
    println(canGet(Town.FIVE, Town.TWO))
}

enum class Town {
    ONE, TWO, THREE, FOUR, FIVE, SIX
}

data class Link(val x: Town, val y: Town)

val links = listOf(
        Link(Town.ONE, Town.TWO),
        Link(Town.TWO, Town.THREE),
        Link(Town.THREE, Town.FOUR),
        Link(Town.FOUR, Town.FIVE),
        Link(Town.FIVE, Town.SIX)
)

fun canGet(x: Town, y: Town): Boolean = when {
    links.contains(Link(x, y)) -> true
    else -> links
            .filter { x == it.x }
            .any { canGet(it.y, y) }
}
