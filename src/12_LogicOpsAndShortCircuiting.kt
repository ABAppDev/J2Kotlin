fun main() {
    val conditionA: Boolean = true
    val conditionB: Boolean = true
    val conditionC: Boolean = false

    if (conditionA && conditionB) {
        println("BOTH TRUE REQUIRED; IF First False then Next skipped And Short Circuiting Happened")
    }

    if (conditionA || conditionB) {
        println("Atleast ONE TRUE REQUIRED; IF First False then Next Checked And If First Is True Then Next Skipped Short Circuiting Happened")
    }

    if (!conditionC) {
        println("Complements The Condition")
    }
}