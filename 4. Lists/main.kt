fun main() {
    // Immutable Lists
    val favouriteTVSeriesList = listOf<String>("F.R.I.E.N.D.S.", "Breaking Bad", "Stranger Things", "Prison Break")
    println("----- Favourite TV Series -----")
    favouriteTVSeriesList.forEach { tvSeries ->
        println(tvSeries)
    }

    /*
    * Since lists in Kotlin are immutable by default, we can't modify them (as demonstrated in the following examples)
        favouriteTVSeriesList[2] = "13 Reasons Why"
        favouriteTVSeriesList.add("13 Reasons Why")
    */

    // Mutable Lists
    val favouriteMoviesList = mutableListOf<String>("The Pursuit of Happyness", "Dumb and Dumber", "Shawshank Redemption", "Kungfu Hustle")
    favouriteMoviesList[3] = "Iron Man"
    favouriteMoviesList.add("Catch Me If You Can")
    favouriteMoviesList.removeAt(2)
    println("\n----- Favourite Movies -----")
    favouriteMoviesList.forEach { movie ->
        println(movie)
    }
}