fun main() {
    println("Numbers from 1 to 10:")
    for (i in 1..10) {
        println(i)
    }

    println("Even numbers from 1 to 20:")
    for (i in 1..20) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
