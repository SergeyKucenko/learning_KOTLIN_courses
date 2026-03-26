fun main() {

//    val year = listOf<Int>(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//
//    print("Введите порядковый номер месяца: ")
//
//    val month = readln().toInt()
//
//    if (month > 12 || month < 1) {
//        println("Введен некоретный месяц")
//    } else {
//        println(year[month -1])
//    }
//


    val year = listOf<String>(
        "Январь",
        "Февраль",
        "Март",
        "Апрель",
        "Май",
        "Июнь",
        "Июль",
        "Август",
        "Сентябрь",
        "Октябрь",
        "Ноябрь",
        "Декабрь"
    )

    val month = readln().toInt()

    if (month > 12 || month < 1) {
        println("Некорректное значение: $month")
    } else {
        println(year[month - 1])
    }


}