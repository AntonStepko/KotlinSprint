fun main() {

    val secInCos = 6480                          //кол-во секунд проведенных в космосе

    val minutes = secInCos / 60              //кол-во минут проведенных в космосе
    val seconds = secInCos % 60              //кол-во секунд в остатке


    println("%02d:%02d".format(minutes,seconds))
}