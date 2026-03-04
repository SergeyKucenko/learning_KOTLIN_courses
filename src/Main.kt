
fun main() {



    val cargo:Float = 11000.00

    var intemInKilo:Float = cargo / 1000.00 // перевод в kg

    var survivingCargo:Float = (intemInKilo / 100) *30   // вычисление остаточного груза

    println("Вес уцелевшего груза: " + survivingCargo + " тонн")
}


