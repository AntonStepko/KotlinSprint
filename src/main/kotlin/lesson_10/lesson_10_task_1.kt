package lesson_10

fun main() {

    val (cubeOfHuman1, cubeOfHuman2) = throwRandomizer()
    val (cubeOfComp1, cubeOfComp2) = throwRandomizer()
    val humanResult = cubeOfHuman1 + cubeOfHuman2
    val compResult = cubeOfComp1 + cubeOfComp2

    println("Ваш бросок:")
    println("Ваш результат $cubeOfHuman1 и $cubeOfHuman2 \n")
    Thread.sleep(1500)

    println("Бросок компьютера:")
    println("Результат компьютера $cubeOfComp1 и $cubeOfComp2 \n")
    Thread.sleep(1500)

    if (humanResult > compResult) {
        println("Победил мешок с костями!")
    } else println("Победила бездушная машина!")
}
fun throwRandomizer(): Pair<Int, Int> {

    val cube1 = (1..6).random()
    val cube2 = (1..6).random()
    return Pair(cube1, cube2)
}