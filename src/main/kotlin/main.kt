package ru.netology

fun main() {
    val itemPrice = 100 //стоимость песни
    var itemCount = 150 //количество купленных песен
    val discount = 100 //скидка, если купил на сумму больше 1_000 руб.
    val discountPriceMax = 5 // скидка в процентах, если купил на сумму больше 10_000 руб
    val discountForRegularUser = 1 // скидка в процентах для постоянных пользователей
    val discountStart = 1_000 // сумма больше которой начинается скидка 100 руб
    val discountStartMax = 10_000 // сумма больше которой начинается скидка 5%
    val regularUser = true

    var totalPrice = itemPrice * itemCount //стоимость покупок
    if ((totalPrice > discountStart) && (totalPrice <= discountStartMax)) totalPrice -= discount
    if (totalPrice > discountStartMax) totalPrice -= totalPrice * discountPriceMax / 100
    if (regularUser === true) totalPrice -= totalPrice * discountForRegularUser / 100

    println(totalPrice)
}