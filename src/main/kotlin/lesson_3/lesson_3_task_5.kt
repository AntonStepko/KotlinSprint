package lesson_3

fun main() {

    val motion = "D2-D4;0"
    val data = motion.split("-",";")

    val moveFrom = data[0]
    val moveTo = data[1]
    val step = data[2]

    println(moveFrom)
    println(moveTo)
    println(step)

}