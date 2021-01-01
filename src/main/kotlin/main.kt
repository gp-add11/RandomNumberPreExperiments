import kotlin.random.Random
import kotlin.math.pow

fun main(args: Array<String>) {
    println("Hello World!")
    printRandomNumber();
}

fun printRandomNumber() {
    print("Enter complexity: ")
    val largestNumber = 10.0.pow(2).toInt()
    val randomNumber: Int = Random.nextInt(0,largestNumber)
    println("Random number in the given range in $randomNumber")
}
