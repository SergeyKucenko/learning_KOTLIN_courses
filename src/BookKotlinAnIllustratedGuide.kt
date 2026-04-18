fun main() {


//    ФУНКЦИИ стр 33


//    val radius = readln().toDouble();
//
//    val nomNumber = circumference(radius)
//    println("Окружность равна: $nomNumber")
//
//
//}
//
//
//
//fun circumference(radius: Double): Double {
//    val pi = 3.14
//    return 2 * pi * radius
//}

    var input = readln().toInt();

    val resulte = test(10, age=input);
    println(resulte)
}

fun test (data:Int = 5, age : Int):Int {

    val resultat = data * age

    return resultat
}
