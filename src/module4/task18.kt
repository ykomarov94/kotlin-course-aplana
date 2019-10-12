package module4

fun main(){
    // Данные boeing-787-7 взяты с
    // https://www.airlines-inform.ru/commercial-aircraft/Boeing-787.html
    val boeing787 = Aircraft(787, 13600.0, 126200.0)
    println(boeing787.FuelConsumption)
}