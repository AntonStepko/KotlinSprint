package lesson_10

fun main() {

    val humanResult = human()
    val computerResult = computer()

    if (humanResult > computerResult) {
        println("Победил мешок с костями!")
    } else println("Победила бездушная машина!")

}

fun human(): Int {
    println("Ваш бросок:")
    val numHuman1 = (1..6).random()
    val numHuman2 = (1..6).random()
    val sumHuman = numHuman1 + numHuman2
    println("Ваш результат $numHuman1 и $numHuman2 \n")
    Thread.sleep(1500)
    return sumHuman
}

fun computer(): Int {
    println("Бросок компьютера:")
    val numComp1 = (1..6).random()
    val numComp2 = (1..6).random()
    val sumComputer = numComp1 + numComp2
    println("Результат компьютера $numComp1 и $numComp2 \n")
    Thread.sleep(1500)
    return sumComputer
}