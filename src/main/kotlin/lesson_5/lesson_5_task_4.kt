package lesson_5

fun main() {

    println("Введите логин")
    val userLogin = readln().toString()

    if(userLogin == REGISTERED_LOGIN) {
        println("Введите пароль")
    } else {
        println("Зарегистрируйтесь!")
    }

    val userPassword = readln().toString()

    if(userPassword == REGISTERED_PASSWORD) {
        println("С возвращением!")
    } else {
        println("Ошибка авторизации")
    }

}
const val REGISTERED_LOGIN = "Batman"
const val REGISTERED_PASSWORD = "password"
