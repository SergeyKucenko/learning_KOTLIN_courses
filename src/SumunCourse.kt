fun main() {

    val seconds = readln().toInt()
    val hours = seconds / 3600
    val secondsForMinuts = seconds % 3600
    val minutes = secondsForMinuts / 60
    val leftSeconds = secondsForMinuts % 60


    println(" $hours часы  : $minutes минуты : $leftSeconds секунды ")



}