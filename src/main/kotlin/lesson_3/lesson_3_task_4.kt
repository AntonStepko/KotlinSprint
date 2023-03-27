package lesson_3
fun main() {

    var moveFrom: String
    moveFrom = "E"
    var moveTo: String
    moveTo = "E"

    var numFrom: Int
    numFrom = 2
    var numTo: Int
    numTo = 4

    var step: Int
    step = 1

    println("$moveFrom$numFrom-$moveTo$numTo; ход $step")

    moveFrom = "D"
    moveTo = "D"
    numFrom = 2
    numTo = numFrom + 1
    step += step

    println("$moveFrom$numFrom-$moveTo$numTo; ход $step")

}