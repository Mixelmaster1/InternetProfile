fun main() {
    val amanda = Song.Person("Amanda", 33, "play tennis", null)
    val atiqah = Song.Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Song(
    val title: String,
    val artist: String,
    val yearPublised: Int,
    val playCount: Int,
) {
   val isPopular: Boolean
       get() = playCount >= 1000
    fun printDescription() {
        val yearPublished
        println("$title, performed by $artist, we released in $yearPublished years published"))
    }
}

class Person(
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: Person?
){
    fun showprofile() {
        println("Name $name")

    }
}



class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        // Fill in code
    }
}