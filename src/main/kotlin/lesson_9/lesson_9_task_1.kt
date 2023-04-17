package lesson_9

fun main() {

    val list: List<String> = listOf("колбаса", "яйцо", "майонез", "картофель")

    println("В рецепте есть следующие ингредиенты:")

    list.forEach {
        println(it)
    }
}