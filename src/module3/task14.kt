package module3

fun main(){
    printEmployee("Александров А.А.", "второй заместитель руководителя отдела клининга подземной парковки")
    printEmployee("Борисов Б.Б.", 42, "стажер отдела профориентации неопределившихся кандидатов")
    printEmployee("Васильев В.В.", "замужем", "менеджер по защите от исков, связанных с прояалениями нетолерантности")
    printEmployee("Денисов Д.Д.", 3, "не женат", "сын маминой подруги нашего разработчика")
}

fun printEmployee(name: String, age: Int? = null, maritalStatus: String? = null, position: String){
    print("Познакомьтесь с еще одним нашим сотрудником! ")
    print("Его зовут $name, ")
    if (age != null)
        print("недавно он отпраздновал свое $age-летие, ")
    if (maritalStatus != null)
        print("он $maritalStatus (вдруг это будет Вам интересно), ")
    println("в нашей компании его работа по праву считается одной из самых ответственных: он $position")
}

fun printEmployee(name: String, position: String) = printEmployee(name, null, null, position)
fun printEmployee(name: String, age: Int, position: String) = printEmployee(name, age, null, position)
fun printEmployee(name: String, maritalStatus: String, position: String) = printEmployee(name, null, maritalStatus, position)