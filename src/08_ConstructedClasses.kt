class Empty {
}

class WithParameters(var message: String, ID: Int) {
    val messageID = ID
}

class Default() {
    val message = "Hello"
    val messageID = 101
}

fun main() {
    val MT = Empty()

    val WP = WithParameters("Message", 1001)
    println("\n${WP.message} = ${WP.messageID}")

    val DF = Default()
    println("\n${DF.message} = ${DF.messageID}")
}