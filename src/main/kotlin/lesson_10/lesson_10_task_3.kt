package lesson_10

fun main() {

    println("Введите длину пароля")
    val lengthPassword = readln().toInt()
    val password = generatingOfPassword(lengthPassword)
    println("Ваш пароль: $password")

}

fun generatingOfPassword(lengthPassword: Int): String {

    var result = ""
    while (result.length < lengthPassword) {
        val number = getNumber()
        val char = getChar()
        result = result + number + char
    }
    if (result.length > lengthPassword) {
        result = result.substring(0, lengthPassword)
    }
    return result
}

fun getNumber(): String {
    val number = (0..9).random()
    return number.toString()

}

fun getChar(): String {
    val char = ("\"#$%&'()*+,-. /!").random()
    return char.toString()

}