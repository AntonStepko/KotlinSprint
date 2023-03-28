package lesson_3

fun main() {

    var moveFrom = "E2"
    var moveTo = "E4"
    var step = 1

    println("$moveFrom-$moveTo; ход $step")

    moveFrom = "D2"
    moveTo = "D3"
    step += step

    println("$moveFrom-$moveTo; ход $step")

}