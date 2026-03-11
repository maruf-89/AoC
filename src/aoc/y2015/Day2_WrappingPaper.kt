// Advent of Code 2015 - Dag 2: I Was Told There Would Be No Math
// https://adventofcode.com/2015/day/2

import java.io.File

fun main() {

    // EXEMPELDATA (förväntade svar: Del A = 101, Del B = 48)
    // val lines = listOf("2x3x4", "1x1x10")

    // RIKTIGT DATASET
     val lines = File("src/aoc/y2015/input_day2.txt")
         .readLines()
         .filter { it.isNotBlank() }

    println("AoC 2015, Dag 2: I Was Told There Would Be No Math")
    println("Antal lådor: ${lines.size}")

    // KOTLIN-FEATURE: map + destructuring för att parsa "2x3x4"
    val boxes: List<Triple<Int, Int, Int>> = lines.map { line ->
        val (l, w, h) = line.trim().split("x").map { it.toInt() }
        Triple(l, w, h)
    }

    // DEL A - Hur mycket presentpapper behövs totalt?
    println("\n DEL A: Totalt presentpapper (kvadratfot)")

    // KOTLIN-FEATURE: sumOf { } med beräkning inuti
    // KOTLIN-FEATURE: minOf(a, b, c)
    val totalPaper = boxes.sumOf { (l, w, h) ->
        val sideA = l * w
        val sideB = w * h
        val sideC = h * l
        val surface = 2 * sideA + 2 * sideB + 2 * sideC
        val extra   = minOf(sideA, sideB, sideC)
        surface + extra
    }
    println("SVAR Del A: $totalPaper")

    // DEL B -  Hur mycket band behövs totalt?
    println("\n DEL B: Totalt band (fot)")

    // KOTLIN-FEATURE: sorted() på en lista
    val totalRibbon = boxes.sumOf { (l, w, h) ->
        val sorted   = listOf(l, w, h).sorted()
        val ribbon   = 2 * sorted[0] + 2 * sorted[1]
        val bow      = l * w * h
        ribbon + bow
    }
    println("SVAR Del B: $totalRibbon")
}