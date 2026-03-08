fun main() {


    val valuePowerCar = readln().toInt()




    if (valuePowerCar <= 100 ) {
        println("Вид ТС: легковой автомобиль")
        println("Мощность двигателя: $valuePowerCar л.с.")
        println("Налоговая ставка: 10 руб./л.с.")
        println("Сумма налога: ${valuePowerCar * 10} руб.")

    } else if (valuePowerCar > 100 && valuePowerCar <= 150) {
        println("Вид ТС: легковой автомобиль")
        println("Мощность двигателя: $valuePowerCar л.с.")
        println("Налоговая ставка: 34 руб./л.с.")
        println("Сумма налога: ${valuePowerCar * 34} руб.")
    } else if (valuePowerCar > 150 && valuePowerCar <= 200) {
        println("Вид ТС: легковой автомобиль")
        println("Мощность двигателя: $valuePowerCar л.с.")
        println("Налоговая ставка: 49 руб./л.с.")
        println("Сумма налога: ${valuePowerCar * 49} руб.")
    } else if (valuePowerCar > 200 && valuePowerCar <= 250) {
        println("Вид ТС: легковой автомобиль")
        println("Мощность двигателя: $valuePowerCar л.с.")
        println("Налоговая ставка: 75 руб./л.с.")
        println("Сумма налога: ${valuePowerCar * 75} руб.")
    } else if (valuePowerCar >= 250) {
        println("Вид ТС: легковой автомобиль")
        println("Мощность двигателя: $valuePowerCar л.с.")
        println("Налоговая ставка: 150 руб./л.с.")
        println("Сумма налога: ${valuePowerCar * 150} руб.")
    }

}

