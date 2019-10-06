package module3

fun main(){
    val employees = arrayOf("Александрова А.А.", "Борисов Б.Б.", "Викторов В.В.", "Геннадьев Г.Г.", "Денисов Д.Д.")
    val moreEmployees = arrayOf(*employees, "Евгешина Е.Е.", "Жак Ж.Ж.", "Зигмундов З.З.", "Иванов И.И")

    println(countEmployees(*employees))
    println(countEmployees(*moreEmployees))
}

fun countEmployees(vararg employees: String): Int{
    // return employees.count()
    var result = 0
    for(e in employees)
        result++

    return result
}