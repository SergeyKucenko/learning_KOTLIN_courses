fun main() {

    val egs = "4 яйца"
    val klukva = "100 грамм клюквы"
    val muka = "500 грамм муки"

    val egsValue = readln()
    val klukvaValue = readln()
    val mukaValue = readln()


    val result = egsValue == egs && klukva == klukvaValue && muka == mukaValue

    println(result)

}