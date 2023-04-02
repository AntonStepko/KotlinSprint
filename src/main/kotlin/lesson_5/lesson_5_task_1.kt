package lesson_5

fun main() {

    println("Подтвердите что Вы не бот. Решите пример: 2+2=..")

    val userAnswer = readLine()!!.toInt()

    if(userAnswer == TRUE_ANSWER) println("Добро пожаловать!")
    else if(userAnswer != TRUE_ANSWER) println("Доступ запрещен.")

}
const val TRUE_ANSWER = 4