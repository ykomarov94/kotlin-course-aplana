package module3

fun main(){
    val lambda = {input: Array<String> ->
        for(str in input)
            println(str)
        println()
    }

    lambda(arrayOf("x","y","z"))
    lambda(arrayOf())
    lambda(arrayOf("a"))
}