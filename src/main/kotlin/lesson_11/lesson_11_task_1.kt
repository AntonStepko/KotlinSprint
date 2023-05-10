package lesson_11

fun main() {

    val user1 = User(
            uid = "@avstepko",
            login = "stepkoanton",
            password = "Qwerty123",
            email = "stepkoanton@gmail.com",
    )

    val user2 = User(
            uid = "@ievetrov",
            login = "vetrovivan",
            password = "1q2w3e4r5t",
            email = "ivanvetrov@yandex.ru",
    )

    println(user1.uid)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()
    println(user2.uid)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}