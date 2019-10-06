package module3

fun main(){
    println(isLeapYear(2000))
    println(isLeapYear(2100))
    println(isLeapYear(2019))
    println(isLeapYear(2020))
}

fun isLeapYear(year: Int): Boolean{
    // https://en.wikipedia.org/wiki/Leap_year#Algorithm
    return (year % 4 == 0) and (year % 100 != 0) or (year % 400 == 0)
}