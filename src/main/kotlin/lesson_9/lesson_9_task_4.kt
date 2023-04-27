package lesson_9

fun main() {

    println("Введите 5 ингридиентов через запятую")
    val userIngrid = readln()
    val list = userIngrid.split(",").toList()

    println(list.sorted().joinToString())

}