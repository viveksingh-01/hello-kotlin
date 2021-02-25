// Function with parameter specified with "vararg" to handle varying number of arguments
fun prepareFruits(action: String, vararg fruits: String) {
    println()
    fruits.forEach {
        println("$action $it")
    }
}

fun main() {
    val fruits = arrayOf<String>("Apple", "Banana", "Orange", "Pineapple", "Watermelon")
    // Passing varying number of fruits as argument
    prepareFruits("wash", "Apple")
    prepareFruits("peel", "Banana", "Orange", "Pineapple")
    prepareFruits("cut", "Apple", "Banana", "Pineapple", "Watermelon")
    // Passing the entire fruits array (with the spread operator "*")
    prepareFruits("serve", *fruits)
}