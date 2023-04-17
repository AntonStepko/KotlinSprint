package lesson_7

fun main() {

    val data = ('a'..'z') + ('A'..'Z') + (0..9)
    println("Введите длину пароля:")
    val lengthPassword = readln().toInt()
    val password = List(lengthPassword) { data.random() }.joinToString("")
    println("Ваш пароль:")
    println(password)

}