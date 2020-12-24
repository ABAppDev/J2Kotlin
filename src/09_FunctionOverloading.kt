fun Addition(a: Int, b: Int): Int {
    return a + b
}

fun Addition(a: Float, b: Float): Float {
    return a + b
}


fun main() {
    println("Int Addition = ${Addition(1, 2)}")
    println("Float Addition = ${Addition(1.0F, 2.0F)}")
}