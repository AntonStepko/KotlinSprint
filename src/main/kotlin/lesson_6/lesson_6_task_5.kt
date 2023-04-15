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
    var counter = 1

      while (newUserLogin != userLogin || newUserPass != userPass) {
          println("Неправильный логин или пароль, введите заново")
          userLogin = readln()
          userPass = readln()
      }

      while (counter <= 3) {
          counter++
          val ranNum1 = (1..9).random()
          val ranNum2 = (1..9).random()
          val sum = "${ranNum1 + ranNum2}"
          println("Докажите, что Вы не бот. Решите пример: $ranNum1 + $ranNum2 = ..")
          val userAnswer = readln()

          if (userAnswer == sum) {
              println("Добро пожаловать!")
              return
          } else println("Ответ неверный!")
      }
    println("Доступ запрещен!")
}