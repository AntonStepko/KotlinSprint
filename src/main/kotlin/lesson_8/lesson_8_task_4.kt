package lesson_8

fun main() {
    println("Список ингридиентов:")
    val arrayOfIngridients = arrayOf("огурец", "колбаса", "яйцо", "картофель", "майонез")
    for (i in arrayOfIngridients) {
        println(i)
    }

    println("Какой ингридиент вы хотите заменить?")
    val changeIngridient = readln()
    val index = arrayOfIngridients.indexOf(changeIngridient)

    if (changeIngridient in arrayOfIngridients) {
        println("Какой ингридиент вы хотите добавить?")
        val newIngridient = readln()
        arrayOfIngridients[index] = newIngridient

        println("Готово! Вы сохранили следующий список:")
        for (i in arrayOfIngridients) {
            println(i)
        }
    } else println("Этого ингридиента нет в списке!")
}