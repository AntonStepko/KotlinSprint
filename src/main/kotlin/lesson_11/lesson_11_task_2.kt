package lesson_11

class User(

        val uid: String,
        val login: String,
        var password: String,
        val email: String,
        var bio: String,
) {
    fun outputInfoUser() = """
        Информация о пользоватле
        $uid
        $login
        $password
        $email
        $bio
    """.trimIndent()

    fun getInfoUser(): String {
        println("Напишите о себе:")
        bio = readln()
        return bio
    }

    fun changePassword(): String {
        println("Изменение пароля")
        println("Введите свой пароль:")
        var userPassword = readln()

        while (password != userPassword) {
            println("Пароль введен неверно, попробуйте еще раз:")
            userPassword = readln()
        }
        println("Введите новый пароль:")
        password = readln()
        println("Пароль успешно изменен!")
        return password
    }

    fun sendEmail() {
        println("Уважанмый $login, добро пожаловать!")
    }
}

fun main() {

    val user = User(
            uid = "@avstepko",
            login = "stepkoanton",
            password = "Qwerty123",
            email = "stepkoanton@gmail.com",
            bio = " "
    )

    user.getInfoUser()
    user.changePassword()
    println(user.outputInfoUser())
    user.sendEmail()
}