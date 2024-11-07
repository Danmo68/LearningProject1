import kotlin.random.Random
import kotlin.system.exitProcess


fun getRandomInt (range: IntRange): Int {
    return Random.nextInt(range.first, range.last + 1)
}

fun main() {
    var randomInt = getRandomInt(1..100)
    var counter = 0

    println("Welcome to Dan's guessing game!")
    println("Guess a number between 1 and 100 in less than 5 tries")
    println("First, tell me your name")
    val name = readln()
    println("Nice to meet you, $name"+".")
    println("Let the game begin. Enter your first guess below:")

    val guess1 = readln().toInt()

    if (guess1 == randomInt) {
        println("Congratulations, you are a lucky lady ;)")
        println("Game is complete and shutting down")
        exitProcess(0)
    } else if (guess1 > randomInt) {
        println("To High, Guess Again")
    } else if (guess1 < randomInt) {
        println("To Low, Guess Again")
    } else {
        println("That is not a valid guess. Your guesses should be a whole number between 1 and 100")
    }

    counter++
    println("Current guesses remaining ${5-counter}")
    println(" ")

    val guess2 = readln().toInt()

    if (guess2 == randomInt) {
        println("Congratulations, you are a lucky lady ;)")
        println("Game is complete and shutting down")
        exitProcess(0)
    } else if (guess2 > randomInt) {
        println("To High, Guess Again")
    } else if (guess2 < randomInt) {
        println("To Low, Guess Again")
    } else {
        println("That is not a valid guess. Your guesses should be a whole number between 1 and 100")
    }

    counter++
    println("Current guesses remaining ${5-counter}")
    println(" ")

    val guess3 = readln().toInt()

    if (guess3 == randomInt) {
        println("Congratulations, you are a lucky lady ;)")
        println("Game is complete and shutting down")
        exitProcess(0)
    } else if (guess3 > randomInt) {
        println("To High, Guess Again")
    } else if (guess3 < randomInt) {
        println("To Low, Guess Again")
    } else {
        println("That is not a valid guess. Your guesses should be a whole number between 1 and 100")
    }

    counter++
    println("Current guesses remaining ${5-counter}")
    println(" ")

    val guess4 = readln().toInt()

    if (guess4 == randomInt) {
        println("Congratulations, you are a lucky lady ;)")
        println("Game is complete and shutting down")
        exitProcess(0)
    } else if (guess4 > randomInt) {
        println("To High, Guess Again")
    } else if (guess4 < randomInt) {
        println("To Low, Guess Again")
    } else {
        println("That is not a valid guess. Your guesses should be a whole number between 1 and 100")
    }

    counter++
    println("Current guesses remaining ${5-counter}")
    println("This is your final guess!!! Make it count!")

    val guess5 = readln().toInt()

    if (guess5 == randomInt) {
        println("Congratulations, you are a lucky lady ;)")
        println("Game is complete and shutting down")
        exitProcess(0)
    } else if (guess5 > randomInt) {
        println("To High, the answer was $randomInt!")
    } else if (guess5 < randomInt) {
        println("To Low, the answer was $randomInt")
    } else {
        println("That is not a valid guess. but it does not matter because you are out of guesses :)")
    }

    println("Dont fret, play again!")

}


