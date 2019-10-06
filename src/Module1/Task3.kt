package Module1

fun main() {
    val five: Char = '5'

    with (five){
        val fiveString: String = toString()
        val fiveByte: Byte = toByte()
        val fiveShort: Short = toShort()
        val fiveInt: Int = toInt()
        val fiveDouble: Double = toDouble()
        val fiveFloat: Float = toFloat()
        val fiveLong: Long = toLong()

        println("String: $fiveString\nByte: $fiveByte\nShort: $fiveShort\n" +
                "Int: $fiveInt\nDouble: $fiveDouble\nFloat: $fiveFloat\nLong: $fiveLong")
    }
}