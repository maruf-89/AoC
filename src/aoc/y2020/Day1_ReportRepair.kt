// Advent of Code 2020 - Dag 1: Report Repair
// https://adventofcode.com/2020/day/1

import java.io.File

fun main() {


    // EXEMPELDATA (förväntade svar: Del A = 514579, Del B = 241861950)
    // val numbers: List<Int> = listOf(1721, 979, 366, 299, 675, 1456)

    // RIKTIGT DATASET
     val numbers: List<Int> = File("src/aoc/y2020/input_day1.txt")
         .readLines()
         .filter { it.isNotBlank() }
         .map { it.trim().toInt() }


    println("[ AoC 2020, Dag 1: Report Repair ]")

    // DEL A
    println("\n DEL A: Hitta TVÅ tal som summerar till 2020")
    val (a1, b1) = findTwoSum(numbers, target = 2020)
        ?: error("Ingen lösning för Del A!")
    println("Hittade: $a1 + $b1 = ${a1 + b1}")
    println("SVAR Del A: ${a1 * b1}")

    // DEL B
    println("\n DEL B: Hitta TRE tal som summerar till 2020")
    val (a2, b2, c2) = findThreeSum(numbers, target = 2020)
        ?: error("Ingen lösning för Del B!")
    println("Hittade: $a2 + $b2 + $c2 = ${a2 + b2 + c2}")
    println("SVAR Del B: ${a2 * b2 * c2}")
}

// DEL A — findTwoSum
// ALGORITM: HashSet-sökning
// KOTLIN-FEATURE: Destructuring Declarations
// val (a, b) = findTwoSum(...)

fun findTwoSum(numbers: List<Int>, target: Int): Pair<Int, Int>? {
    val seen = HashSet<Int>()
    for (n in numbers) {
        val complement = target - n
        if (complement in seen) return Pair(complement, n)
        seen.add(n)
    }
    return null
}

// DEL B — findThreeSum
// KOTLIN-FEATURE: List.drop(n)
// KOTLIN-FEATURE: Triple + Destructuring

fun findThreeSum(numbers: List<Int>, target: Int): Triple<Int, Int, Int>? {
    for (i in numbers.indices) {
        val pair = findTwoSum(numbers.drop(i + 1), target - numbers[i])
        if (pair != null) return Triple(numbers[i], pair.first, pair.second)
    }
    return null
}