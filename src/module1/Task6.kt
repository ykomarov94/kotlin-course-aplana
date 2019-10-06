package module1

fun main() {
    println("input a")
    val a = readLine()!!.toDouble()
    println("input b")
    val b = readLine()!!.toDouble()
    val cmp = a > b

    println("inequality $a > $b: is $cmp")
}
