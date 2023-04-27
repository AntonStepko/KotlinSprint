package lesson_9

fun main() {

    val listOfPortion = mutableListOf(2, 50, 15)
    val listOfIngrid = listOf("яиц", "молока", "сливочного масла")
    val listOfUnit = listOf("шт", "мл", "гр")

    println("Какое колличество порций")
    val userPortion = readln().toInt()
    val listOfPortion2 = listOfPortion.map {
        it * userPortion
    }
    println("На $userPortion порций вам понадобится:")
    for (i in listOfPortion2.indices) {
        println("${listOfIngrid[i]} - ${listOfPortion2[i]} ${listOfUnit[i]}")
    }

}