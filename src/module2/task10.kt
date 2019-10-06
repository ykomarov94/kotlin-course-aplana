package module2

fun main(){
    val cities: MutableList<String> = mutableListOf()

        while(true){
        println("""
            |Выберите одну из следующих команд:
            |1 - Добавить название города
            |2 - Посмотреть список все добавленных городов
            |3 - Посмотреть список добавленных городов (без повторений)
            |4 - Выход
        """.trimMargin())

        when(readLine()){
            "1" -> {
                println("Введите название города:")
                cities.add(readLine().toString())
            }
            "2" -> {
                println(cities)
            }
            "3" -> {
                println(cities.toSet())
            }
            "4" -> {
                println("До новых встреч!")
                return
            }
            else -> {
                println("Неизвестная команда")
            }
        }
    }
}
