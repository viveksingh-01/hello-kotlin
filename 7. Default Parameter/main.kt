// Function with Default parameter
fun greet(greeting: String = "Hello") {
    println("$greeting!")
}

// Function with multiple parameters including a Default one (Incorrect version)
fun greetPersonIncorrectVer(greeting: String = "Hello", name: String) {
    println("$greeting, $name!")
}

// Function with multiple parameters including a Default one (Correct version)
fun greetPersonCorrectVer(name: String, greeting: String = "Hello") {
    println("$greeting, $name!")
}

fun main() {
    greet("Good morning")
    greet("Good night")
    greet() // This works even without passing any argument because of the Default parameter

    val name = "Mike"
    greetPersonIncorrectVer("Good evening", name)
    // greetPersonIncorrectVer(name) => This won't work since the "name" argument will be assigned to 'greeting'
    /*
        To resolve the above mentioned problem, we need to place the Default parameter at the last (as done in 'greetPersonCorrectVer()')
        => fun greetPersonCorrectVer(name: String, greeting: String = "Hello") { ... }
    */
    greetPersonCorrectVer(name)
    /*
        The above function invocation works since now the "name" argument is being passed to the 'name' parameter;
        and since there is no argument passed for the 'greeting', it uses the default value.
    */
}