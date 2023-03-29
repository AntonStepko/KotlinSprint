package lesson_4

fun main() {

    var bookingToday = 13
    var bookingTomorrow = 13 - 4

    var comparisonResult1: Boolean = (bookingToday > NUMBER_OF_TABLES)
    var comparisonResult2: Boolean = (bookingTomorrow < NUMBER_OF_TABLES)

    println("Доступность столиков на сегодня: $comparisonResult1\nДоступность столиков на завтра: $comparisonResult2")

}

const val NUMBER_OF_TABLES = 13
