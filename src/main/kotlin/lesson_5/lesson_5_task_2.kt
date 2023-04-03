package lesson_5

fun main() {

    println("Введите год рождения")
    val inputData = readln().toInt()
    val userYear = NOW_YEAR - inputData

    if (userYear >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else if (userYear < AGE_OF_MAJORITY) println("Доступ запрещен")

}
const val AGE_OF_MAJORITY = 18
const val NOW_YEAR = 2023