fun main() {
    weather("Ankara", 27, 31, 82)
    weather("Tokyo", 32,36,10)
    weather("Cape Town",59,64,2)
    weather("Guatemala City",50,55,7)
}

fun weather(name: String, minTemp: Int, maxTemp: Int, rain: Int) {
    println("City: $name\nLow temperature: $minTemp, High temperature: $maxTemp\nChance of rain: $rain%\n")
}//this task was interesting