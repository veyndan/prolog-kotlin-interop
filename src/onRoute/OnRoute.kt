package onRoute

fun main(args: Array<String>) {
    println(onRoute(Place.HOME))
}

enum class Place {
    HOME, HALIFAX, GATWICK, ROME
}

enum class Method {
    TAXI, TRAIN, PLANE
}

data class Move(val place: Place, val method: Method, val destination: Place)

val moves = listOf(
        Move(Place.HOME, Method.TAXI, Place.HALIFAX),
        Move(Place.HALIFAX, Method.TRAIN, Place.GATWICK),
        Move(Place.GATWICK, Method.PLANE, Place.ROME)
)

fun onRoute(place: Place): Boolean = when (place) {
    Place.ROME -> true
    else -> moves
            .filter { place == it.place }
            .any { onRoute(it.destination) }
}
