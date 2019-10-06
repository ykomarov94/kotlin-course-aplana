package module1

fun main(args: Array<String>) {
    var undefinedVariable: Any? = null
    undefinedVariable = 73 // the best number according to dr. Cooper
    val implicitTypedVar = undefinedVariable / 2.5
    // Последняя переменная имеет тип Double:
    println(implicitTypedVar is Double)
}