package lesson_10

fun main() {

    println("Введите длину пароля")
    val lengthPassword = readln().toInt()
    val password = generatePassword(lengthPassword)
    println("Ваш пароль: $password")
}

fun generatePassword(lengthPassword: Int): String {

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

fun getNumber(): Int {
    return (0..9).random()
}

fun getChar(): Char {
    return (32..47).random().toChar()
}