package lesson_9

fun main() {
    val numIngrid = 5
    val list = MutableList(numIngrid) { "" }

    println("Введите 5 ингридиентов")
    for (i in list.indices) {
        val userIngrid = readln()
        list[i] = userIngrid
    }

    println("${list.toSet().sorted().joinToString().capitalize()}.")

}