package lesson_10

fun main() {
    println("Введите логин:")
    val userLogin = readln()
    println("Введите пароль:")
    val userPassword = readln()
    val result = checkingPasswordLength(userLogin, userPassword)

    if (result) {
        println("Логин или пароль недостаточно длинные")
    } else println("Добро пожаловать!")
}

fun checkingPasswordLength (login: String, password: String): Boolean {
    return (login.length < 4) || (password.length < 4)
}


