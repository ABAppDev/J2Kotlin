fun nAnR() = print("\n No Arguments No Return Type")

fun nAwR(): String = "\n No Arguments With Return Type"

fun wAnR(message: String) = print("\n $message No Return Type")

fun wAwR(message: String): String = "\n $message With Return Type"

fun withDefaultValue(message: String = "Hola") = print("\n$message")


fun shouldChangeWater(temperature: Int = 22, day: String, dirt: Int = 20, mend: Int = 1): Boolean {

    return when {
        temperature > 30 -> true
        dirt > 30 -> true
        day == "Sunday" -> true
        mend != 1 -> true
        else -> false
    }
}

fun feedTheFish() {
    println("\nShould Change Water ${shouldChangeWater(22, "Monday", 20, 0)}")
}


fun main() {
    nAnR()
    print(nAwR())
    wAnR("With Arguments")
    print(wAwR("With Arguments"))

    withDefaultValue()
    withDefaultValue("Hello")
    withDefaultValue(message = "Namaste")

    feedTheFish()

}