fun main() {
    // val -> for constant (immutable) values
    val name: String = "Chandler Bing"
    val age: Int = 28
    val isFunny: Boolean = true

    // All variables in Kotlin are non-nullable by default and if we want to declare a nullable variable, we use '?' at the end of type.
    val jokeOfTheDay: String? = null

    // var -> for varying (mutable) values
    var salary: Double = 1200.00

    // Use of template string (similar to JS)
    println("Hi, my name is $name and I'm $age years old.")

    if (jokeOfTheDay != null) {
        println(jokeOfTheDay);
    }

    // Single-line if-else declaration
    val funDeclaration = if (isFunny) "I use humour as my defense-mechanism." else "I'm not funny anymore."
    println(funDeclaration)

    println("\nI work with numbers and I earn $$salary per month!")
    println("But wait, I'm gonna get promoted next month.")

    // Inferred Type: Kotlin infers the data-type by itself, if its not provided
    val salaryIncrement = 400.00
    salary += salaryIncrement
    println("With $$salary in my pocket, could I be any richer?")
}