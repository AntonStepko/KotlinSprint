package lesson_11

class FavoriteContact(
    val id: Int,
    val userName: String,
)

class Contact(
    val id: Int,
    val avatar: String,
    val firstName: String,
    val secondName: String,
    val cellNumber: String,
    val homeNumber: String,
    var iCloud: String,
    val favoriteContacts: List<FavoriteContact>,
) {

    fun sendMessage() {
        println("Отправить сообщение")
    }

    fun makeCall() {
        println("Совершить звонок")
    }

    fun makeVideoCall() {
        println("Совершить видео звонок")
    }

    fun sendEmail() {
        println("Отправить почту")
    }

    fun makeFaseTimeCall() {
        println("Позвонить по Face Time")
    }

    fun makeFaceTimeVideoCall() {
        println("Совершить видео звонок по Face Time")
    }
}

fun main() {

    val favoriteContact1 = FavoriteContact(
        id = 1,
        userName = "жена",
    )

    val favoriteContact2 = FavoriteContact(
        id = 2,
        userName = "подруга",
    )

    val favoriteContact3 = FavoriteContact(
        id = 3,
        userName = "подруга",
    )

    val contact = Contact(
        id = 1,
        avatar = "Мышь",
        firstName = "Антон",
        secondName = "Степко",
        cellNumber = "8 (999) 999-42-42",
        homeNumber = "8 (999) 888-42-42",
        iCloud = "mail@mail.ru",
        favoriteContacts = listOf(favoriteContact1, favoriteContact2, favoriteContact3),
    )
}