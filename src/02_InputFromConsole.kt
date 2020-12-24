//Calculation Rect-Area

fun main() {

    println("Enter Breadth = ")
    var b: Int = readLine()?.toInt() ?: 0

    println("Enter Height = ")
    var h: Int = readLine()?.toInt() ?: 0

    var a: Int = b * h
    println("Area = $a")

}
