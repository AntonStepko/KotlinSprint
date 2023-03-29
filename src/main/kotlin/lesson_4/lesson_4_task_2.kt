package lesson_4

fun main(){

    val weight1 = 20
    val weight2 = 50
    val amount1 = 80
    val amount2 = 100

    println("Average для груза с весом $weight1 кг и объемом $amount1 л: " +
            "${(weight1 >= WEIGHT_FROM) && (weight1 <= WEIGHT_UP_TO) && (amount1 < MAX_AMOUNT)}" +
            "\nAverage для груза с весом $weight2 кг и объемом $amount2 л: " +
            "${(weight2 >= WEIGHT_FROM) && (weight2 <= WEIGHT_UP_TO) && (amount2 < MAX_AMOUNT)}")

}

const val WEIGHT_FROM = 35
const val WEIGHT_UP_TO = 100
const val MAX_AMOUNT = 100