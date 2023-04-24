package lesson_8

fun main (){

    val ingridientsOfSalat = arrayOf("огурец", "горошек", "колбаса", "яйцо", "майонез")
    println("Введите ингридиент:")
    val userInput = readln()
    var found = false

    for(i in ingridientsOfSalat){
        if(i == userInput) {
            found = true
        }
    }
    if(found)
        println("Ингридиент $userInput есть в списке")
    else println("Такого ингридиента в рецепте нет!")
}