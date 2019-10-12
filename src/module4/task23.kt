package module4

fun main(){
    data class Auto(val model: String, val color: String, val regNumber: String)

    val autos = arrayOf(
        Auto("BMW X5", "Черный", "X666XX 97"),
        Auto("Lada Kalina", "Желтый", "C020PM 177")
        )

    for(auto in autos)
        println(auto.toString())
}