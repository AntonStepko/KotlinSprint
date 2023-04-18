package lesson_9

fun main() {

    val list = mutableListOf("огурец", "помидор", "лук")

    println("В рецепте есть базовые ингредиенты:")
    list.forEach {
        println(it)
    }
    println("Желаете добавить еще?")
    val userAnswer = readln()

    if (userAnswer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val newIngrid = readln()
        list.add(newIngrid)

        println("Теперь в рецепте есть следующие ингредиенты:")

        list.forEach {
            println(it)
        }
    }
}