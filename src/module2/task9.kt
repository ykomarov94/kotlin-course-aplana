package module2

fun main(){
    val countries: Array<Array<String>> = arrayOf(
        arrayOf("Австрия", "Болгария", "Вьетнам", "Гренландия", "Джибути"),
        arrayOf("Вена","София", "Ханой", "Нуук", "Джибути"),
        arrayOf("Евро (EUR)","Болгарский лев (BGN)", "Вьетнамский донг (VND)", "Датская крона (DKK)", "Франк Джибути (DJF)")
    )

    val padCountry = 16
    val padCapital = 12

    val header = "${"Страна".padEnd(padCountry, ' ')}${"Столица".padEnd(padCapital, ' ')}Валюта"

    println(header)
    println("-".repeat(header.length + 5))

    for(c in countries[0].indices) {
        println(
            countries[0][c].padEnd(padCountry, ' ') +
            countries[1][c].padEnd(padCapital, ' ') +
            countries[2][c]
        )
    }
}
