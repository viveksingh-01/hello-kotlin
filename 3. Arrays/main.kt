fun main() {
    val programmingLanguagesIKnow = arrayOf("JavaScript", "TypeScript", "Golang", "Kotlin", "Python")

    // To get the size of the array
    val numOfProgLanguagesIKnow: Int = programmingLanguagesIKnow.size

    // Using indexing to get the element
    val mostFavProgLanguage: String = programmingLanguagesIKnow[0]

    // Using the "get" method to get the element
    val leastFavProgLanguage: String = programmingLanguagesIKnow.get(numOfProgLanguagesIKnow - 1)

    println("\nMy favorite programming language is $mostFavProgLanguage,")
    println("And my least favorite programming language is $leastFavProgLanguage.")

    println("\nNumber of programming languages I know is $numOfProgLanguagesIKnow.")
    println("And they are:")

    println("\n----- Using For loop -----")
    for (programmingLanguage in programmingLanguagesIKnow) {
        println(programmingLanguage)
    }

    println("\n----- Using ForEach method -----")
    programmingLanguagesIKnow.forEach {
        println(it)
    }

    println("\n----- Using ForEach with custom parameters -----")
    programmingLanguagesIKnow.forEach { programmingLanguage: String ->
        println(programmingLanguage)
    }

    println("\n----- Using Indexed ForEach with custom parameters -----")
    programmingLanguagesIKnow.forEachIndexed { index, programmingLanguage: String ->
        println("$programmingLanguage at index $index")
    }
}