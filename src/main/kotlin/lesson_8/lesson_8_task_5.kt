package lesson_8

fun main() {

    println("Какое колличество ингридиентов?")
    val sizeArray = readln().toInt()
    var n = 0

    val list = Array(sizeArray) { "$n" }

    println("Введиете ингридиенты:")
    for (i in list) {
        val ingrid = readln()
        list[n] = ingrid
        n++
    }

    println("Список Ваших ингридиентов:")
    for (i in list) {
        println(i)
    }

}