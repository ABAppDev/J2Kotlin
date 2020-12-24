fun main() {
    val a = 10
    val b = 20

    //----------------
    if (a > b) {
        println("Larger = $a")
    } else {
        println("Larger = $b")
    }

    //----------------
    var smaller = if (a < b) {
        a
    } else {
        b
    }

    println("Smaller = $smaller")


    var isEqual = a == b;
    println("Both Equal = $isEqual")


}