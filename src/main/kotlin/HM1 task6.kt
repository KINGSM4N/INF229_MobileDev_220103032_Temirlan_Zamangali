//fun main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    var result = firstNumber + secondNumber
//    println("$firstNumber + $secondNumber = $result")
//}
// arono do i need to do step 2 but ill do it

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    var result = add(firstNumber, secondNumber)
    var anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val subtractResult = subtract(firstNumber, secondNumber)
    val anotherSubtractResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $subtractResult")
    println("$firstNumber - $thirdNumber = $anotherSubtractResult")
}

// Define add() function below this line
fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}//i added add() function as a comment and did the same thing to substract