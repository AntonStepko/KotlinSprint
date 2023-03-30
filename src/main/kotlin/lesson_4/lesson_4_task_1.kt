package lesson_4

fun main() {

    val freeBookingToday = 0
    val freeBookingTomorrow = 4

    val comparisonResult1: Boolean = (freeBookingToday <= NUMBER_OF_TABLES) && (freeBookingToday != 0)
    val comparisonResult2: Boolean = (freeBookingTomorrow <= NUMBER_OF_TABLES) && (freeBookingTomorrow !=0)

    println("Доступность столиков на сегодня: $comparisonResult1\nДоступность столиков на завтра: $comparisonResult2")

}

const val NUMBER_OF_TABLES = 13
