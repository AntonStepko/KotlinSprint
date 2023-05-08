package lesson_10

fun main() {
    println("Придумайте логин (длина должна быть более 4 символов):")
    val inputLogin = inputLogin()
    do {
        val result = checkLoginLength(inputLogin)
        if (!result) {
            println("Логин недостаточно длинный")
            Thread.sleep(1500)
        }
    } while (!result)

    val generatedPassword = generatePassword()
    println("Ваш пароль: $generatedPassword")
    Thread.sleep(1500)

    println("Введите логин и пароль:")
    var userLogin = readln()
    var userPassword = readln()

    while ((inputLogin != userLogin) || (userPassword != generatedPassword)) {
        println("Неверный логин или пароль, введите заново:")
        userLogin = readln()
        userPassword = readln()
    }

    do {
        val sms = generateSms()
        println("Ваш код: $sms")
        Thread.sleep(1500)
        println("Введите код:")
        val userSms = readln().toInt()
    } while (userSms != sms)

    println("Вы успешно авторизовались!")

}

fun checkLoginLength(login: String): Boolean {
    return login.length >= 4
}

fun generatePassword(): String {
    val data = ('a'..'z') + ('A'..'Z') + (0..9)
    val lengthPassword = 6
    return List(lengthPassword) { data.random() }.joinToString("")
}

fun generateSms(): Int {
    return (1000..9999).random()
}

fun inputLogin(): String = readln()