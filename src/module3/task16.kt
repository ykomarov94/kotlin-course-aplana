package module3

fun main(){
    println(4.0.sqrt())
    println(3.0.sqrt())
}

fun Double.sqrt() : Double = kotlin.math.sqrt(this)