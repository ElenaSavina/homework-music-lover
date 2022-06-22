package ru.netology

fun main() {
    val amountBuy = 11_000_00
    val discount = 100_00
    val isRegularUser = true

    val result =
        if (amountBuy > 10_000_00) amountBuy - (amountBuy * 5 / 100)
        else if (amountBuy > 1000_00) amountBuy - discount
        else amountBuy

    val totalPrice = if (isRegularUser) result - (result / 100) else result
    println("Итоговая стоимость покупки: ${totalPrice / 100} руб. ${totalPrice % 100} коп.")

}