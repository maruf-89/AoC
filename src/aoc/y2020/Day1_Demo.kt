// REDOVISNING — Demo lösning vs HashSet

fun main() {

    val numbers = listOf(1721, 979, 366, 299, 675, 1456)

    println("Lista: $numbers")
    println()

    // DEMO LÖSNING — dubbel loop, jämför alla par (O(n²))
    println("DEMO LÖSNING")
    var antalJamforelser = 0

    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size) {
            antalJamforelser++
            print("Jämför: ${numbers[i]} + ${numbers[j]} = ${numbers[i] + numbers[j]}")
            if (numbers[i] + numbers[j] == 2020) {
                println("  ← HITTAD!")
                println("SVAR: ${numbers[i]} × ${numbers[j]} = ${numbers[i] * numbers[j]}")
            } else {
                println()
            }
        }
    }

    println()
    println("Antal jämförelser: $antalJamforelser")
    println("Med 1000 tal ges ~500 000 jämförelser")
    println()
}