package module4

// В качестве примера параметров взят Boeing 747-400
// https://www.airlines-inform.ru/commercial-aircraft/Boeing-747-400.html
class Boeing747(_maxPassengers: Int = 660) : Aircraft(747, 14200.0,241140.0), Passenger{
    override val MaxPassengers: Int

    init {
        MaxPassengers = _maxPassengers
    }

    override fun printInfo() {
        super.printInfo()
        println("Максимальное число пассажиров:\t $MaxPassengers")
    }
}