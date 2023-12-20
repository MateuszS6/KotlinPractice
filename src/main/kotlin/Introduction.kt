fun main() {
    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")

    var count = 10
    println("You have $count unread messages")
    count--
    println("You have $count unread messages")

    println(birthdayGreeting(age = 19))
    println(birthdayGreeting("Bob", 649))
}

fun birthdayGreeting(name: String = "Mateusz", age: Int): String {
    val nameGreeting = "Happy Birthday $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting $ageGreeting"
}