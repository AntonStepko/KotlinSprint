package lesson_10

fun main() {
    println("Придумайте логин (длина должна быть более 4 символов):")
    var registeredLogin = readln()
    var result = checkLoginLength(registeredLogin)
    while (!result) {
        println("Логин недостаточно длинный")
        registeredLogin = readln()
        result = checkLoginLength(registeredLogin)
    }

    val generatedPassword = generatePassword()
    printWithDelay("Ваш пароль: $generatedPassword")

    printWithDelay("Введите логин и пароль:")
    var inputLogin = readln()
    var inputPassword = readln()

    while ((registeredLogin != inputLogin) || (inputPassword != generatedPassword)) {
        println("Неверный логин или пароль, введите заново:")
        inputLogin = readln()
        inputPassword = readln()
    }

    do {
        val sms = generateSms()
        println("Ваш код: $sms")

        printWithDelay("Введите код:")
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

fun printWithDelay(message: String) {
    Thread.sleep(DELAY_TIME)
    println(message)
}

const val DELAY_TIME: Long = 1500