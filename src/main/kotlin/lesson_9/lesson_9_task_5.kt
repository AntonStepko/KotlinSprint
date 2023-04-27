package lesson_9

fun main() {
    val numIngrid = 5
    val ingridients = mutableSetOf<String>()

    println("Введите $numIngrid ингридиентов")
    for (i in 1..numIngrid) {
        val userIngrid = readln()
        ingridients.add(userIngrid)
    }

    println("${ingridients.sorted().joinToString().capitalize()}.")
}