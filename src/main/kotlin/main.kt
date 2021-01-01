import kotlin.random.Random
import kotlin.math.pow

fun main(args: Array<String>) {
    println("Hello World!")
    printRandomNumber()
}

fun printRandomNumber() {
    print("Enter complexity: ")
    //println("Input received is ${readlnInt()}")
    val largestNumber: Int = 10.0.pow(readLnInt()).toInt()

    while(true) {
        val multiplicand: Int = Random.nextInt(0, largestNumber)
        val multiplier: Int = Random.nextInt(0, largestNumber)
        print("$multiplicand x $multiplier = ")

        if (readLnInt() == multiplicand * multiplier) println("Correct!")
        else println("Wrong! Correct answer is ${multiplicand * multiplier}")
    }
}

private fun readLnInt() = readLine()!!.toInt()
