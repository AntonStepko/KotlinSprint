package lesson_9

fun main() {

    val list = mutableSetOf<String>()

    println("Введите 5 ингридиентов")
    for (i in 1..5) {
        val userIngrid = readln()
        list.add(userIngrid)
    }

    println("${list.sorted().joinToString().capitalize()}.")
}