package lesson_10

fun main() {
    lengthPassword()
}

fun lengthPassword() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    if ((login.length < 4) || (password.length < 4)) {
        println("Логин или пароль недостаточно длинные")
    } else println("Добро пожаловать!")
}