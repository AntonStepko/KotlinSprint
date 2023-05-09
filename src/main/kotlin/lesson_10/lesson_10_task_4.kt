package lesson_10

fun main() {

    var round = 0

    do {
        println("Ваш бросок:")
        val (cubeOfHuman1, cubeOfHuman2) = throwRandomize()
        println("Ваш результат $cubeOfHuman1 и $cubeOfHuman2 \n")
        Thread.sleep(1500)

        println("Бросок компьютера:")
        val (cubeOfComp1, cubeOfComp2) = throwRandomize()
        println("Результат компьютера $cubeOfComp1 и $cubeOfComp2 \n")
        Thread.sleep(1500)

        val sumCubesHuman = cubeOfHuman1 + cubeOfHuman2
        val sumCubesComp = cubeOfComp1 + cubeOfComp2

//        val compareResult = isHumanWin(sumCubesHuman, sumCubesComp)

        when (compareResult(sumCubesHuman, sumCubesComp)) {
            true -> {
                println("Победил мешок с костями! \n")
                round++
            }

            null -> {
                println("Ничья!")
            }

            else -> {
                println("Победила бездушная машина! \n")
            }
        }
        println("Хотите бросить кости еще раз Введите Да или Нет?")
        val userAnswer = readln()

    } while (userAnswer.equals("Да", ignoreCase = true))
    println("Вы выиграли $round партий.")
}

fun throwRandomize(): Pair<Int, Int> {

    val cube1 = (1..6).random()
    val cube2 = (1..6).random()
    return Pair(cube1, cube2)
}

fun compareResult(humanResult: Int, compResult: Int): Boolean? {

    if (humanResult != compResult)
        return humanResult > compResult
    return null
}