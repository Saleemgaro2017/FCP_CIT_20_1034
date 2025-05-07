fun main() {
    val studentScores = mapOf("Ali" to 65, "Zainab" to 85, "John" to 90, "Musa" to 70)

    println("Students who scored above 70:")
    for ((name, score) in studentScores) {
        if (score > 70) {
            println("$name scored $score")
        }
    }
}
