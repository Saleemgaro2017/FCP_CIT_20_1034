fun main() {
    print("Enter a number: ")
    val num = readLine()?.toIntOrNull()
    if (num != null) {
        if (num % 2 == 0)
            println("$num is an even number.")
        else
            println("$num is an odd number.")
    } else {
        println("Invalid input.")
    }
}
