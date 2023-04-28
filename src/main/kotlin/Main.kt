import java.util.Scanner
object Constants {
    const val BOT_NAME = "Fresh Cut Grass"
    const val CREATION_YEAR = 2023
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    //This is where ChattyBot(FCG) introduces themselves
    println("Hello my name is ${Constants.BOT_NAME}!")
    println("I was created in ${Constants.CREATION_YEAR}.")

    //FCG asks the user their name
    println("Could you remind me of your name again?")
    val usersName = scanner.nextLine()

    println("Oh that's right! Welcome back $usersName!")
}