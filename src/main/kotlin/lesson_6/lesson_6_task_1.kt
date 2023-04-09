package lesson_6

fun main() {

    println("Зарегистрируйтесь")
    println("Придумайте логин")
    var newUserLogin = readln().toString()

    println("Придумайте пароль")
    var newUserPass = readln().toString()

    println("Введите логин и пароль")
    var userLogin = readln().toString()
    var userPass = readln().toString()

    if(newUserLogin != userLogin || newUserPass != userPass)
        do {
        println("Неправильный логин или пароль, введите заново")
        userLogin = readln().toString()
        userPass = readln().toString()
    } while(newUserLogin != userLogin || newUserPass != userPass)

    else (newUserLogin == userLogin && newUserPass == userPass)
    println("Авторизация прошла успешно")

}

