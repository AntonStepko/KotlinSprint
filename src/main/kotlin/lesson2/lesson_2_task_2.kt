package lesson2

fun main() {
//кол-во сотрудников
    val employees: Int = 50
//зп сотрудников
    val employessPay: Int = 30000
//кол-во стажеров
    val interns: Int = 30
//зп стажеров
    val internsPay: Int = 20000

//расходы на зп сотрудников
    val fullEmployeesPay = employees * employessPay

//общие расходы зп
    val fullPay = (interns * internsPay) + fullEmployeesPay

//средня зп всех сотрудников
    val middlePay = fullPay / (employees + interns)

    println(fullEmployeesPay)
    println(fullPay)
    println(middlePay)


}