package lesson_7

fun main() {

    val data = ('a'..'z') + ('A'..'Z') + (0..9)
    println("Введите длину пароля:")
    val lenghtPassword = readln().toInt()
    val password = List(lenghtPassword) { data.random() }.joinToString("")
    println("Ваш пароль:")
    println(password)

}