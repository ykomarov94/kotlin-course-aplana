package module4

// В качестве примера параметров взят Boeing 737-300
// https://www.airlines-inform.ru/commercial-aircraft/Boeing-737-300.html
abstract class Aircraft(_idNUmber: Int, _maxFlightDistance: Double, _maxFuelVolume: Double){
    var IdNumber: Int
    var MaxFlightDistance: Double
    var MaxFuelVolume: Double

    init {
        IdNumber = _idNUmber
        MaxFlightDistance = _maxFlightDistance
        MaxFuelVolume = _maxFuelVolume
    }

    val FuelConsumption: Double // Реальная информация недоступна, геттер переопределен
        get(){
            return MaxFuelVolume / MaxFlightDistance * 100.0
        }
}