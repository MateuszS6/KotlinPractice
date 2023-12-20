fun main() {
    // Q4
    var discountPercentage = 0
    var offer = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)

    // Q5
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

    // Q6
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    // Q7
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")

    // Q8
    println(displayAlertMessage(emailID = "sample"))
    println(displayAlertMessage("System69", "bob"))

    // Q9
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")

    // Q10
    println(compareScreenTime(300, 250))
    println(compareScreenTime(300, 300))
    println(compareScreenTime(200, 220))
    println()

    // Q11
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
}

fun printWeatherForCity(city: String, low: Int, high: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $low, High temperature: $high")
    println("Chance of rain: $chanceOfRain%")
    println()
}

fun compareScreenTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    return numberOfSteps * caloriesBurnedForEachStep
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailID: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailID@gmail.com"
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun add(a: Int, b: Int): Int {
    return a + b
}
