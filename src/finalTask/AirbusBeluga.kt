package finalTask

import module4.Aircraft

// https://en.wikipedia.org/wiki/Airbus_Beluga
class AirbusBeluga(_idNumber: Int = 300) : Aircraft(_idNumber,  1700.0, 23860.0), Cargo {
    override val MaxCarriedWeight: Double = 47000.0

    override fun printInfo() {
        println("Airbus A300-600ST")
        super.printInfo()
        println("Грузоподъемность:\t $MaxCarriedWeight")
    }
}