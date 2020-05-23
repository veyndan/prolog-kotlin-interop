package tallerThan

fun main(args: Array<String>) {
    println(tallerThan(Person.BOB, Person.GEORGE))
}

enum class Person {
    BOB, MIKE, JIM, GEORGE
}

data class Height(val taller: Person, val shorter: Person)

val heights = listOf(
        Height(Person.BOB, Person.MIKE),
        Height(Person.MIKE, Person.JIM),
        Height(Person.JIM, Person.GEORGE)
)

fun tallerThan(taller: Person, shorter: Person): Boolean = when {
    heights.contains(Height(taller, shorter)) -> true
    else -> heights
            .filter { taller == it.taller }
            .any { tallerThan(it.shorter, shorter) }
}
