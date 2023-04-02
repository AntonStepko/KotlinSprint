package lesson_5

fun main() {

    println("Введите два числа от 1 до 100")
    val inputData1 = readLine()!!.toInt()
    val inputData2 = readLine()!!.toInt()

    if ((inputData1 == WIN_NUMBER_1 && inputData2 == WIN_NUMBER_2) ||
        (inputData1 == WIN_NUMBER_2 && inputData2 == WIN_NUMBER_1))
        println("Поздравляем! Вы выиграли главный приз!")

    else if((inputData1 == WIN_NUMBER_1 || inputData2 == WIN_NUMBER_2) ||
            (inputData1 == WIN_NUMBER_2 || inputData2 == WIN_NUMBER_1))
        println("Вы выиграли утешительный приз!")

    else println("Неудача! Крутите барабан!")

    println("Для победы нужны были цифры 12 и 63")

}
const val WIN_NUMBER_1 = 12
const val WIN_NUMBER_2 = 63
