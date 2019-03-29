fun main() {
    val number = 39L
    mulPersistence(number)
}

fun mulPersistence(num: Long, distance: Int = 0) {

    println("Number at step \t $distance - $num")

    if (num < 10) {
        println("Steps \t \t \t $distance")
        return
    }

    mulPersistence(
        num.toString().map { it.toString().toLong() }.fold(1L, { total, next -> total * next }),
        distance + 1
    )

}




