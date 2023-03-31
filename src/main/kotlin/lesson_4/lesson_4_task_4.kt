package lesson_4

fun main () {

    val trainingDay = 5
    val isDayEven = trainingDay % 2 == 0

    val exerciseForHands: Boolean = !isDayEven
    val exerciseForLeg: Boolean = isDayEven
    val exerciseForBack: Boolean = !isDayEven
    val exerciseForPress: Boolean = isDayEven

    val result = """
        Упражнения для рук:    $exerciseForHands
        Упражнения для ног:    $exerciseForLeg
        Упражнения для спины:  $exerciseForBack
        Упражнения для пресса: $exerciseForPress
      
        """.trimIndent()

   println(result)

}
