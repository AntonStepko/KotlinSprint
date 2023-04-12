package lesson_7
fun main () {

    while (true){
            val password = (1000..9999).random()
            println("Ваш код авторизации: $password")
            println("Введите код авторизации:")
            val userPassword = readln().toInt()

            if (userPassword == password) {
                println("Добрый день!")
                return
            }
    }
}