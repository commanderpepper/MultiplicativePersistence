fun main() {
    val number = 23789L
    mulPersistence(number)
}

fun mulPersistence(num: Long, distance: Int = 0) {

    println("Next Number \t $num")

    if (num.toString().length == 1) {
        println("End Distance \t $distance")
        return
    }

    mulPersistence(
        num.toString().map { it.toString().toLong() }.fold(1L, { total, next -> total * next }),
        distance + 1
    )

}


