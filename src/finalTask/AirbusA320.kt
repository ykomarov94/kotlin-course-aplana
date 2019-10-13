package finalTask

import module4.Aircraft
import module4.Passenger

// https://www.airlines-inform.ru/commercial-aircraft/Airbus-A320.html
class AirbusA320(_idNumber: Int = 320, _maxPassengers: Int = 180) : Aircraft(_idNumber, 6100.0,27200.0), Passenger {
    override val MaxPassengers: Int = _maxPassengers

    override fun printInfo() {
        println("Airbus A320")
        super.printInfo()
        println("Максимальное число пассажиров:\t $MaxPassengers")
    }
}