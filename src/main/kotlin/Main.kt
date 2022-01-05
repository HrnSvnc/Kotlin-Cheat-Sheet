fun main() {


    // Simple method that Prints a given String. Unit is the equivalent to void in Java
    fun printMessage(message: String): Unit {
        println(message)
    }

    printMessage("Hello World!")


    // A function that takes a second optional parameter with default value Info. The return type is omitted, meaning that it's actually Unit
    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

    printMessageWithPrefix("Test goes Here")
    printMessageWithPrefix("Test goes Here","Not Info - ")

    fun printMessageWithDefaultArguments(message: String, additionalMessage:String = "Default Message goes here"){
        println(message + additionalMessage)
    }

    printMessageWithDefaultArguments("My Message ")
    printMessageWithDefaultArguments("My Message ", "MyOtherMessage")

    // A single-expression function that returns an integer (inferred).
    fun multiply(x: Int, y: Int) = x * y
    println(multiply(3,4))

    // A function that takes another function as parameter
    fun functionWithLambdaExpression(someFunction: ()->Unit){
        someFunction()
    }
    functionWithLambdaExpression { println("something") }
    functionWithLambdaExpression(someFunction = { println("here comes a function")})
    functionWithLambdaExpression { println("test123") }
    //Lambda Expression
    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    println(sum(1,2))

    //Infix functions
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    infix fun Int.many(str:String)= str.repeat(this)
    println(4 many "something, ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}
