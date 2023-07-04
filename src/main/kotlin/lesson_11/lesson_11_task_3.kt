package lesson_11

class Room(
    val cover: Int,
    val title: String,
    val members: List<Member>,
)

class Member(
    val id: Int,
    val avatar: String,
    val nickname: String,
) {

    fun speakStatus() {
        println("разговаривает, микрофон выключен, пользователь заглушен")
    }

    fun getNickname() {
        println("$avatar -> $nickname")
    }
}

fun main() {

    val room1 = Room(
        cover = 1,
        title = "Чтение книг",
        members = listOf(),
    )

    val room2 = Room(
        cover = 2,
        title = "Ремонт авто",
        members = listOf(),
    )

    val member1 = Member(
        id = 1,
        avatar = "Лев",
        nickname = "Сергей",
    )

    val member2 = Member(
        id = 2,
        avatar = "Луна",
        nickname = "Алексей",
    )

    member2.getNickname()

    println(member2.avatar)
    member2.speakStatus()
}