package lesson_11

class Contact (
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
    var iCloud: String? = null,
    val contacts: List<String>,
) {

    fun getEmailForICloud() {
        iCloud = email
    }

    fun getFunctionsFaseTime() {
        faceTime = listOf(videoCall, call)
    }
}

fun main() {

    val contact = Contact(
        avatar = "Мышь",
        firstName = "Антон",
        secondName = "Степко",
        sms = "Отправить сообщение",
        call = "Звонок",
        videoCall = "Видео звонок",
        email = "mail@mail.ru",
        cellNumber = "8 (999) 999-42-42",
        homeNumber = "8 (999) 888-42-42",
        faceTime = listOf(),
        iCloud = " ",
        contacts = listOf("жена", "подруга", "подруга"),

    )
}