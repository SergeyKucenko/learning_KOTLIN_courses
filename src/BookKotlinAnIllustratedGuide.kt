fun main() {


    val saraReview = CoffeeReview(
        "Сара",
        "Очень понравился!", 5
    )
    val tobyReview = CoffeeReview(
        "Тоби",
        "Довольно вкусный!", 4
    )

    val lucyReview = CoffeeReview(
        "Люси", "Буду покупать его снова!", 0
    )


    val kirtyReviews: Int? = null

    fun printReview(review: CoffeeReview) = println("${review.name} поставил(а) ему ${review.stars} stars!")

    println("Последние отзывы о кофе")
    println("-----------------------")
    printReview(saraReview)
    printReview(tobyReview)
    printReview(lucyReview)

//ваолтрыловавыоа
}




//enum class PaymentType {
//    CASH, CHECK, CARD;
//}

//class Payment(val type: PaymentType = PaymentType.CASH)
//
//
//
//fun orderCoffee(payment: Payment): Coffee {
//    val paymentType = payment.type.name.lowercase()
//    println("Благодарим, что поддержали нас $paymentType")
//    return Coffee()
//}