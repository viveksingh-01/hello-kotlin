fun main() {
    // IMMUTABLE MAPS
    val alphabetsASCIICodeMapping = mapOf<String, Int>("A" to 65, "B" to 66, "C" to 67, "D" to 68, "E" to 69)
    println("\n------ ASCII code for Alphabets ------")
    // Retrieving the value of key using indexing
    println("ASCII code of B is ${alphabetsASCIICodeMapping["B"]}")
    // Retrieving the value of key using "get" method (not preferred)
    println("ASCII code of D is ${alphabetsASCIICodeMapping.get("D")}")

    alphabetsASCIICodeMapping.forEach { (key, value) ->
        println("$key -> $value")
    }

    /*
    * Maps in Kotlin are also immutable by default, so we can't modify them (as demonstrated in the following examples)
        ASCIICodeMapping["F"] = 70
        ASCIICodeMapping.put("F", 70)
    */

    // MUTABLE MAPS
    val numbersASCIICodeMapping = mutableMapOf<Int, Int>(1 to 49, 2 to 50, 3 to 51, 4 to 51, 5 to 53)
    println("\n------ ASCII code for Numbers ------")
    println("ASCII code of 2 is ${numbersASCIICodeMapping[2]}")
    println("ASCII code of 5 is ${numbersASCIICodeMapping.get(5)}")
    // Editing existing value of a key
    numbersASCIICodeMapping[4] = 52
    // Adding new key-value pair using assignment
    numbersASCIICodeMapping[0] = 48
    // Adding new key-value pair using put method
    numbersASCIICodeMapping.put(9, 57)

    numbersASCIICodeMapping.forEach { (key, value) ->
        println("$key -> $value")
    }
}