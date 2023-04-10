package lesson_6

fun main() {

    println("Зарегистрируйтесь")
    println("Придумайте логин")
    val newUserLogin = readln()

    println("Придумайте пароль")
    val newUserPass = readln()

    println("Введите логин и пароль")
    var userLogin = readln()
    var userPass = readln()

    if(newUserLogin != userLogin || newUserPass != userPass)
        do {
        println("Неправильный логин или пароль, введите заново")
        userLogin = readln()
        userPass = readln()
    } while(newUserLogin != userLogin || newUserPass != userPass)

        println("Авторизация прошла успешно")
}

