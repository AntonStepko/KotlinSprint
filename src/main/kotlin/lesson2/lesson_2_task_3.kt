package lesson2

fun main() {

    val startTrainHr = 9
    val startTrainMin = 39
    val startTimeMin = (9 * 60) + 39                     // 579

    val timeInWay = 457

    val endTimeHr = (timeInWay + startTimeMin) / 60        // 17
    val endTimeMin = (timeInWay + startTimeMin) % 60       // 16

    val finishTime = ("%2d:%2d".format(endTimeHr,endTimeMin))

    println("Время прибытия поезда")
    println(finishTime)
}