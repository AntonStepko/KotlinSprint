package lesson2

import kotlin.math.pow

fun main() {

    val klientSum: Int = 70000
    val procent: Double = 16.7
    val period: Int = 20

    val finalSum: Double = klientSum * (1 + procent / 100).pow(period)

    println("%.3f".format(finalSum))


}