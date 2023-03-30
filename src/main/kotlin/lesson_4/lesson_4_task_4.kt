package lesson_4

fun main () {

    val trainingDay = 5
    val parityDay = trainingDay % 2

    val exerciseForHands: Boolean = (parityDay == IS_ODD_DAY)
    val exerciseForLeg: Boolean = (parityDay == IS_PARITY_DAY)
    val exerciseForBack: Boolean = (parityDay == IS_ODD_DAY)
    val exerciseForPress: Boolean = (parityDay == IS_PARITY_DAY)

    val result = """
        Упражнения для рук:    $exerciseForHands
        Упражнения для ног:    $exerciseForLeg
        Упражнения для спины:  $exerciseForBack
        Упражнения для пресса: $exerciseForPress
      
        """.trimIndent()

   println(result)

}

const val IS_PARITY_DAY = 0
const val IS_ODD_DAY = 1