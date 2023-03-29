package lesson_3

fun main() {

    var moveFrom = "E2"
    var moveTo = "E4"
    var step = 1

    println("$moveFrom-$moveTo;$step")

    moveFrom = "D2"
    moveTo = "D3"
    step += step

    println("$moveFrom-$moveTo;$step")

}