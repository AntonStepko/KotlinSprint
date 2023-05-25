package lesson_11

class FavoriteContact(
    val userName: List<String>,
)

class Contact(
    val avatar: String,
    val firstName: String,
    val secondName: String,
    val sms: String,
    val call: String,
    val videoCall: String,
    var email: String,
    val cellNumber: String,
    val homeNumber: String,
    var faceTime: List<String>,
    var iCloud: String = "",
    val contacts: List<String>,
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

    fun getEmailForICloud() {
        iCloud = email
    }

    fun getFunctionsFaseTime() {
        faceTime = listOf(videoCall, call)
    }
}

fun main() {

    val favoriteContact = FavoriteContact(
        userName = listOf("жена", "подруга", "подруга"),
    )

    val contact = Contact(
        avatar = "Мышь",
        firstName = "Антон",
        secondName = "Степко",
        sms = "",
        call = "",
        videoCall = "",
        email = "mail@mail.ru",
        cellNumber = "8 (999) 999-42-42",
        homeNumber = "8 (999) 888-42-42",
        faceTime = listOf(),
        iCloud = "",
        contacts = favoriteContact.userName

    )

}