package lesson_5

fun main() {

    println("Введите логин")
    val userLogin = readLine()!!.toString()

    if(userLogin == REGISTERED_LOGIN)
        else println("Зарегистрируйтесь")

    println("Введите пароль")
    val userPassword = readLine()!!.toString()

    if(userPassword == REGISTERED_PASSWORD) println("С возвращением!")
        else println("Ошибка авторизации")

}
const val REGISTERED_LOGIN = "Batman"
const val REGISTERED_PASSWORD = "password"
