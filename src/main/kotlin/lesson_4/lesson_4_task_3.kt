package lesson_4

fun main() {

    val isWeatherSunny: Boolean = true
    val isTentOpen: Boolean = true
    val isWetness: Int = 20
    val isSeasonWinter: Boolean = false

    val result: Boolean = (isWeatherSunny == IS_WEATHER_SUNNY) && (isTentOpen == IS_TENT_OPEN) &&
                          (isWetness == IS_WETNESS) && (isSeasonWinter == IS_SEASON_WINTER)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}

const val IS_WEATHER_SUNNY = true
const val IS_TENT_OPEN = true
const val IS_WETNESS = 20
const val IS_SEASON_WINTER = true