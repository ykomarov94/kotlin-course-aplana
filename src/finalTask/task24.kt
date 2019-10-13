package finalTask

import module4.Aircraft
import module4.Boeing747
import module4.Passenger

fun main(){
    val aircrafts: MutableList<Aircraft> = mutableListOf()

    fillAircrafts(aircrafts)

    while(true){
        printF1()

        when(readLine()){
            "1" -> getTotalInfo(aircrafts)
            "2" -> getPassengerInfo(aircrafts)
            "3" -> getCargoInfo(aircrafts)
            "0" -> {
                println("Завершение работы..")
                return
            }
            else -> {
                println("Неверный формат команды, попробуйте еще раз")
            }
        }
    }
}

fun getTotalInfo(aircrafts: List<Aircraft> ){
    var cargoNum = 0
    var passengerNum = 0

    for(plane in aircrafts) {
        if (plane is Cargo) {
            println("Грузовой самолет\n-------------")
            cargoNum++
        }
        else if (plane is Passenger) {
            println("Пассажирский самолет\n-------------")
            passengerNum++
        }
        plane.printInfo()
        println()
    }

    println("###### Всего ########\nГрузовых самолетов: $cargoNum\nПассажирских самолетов: $passengerNum")
}

fun fillAircrafts(aircrafts: MutableList<Aircraft>){
    aircrafts.add(Boeing747(17))
    aircrafts.add(AirbusA320(73, 150))
    aircrafts.add(AirbusA320(74, 180))
    aircrafts.add(AirbusBeluga(119))
    aircrafts.add(Boeing747(18, 416))
    aircrafts.add(Boeing747(19, 524))
    aircrafts.add(AirbusBeluga(120))
}

fun printF1(){
    println("\nВведите одну из следующих доступных команд:")
    println("1. Вывести информацию обо всех самолетах компании")
    println("2. Вывести информацию о пассажирских самолетах компании")
    println("3. Вывести информацию о грузовых самолетах компании")

    println("0. Выход")
}

fun getCargoInfo(aircrafts: List<Aircraft>){
    var cargoNum = 0

    for(plane in aircrafts) {
        if (plane !is Cargo) {
            continue
        }

        println("-------------")
        cargoNum++

        plane.printInfo()
        println()
    }

    println("###### Всего грузовых самолетов: $cargoNum ########")
}

fun getPassengerInfo(aircrafts: List<Aircraft>){
    var passengerNum = 0

    for(plane in aircrafts) {
        if (plane !is Passenger) {
            continue
        }

        println("-------------")
        passengerNum++

        plane.printInfo()
        println()
    }

    println("###### Всего пассажирских самолетов: $passengerNum ########")
}