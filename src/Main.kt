
fun main() {



    val cargo:Float = 11000F

    var toTonns:Float = cargo /1000F

    var lostCargo:Float = (toTonns / 100F) *30F

    var survivingCargo:Float = toTonns-lostCargo  // вычисление остаточного груза

    println("Вес уцелевшего груза: " + survivingCargo + " тонн")
}


