package lesson_4

fun main() {

    println ("есть ли повреждения корпуса? Напишите true или false")
    val isHullDamageNow = readln().toBoolean()

    println ("текущая численность экипажа?")
    val isCrewNow = readln().toInt()

    println ("текущее количество ящиков провизии?")
    val isProvisionsBoxesNow = readln().toInt()

    println ("благоприятные ли метеоусловия? Напишите true или false")
    val isWeatherNow: Boolean = readln().toBoolean()

    val result: Boolean = ((isHullDamageNow == NO_HULL_DAMAGE) &&
                          (isCrewNow >= CREW_MIN) && (isCrewNow < CREW_RECOMMENDED) &&
                          (isProvisionsBoxesNow >= PROVISION_BOXES_FROM) &&
                          (isWeatherNow == GOOD_WEATHER)) ||
                          ((isHullDamageNow == SMALL_HULL_DAMAGE) &&
                          (isCrewNow == CREW_RECOMMENDED) &&
                          (isProvisionsBoxesNow >= PROVISION_BOXES_FROM) &&
                          (isWeatherNow == GOOD_WEATHER))

    println(result)

}

const val NO_HULL_DAMAGE: Boolean = true
const val SMALL_HULL_DAMAGE: Boolean = true
const val CREW_MIN = 55
const val CREW_RECOMMENDED = 70
const val PROVISION_BOXES_FROM = 50
const val GOOD_WEATHER = true