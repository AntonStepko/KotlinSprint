package lesson_6

fun main() {

    println("Угадайте число от 1 до 9. У вас 5 попыток!")
    val randomNum = (1..9).random()
    var counter = 1

    while (counter <= 5) {
        val inputData = readln().toInt()
        counter++

        if(inputData == randomNum){
            println("Это была великолепная игра!")
        }
    }
    println("Было загадано число $randomNum")
}













