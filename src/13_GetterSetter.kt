fun main() {
    val objectz = GetSet()
    objectz.myName = "Abhishek Bhalerao"
    println(objectz.myName)
}

class GetSet {
    var myName: String = ""
        get() = field.toUpperCase()
        set(value) {
            field = value
        }
}