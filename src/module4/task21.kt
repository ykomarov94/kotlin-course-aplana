package module4

fun main(){
    val boeing747 = Boeing747()
    println(boeing747.FuelConsumption)
    println(boeing747.MaxPassengers)

    // При попытке создать абстрактный класс возникает ошибка
    // val aicraftError = Aircraft(0, 0.0, 0.0);
}