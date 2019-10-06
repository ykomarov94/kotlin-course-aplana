package module2

import kotlin.math.roundToInt

fun main(){
    println("Пожалуйста, введите сумму вклада")
    val initialAmount = readLine()!!.toDouble()
    if (!checkInput(initialAmount)) return

    println("Спасибо. А теперь введите количество месяцев, на которые хотите вложить деньги")
    val duration = readLine()!!.toDouble()
    if (!checkInput(duration)) return

    println("Замечательно! Сколько процентов годовых Вам обещает банк?")
    val rate = readLine()!!.toDouble() / 100
    if (!checkInput(rate)) return

    var currentAmount = initialAmount

    println("\nОжидаемое состояние счёта через n месяцев:\n")
    println("n\tПроценты\tСумма на вкладе\n" +
            "-----------------------------")
    for(i in 1..duration.roundToInt()) {
        val delta = currentAmount * rate / 12.0
        currentAmount += delta
        println("$i\t" + "+%.2f\t\t".format(delta) + "%.2f".format(currentAmount))
    }

    println("\nЗа ${duration.roundToInt()} месяцев Вы заработаете " + "%.2f".format(currentAmount - initialAmount) +
            ", что составляет " + "+%.2f".format(100 * (currentAmount/initialAmount - 1)) + "% от изначальной суммы")
}

fun checkInput(initialAmount: Double): Boolean {
    return if (initialAmount <= 0.0) {
        println("Значение не может быть отрицательным! Завершение работы программы")
        false
    }
    else true
}