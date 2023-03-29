package lesson_4

fun main () {

    val trainingDay = 5

    val exerciseForHands: Boolean = (trainingDay % 2 == EXERCISE_FOR_HANDS)
    val exerciseForLeg: Boolean = (trainingDay % 2 == EXERCISE_FOR_LEG)
    val exerciseForBack: Boolean = (trainingDay % 2 == EXERCISE_FOR_BACK)
    val exerciseForPress: Boolean = (trainingDay % 2 == EXERCISE_FOR_PRESS)

    val result = """
        Упражнения для рук:    $exerciseForHands
        Упражнения для ног:    $exerciseForLeg
        Упражнения для спины:  $exerciseForBack
        Упражнения для пресса: $exerciseForPress
      
        """.trimIndent()

   println(result)

}

const val EXERCISE_FOR_HANDS = 1
const val EXERCISE_FOR_LEG = 0
const val EXERCISE_FOR_BACK = 1
const val EXERCISE_FOR_PRESS = 0