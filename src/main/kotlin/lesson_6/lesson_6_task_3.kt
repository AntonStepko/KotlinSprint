package lesson_6

fun main() {

    println("Ведите секунды")
    var num = readln().toInt()
    val constNum = "$num"
    while (num > 0) {
        println("Осталось секунд: ${num--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}