package lesson_3
fun main() {

    var moveFrom = "E"
    var moveTo = "E"
    var numFrom = 2
    var numTo = 4
    var step = 1

    println("$moveFrom$numFrom-$moveTo$numTo; ход $step")

    moveFrom = "D"
    moveTo = "D"
    numFrom = 2
    numTo = numFrom + 1
    step += step

    println("$moveFrom$numFrom-$moveTo$numTo; ход $step")

}