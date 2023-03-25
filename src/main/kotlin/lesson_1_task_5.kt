fun main() {

    var secInCos = 6480                          //кол-во секунд проведенных в космосе

    val minutes = secInCos / 60             //кол-во минут проведенных в космосе

    //println(minutes)

     secInCos = 0

    println("%03d:%02d".format(minutes,secInCos))
}