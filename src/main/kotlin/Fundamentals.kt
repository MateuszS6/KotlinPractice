fun main() {
    println(checkPrime(20)) // Only one println needed using when

    // var nullableString: String? = "..."
    var yeet: String? = "yeet"
    // nullableString?.method ?; [default value]
    val lengthOfYeet = yeet?.length ?: 0 // Elvis operator
    println("Yeet length is $lengthOfYeet today")

    val smartTVDevice = SmartDevice()
}

fun checkPrime(x: Any): String {
    val result = when (x) {
        2, 3, 5, 7 -> "x is a prime number between 1 and 10."
        in 1..10 -> "x is a number between 1 and 10, but not a prime number." // Range check
        is Int -> "x is an integer number, but not between 1 and 10." // Type check
        else -> "x isn't an integer number."
    }
    return result
}

class SmartDevice {
    fun turnOn() {
        
    }
}