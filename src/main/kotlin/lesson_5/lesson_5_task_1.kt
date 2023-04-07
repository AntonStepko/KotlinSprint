package lesson_5

fun main() {

    val num1 = 2
    val num2 = 2
    val numSum = num1 + num2
    println("Подтвердите что Вы не бот. Решите пример: $num1+$num2=..")

    val userAnswer = readln().toInt()

    if(userAnswer == numSum) println("Добро пожаловать!")
    else if(userAnswer != numSum) println("Доступ запрещен.")

}
