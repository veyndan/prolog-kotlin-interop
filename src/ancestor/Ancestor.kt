package ancestor

fun main(args: Array<String>) {
    println(ancestor(Person.PAUL, Person.MARY))
}

enum class Person {
    JOHN, PAUL, TOM, MARY
}

data class Parent(val x: Person, val y: Person)

val parents = listOf(
        Parent(Person.JOHN, Person.PAUL),
        Parent(Person.PAUL, Person.TOM),
        Parent(Person.TOM, Person.MARY)
)

fun ancestor(x: Person, y: Person): Boolean = when {
    parents.contains(Parent(x, y)) -> true
    else -> parents
            .filter { x == it.x }
            .any { (_, z) -> ancestor(z, y) }
}
