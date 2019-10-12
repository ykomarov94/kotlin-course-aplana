package module4

// В качестве примера параметров взят Boeing 737-300
// https://www.airlines-inform.ru/commercial-aircraft/Boeing-737-300.html
abstract class Aircraft(_idNUmber: Int, _maxFlightDistance: Double, _maxFuelVolume: Double){
    protected val IdNumber: Int
    protected val MaxFlightDistance: Double
    protected val MaxFuelVolume: Double

    init {
        IdNumber = _idNUmber
        MaxFlightDistance = _maxFlightDistance
        MaxFuelVolume = _maxFuelVolume
    }

    protected val FuelConsumption: Double // Реальная информация недоступна, геттер переопределен
        get(){
            return MaxFuelVolume / MaxFlightDistance * 100.0
        }

    open fun printInfo(){
        println("Идентификационный номер самолета:\t $IdNumber\n" +
                "Максимальная дистанция полета:\t $MaxFlightDistance\n" +
                "Объем топливных баков составляет:\t $MaxFuelVolume\n" +
                "Потребление топлива на 100км пути:\t $FuelConsumption")
    }
}