package lesson_8

fun main() {

    println("Какое колличество ингридиентов?")
    val sizeArray = readln().toInt()

    val list = Array(sizeArray) { "" }

    println("Введиете ингридиенты:")
    for (i in list.indices) {
        val ingrid = readln()
        list[i] = ingrid
    }

    println("Список Ваших ингридиентов:")
    for (i in list.indices) {
        println(list[i])
    }
}