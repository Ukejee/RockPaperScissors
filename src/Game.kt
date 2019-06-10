fun main(args: Array<String>){

    var isGameOver = false

    while(!isGameOver) {
        val options = arrayOf("Rock", "Paper", "Scissors")
        val gameOption = getGameOption(options)
        val userChoice = getUserChoice(options)
        printResult(userChoice, gameOption)

        println("Do you want play again? Enter Y or N")
        val endGameCoice = readLine()
        if(endGameCoice != null && endGameCoice.equals("n",true)) isGameOver = true else false
    }
}

fun getGameOption(a: Array<String>) = a[(Math.random() * a.size).toInt()]

fun getUserChoice(a: Array<String>): String{
    var isChoiceValid = false
    var userChoice = " "

    while(!isChoiceValid){
        //Ask user for his choice
        print("Please enter one of the following:")
        for(item in a ) print("$item")
        println(".")
        //Read user input
        val userInput = readLine()
        if(userInput != null && userInput in a){
            userChoice = userInput
            isChoiceValid = true
        }
        else{
            println("You must enter a vaid input")
        }
    }

    return userChoice
}

fun  printResult(a: String, b: String):Unit{

        if(a == b) println("I chose $b and you chose $a. It's a draw")
        else if(a.equals("Scissors") && b.equals("Paper")) println("I chose $b and you chose $a. You win")
        else if(a.equals("Rock") && b.equals("Scissors")) println("I chose $b and you chose $a. You win")
        else if(a.equals("Paper") && b.equals("Rock")) println("I chose $b and you chose $a. You win")
        else{
            println("I chose $b and you chose $a. You Lose")
        }
}