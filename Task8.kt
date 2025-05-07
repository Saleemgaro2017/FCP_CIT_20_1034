open class Person(val name: String, val age: Int) {
    open fun display() {
        println("Name: $name, Age: $age")
    }
}

class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    override fun display() {
        super.display()
        println("Grade: $grade")
    }
}

fun main() {
    val student = Student("Jane", 21, "A")
    student.display()
}
