package lesson_11

class Room (
        val cover: Int,
        val title: String,
        val avatar: List<String>,
        val nickname: List<String>,
) {

    fun speakStatus() {
        println("разговаривает, микрофон выключен, пользователь заглушен")
    }

    fun getList(): List<String> =
            avatar.zip(nickname) {avatar, nickname -> "$avatar - $nickname"}

}
fun main () {

    val room1 = Room(
        cover = 1,
        title = "Чтение книг",
        avatar = listOf("Лев", "Тигр", "Смайл"),
        nickname = listOf("Сергей", "Дмитрий", "Игорь"),
    )

    val room2 = Room(
            cover = 2,
            title = "Ремонт авто",
            avatar = listOf("Луна", "Город", "Кошка"),
            nickname = listOf("Алексей", "Петр", "Елена"),
    )
    val index = 2
    println(room1.getList()[index])
    room1.speakStatus()
}