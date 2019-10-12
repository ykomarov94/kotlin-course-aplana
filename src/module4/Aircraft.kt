package module4

// В качестве примера параметров взят Boeing 737-300
// https://www.airlines-inform.ru/commercial-aircraft/Boeing-737-300.html
class Aircraft{
    var IdNumber: Int = 737
    var MaxFlightDistance: Double = 2900.0
    var MaxFuelVolume: Double = 23830.0

    val FuelConsumption: Double // Реальная информация недоступна, геттер переопределен
        get(){
            return MaxFuelVolume / MaxFlightDistance * 100.0
        }
}