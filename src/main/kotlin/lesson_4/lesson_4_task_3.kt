package lesson_4

fun main() {

    val userWether: String = "солнечная погода"
    val userTent: String = "тент раскрыт"
    val userWetness: String = "влажность 20"
    val userSeason: String = "время года зима"

    val result: Boolean = (userWether == WEATHER) && (userTent == TENT) &&
                          (userWetness == WETNESS) && (userSeason == SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}

const val WEATHER = "солнечная погода"
const val TENT = "тент раскрыт"
const val WETNESS = "влажность 20"
const val SEASON = "время года не зима"