import java.lang.reflect.Method

open class GrandParent {
    val gpName = "GrandParent"
    fun gpMethod() = println(gpName)
}

open class Parent : GrandParent() {
    val pName = "Parent"
    fun pMethod() = println(pName)
}

interface Extra {
    fun foobar(){
        println("Hi")
    }
}

class Child : Parent(), Extra {
    val Name = "Child"
    fun Method() = println(Name)
    override fun foobar() {
        println("Dude")
    }
}

fun main() {
    val child = Child()
    child.gpMethod()
    child.pMethod()
    child.Method()
    child.foobar()
}