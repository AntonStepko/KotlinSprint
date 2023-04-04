package lesson_5

fun main() {

    println("Введите два числа от 1 до 100")
    val inputData1 = readln().toInt()
    val inputData2 = readln().toInt()
    val ran1 = (1..100).random()
    val ran2 = (1..100).random()

    if ((inputData1 == ran1 && inputData2 == ran2) ||
        (inputData1 == ran2 && inputData2 == ran1))
        println("Поздравляем! Вы выиграли главный приз!")

    else if((inputData1 == ran1 || inputData2 == ran2) ||
            (inputData1 == ran2 || inputData2 == ran1))
        println("Вы выиграли утешительный приз!")

    else println("Неудача! Крутите барабан!")

    println("Для победы нужны были цифры $ran1 и $ran2")

}


