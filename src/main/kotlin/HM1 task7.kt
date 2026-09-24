//fun main() {
//    val operatingSystem = "Chrome OS"
//    val emailId = "sample@gmail.com"
//
//    println(displayAlertMessage(operatingSystem, emailId))
//}
//
//// Define your displayAlertMessage() below this line.
//fun displayAlertMessage(operatingSystem: String, emailId: String) {
//    println("There's a new sign-in request on $operatingSystem for your Google Account $emailId.\n")
//}


fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId.\n"
}
//in this task if operating system is empty it write Unknown OS, but if it know it display it