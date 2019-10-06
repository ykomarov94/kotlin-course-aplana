package module2

fun main(){
    val employees: Map<Int, String> = mapOf(
        1 to "Александрова А.А.",
        2 to "Борисов Б.Б.",
        3 to "Васильев В.В.",
        4 to "Григорьев Г.Г.",
        5 to "Денисов Д.Д.",
        6 to "Евгешина Е.Е.",
        666 to "Очень злой заказчик"
        )

    while(true){
        println("\nВведите номер рабочего места")
        val input = readLine()?.toIntOrNull()

        if ((input == null) or (input!! <= 0)){
            println("Некорректный ввод. Ожидалось натуральное число")
            continue
        }

        println("Сейчас поищем...")

        if (employees.containsKey(input)){
            println("В справочнике указано, что место $input занимает ${employees[input]}")
        }
        else{
            println("К сожалению, никаких записей в справочнике не нашлось. Возможно, такого рабочего места " +
                    "не существует или оно свободно... Или же кто-то забыл обновить информацию после переезда, " +
                    "ну Вы понимаете, как это бывает")
        }
    }

}
