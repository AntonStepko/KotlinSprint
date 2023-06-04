package lesson_11

class Room(
    val cover: Int,
    val title: String,
)

class Member(
    val id: Int,
    val avatar: List<String>,
    val nickname: List<String>,
) {

    fun speakStatus() {
        println("разговаривает, микрофон выключен, пользователь заглушен")
    }

    fun getList(): List<String> =
        avatar.zip(nickname) { avatar, nickname -> "$avatar - $nickname" }
}

fun main() {

    val room1 = Room(
        cover = 1,
        title = "Чтение книг",
    )

    val room2 = Room(
        cover = 2,
        title = "Ремонт авто",
    )

    val member1 = Member(
        id = 1,
        avatar = listOf("Лев", "Тигр", "Смайл"),
        nickname = listOf("Сергей", "Дмитрий", "Игорь"),
    )

    val member2 = Member(
        id = 2,
        avatar = listOf("Луна", "Город", "Кошка"),
        nickname = listOf("Алексей", "Петр", "Елена"),
    )

    println(member1.getList()[2])
    member1.speakStatus()
}