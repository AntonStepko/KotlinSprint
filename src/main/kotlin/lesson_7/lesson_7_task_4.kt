package lesson_7

fun main() {

    println("Введите колличество секунд:")
    val userSec = readln().toInt()

    for (i in userSec downTo  0) {
        println("$i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}