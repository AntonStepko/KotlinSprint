package lesson_6

fun main() {

    println("Сколько секунд Вы хотите засечь?")
    var num = readln().toInt()
    val constNum = "$num"
    while (num > 0) {
        "${num--}"
        Thread.sleep(1000)
    }
    println("Прошло $constNum секунд")
}
