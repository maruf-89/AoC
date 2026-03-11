// Advent of Code 2017 - Dag 4: High-Entropy Passphrases
// https://adventofcode.com/2017/day/4

// DEL A: En lösenfras är giltig om den inte innehåller några UPPREPADE ord.

// DEL B: En lösenfras är giltig om inga två ord är samma bokstäver, annan ordning.

import java.io.File

fun main() {

    // RIKTIGT DATASET
    val lines = File("src/aoc/y2017/input_day4.txt")
        .readLines().filter { it.isNotBlank() }
    val linesA = lines
    val linesB = lines

    println("AoC 2017, Dag 4: High-Entropy Passphrases")

    // DEL A
    println("\n DEL A: Inga upprepade ord")
    println("SVAR Del A: ${linesA.count { isValidA(it) }}")

    // DEL B
    println("\n DEL B: Inga anagram")
    println("SVAR Del B: ${linesB.count { isValidB(it) }}")
}

// DEL A — isValidA
// KOTLIN-FEATURE: toSet()
fun isValidA(line: String): Boolean {
    val words = line.trim().split(" ")
    return words.size == words.toSet().size
}

// DEL B — isValidB
// KOTLIN-FEATURE: map { word.toList().sorted().joinToString("") }
fun isValidB(line: String): Boolean {
    val words = line.trim().split(" ")
    val sorted = words.map { word ->
        word.toList().sorted().joinToString("")
    }
    return sorted.size == sorted.toSet().size
}