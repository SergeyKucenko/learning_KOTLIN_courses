fun main() {

    val temperature = -32
    val windSpeed = 8

    if (temperature < -40 || temperature < -34 && windSpeed > 7) { // температура меньше -40 или температура меньше 34 со скорость ветра больше 7?
        print("Сегодня учатся дома: 1-11 классы") // Условие ложно
    }
    else if(temperature < -35 || temperature < -30 && windSpeed > 7) {
        print("Сегодня учатся дома: 1-9 классы") // Условие истинно, выполняем блок кода в фигурных скобках
    }
    else if(temperature < -30 || temperature < -26 && windSpeed > 7) {
        print("Сегодня учатся дома: 1-4 классы") // Условие не выполнится, т.к. выполнилось предыдущее
    }
    else {
        print("Пора в школу") // Условие не выполнится
    }

}