package lesson_8

fun main() {

    val ingridientsOfSalat = arrayOf("огурец", "горошек", "колбаса", "яйцо", "майонез")
    println("Введите ингридиент:")
    val userInput = readln()

    if (userInput in ingridientsOfSalat) {
        println("Ингридиент $userInput есть в списке")
    } else println("Такого ингридиента в рецепте нет!")
}