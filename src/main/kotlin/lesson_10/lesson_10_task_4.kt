package lesson_10

fun main() {
    val round = holdRound()
    println("Вы выиграли $round партий.")
}

fun throwRandomize(): Pair<Int, Int> {

    val cube1 = (1..6).random()
    val cube2 = (1..6).random()
    return Pair(cube1, cube2)
}

fun holdRound(): Int {
    var round = 0

    do {
        val (cubeOfHuman1, cubeOfHuman2) = throwRandomize()
        val (cubeOfComp1, cubeOfComp2) = throwRandomize()
        val humanResult = cubeOfHuman1 + cubeOfHuman2
        val compResult = cubeOfComp1 + cubeOfComp2
        println("Ваш бросок:")
        println("Ваш результат $cubeOfHuman1 и $cubeOfHuman2 \n")
        Thread.sleep(1500)

        println("Бросок компьютера:")
        println("Результат компьютера $cubeOfComp1 и $cubeOfComp2 \n")
        Thread.sleep(1500)

        if (humanResult > compResult) {
            round++
            println("Победил мешок с костями! \n")
        } else if (humanResult == compResult) {
            println("Ничья!")
        } else println("Победила бездушная машина! \n")

        println("Хотите бросить кости еще раз Введите Да или Нет?")
        val userAnswer = readln()

    } while (userAnswer.equals("Да", ignoreCase = true))
    return round
}