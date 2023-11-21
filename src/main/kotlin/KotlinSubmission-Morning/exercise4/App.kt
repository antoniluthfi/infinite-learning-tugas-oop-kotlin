package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    println("Insert denominator:")
    val denominator = readlnOrNull()?.toIntOrNull()

    println("Insert numerator:")
    val numerator = readlnOrNull()?.toIntOrNull()

    try {
        if (denominator != null && numerator != null) {
            if (numerator != 0) {
                val result = denominator.toDouble() / numerator.toDouble()
                println("Division result: $result")
            } else {
                throw ArithmeticException("The denominator cannot be zero.")
            }
        } else {
            throw IllegalArgumentException("Invalid input.")
        }
    } catch (e: ArithmeticException) {
        println("An arithmetic error occurred: ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("An error occurred: ${e.message}")
    }
}
