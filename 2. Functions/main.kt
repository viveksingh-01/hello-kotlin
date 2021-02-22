fun main() {
    val bandName: String = getBandName()
    introduceBand(bandName)
    println("Our latest album is ${getLatestAlbum(bandName)}.")
}

/*
* Single Expression Function
* In Kotlin, we can define a function (depending on its return-type and body) as an inline statement
*/
// Value returning SEF
fun getBandName() = "Coldplay"
// Non-value returning SEF with single-line function body
fun introduceBand(bandName: String) = println("Hello, we are $bandName!")

// Functions in Kotlin are declared with the return-type (similar to TS)
// Kotlin has "when-else" block (similar to switch-case in other programming languages)
fun getLatestAlbum(bandName: String): String {
    return when (bandName) {
        "Twenty One Pilots" -> "Trench"
        "Coldplay" -> "Everyday Life"
        "Linkin Park" -> "One More Light"
        else -> "Dark Side Of The Moon?"
    }
}
