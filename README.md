# Advent of Code — Kotlin Solutions

Solutions to Advent of Code puzzles written in Kotlin, plus a VG recursion assignment (Tomteland).

---

## Project Structure

The project is structured into multiple files, each solving a specific AoC puzzle:

- `Day1_ReportRepair.kt` – AoC 2020, Day 1 – Find two/three numbers that sum to 2020
- `Day2_WrappingPaper.kt` – AoC 2015, Day 2 – Calculate wrapping paper and ribbon for gifts
- `Day4_HighEntropyPassphrases.kt` – AoC 2017, Day 4 – Validate passphrases for repeated words and anagrams
- `Tomteland.kt` – VG recursion assignment – Santa's hierarchy with recursive underling lookup
- `TomtelandTest.kt` – 15 unit tests for the Tomteland recursion
- `Day1_Demo.kt` – Demo file showing the naive solution vs HashSet approach (for presentation purposes)

---

## How to Run the Project

1. Clone the repository from GitHub
2. Open the project in IntelliJ IDEA
3. Each puzzle file has its own `main()` function — open the file you want to run and click the green play button
4. To use your own AoC input, follow the instructions inside each `input_dayX.txt` file

---

## Input Files

Each puzzle requires a personal input file from adventofcode.com. The repository includes template files explaining how to get your input:

- `src/aoc/y2020/input_day1.txt` → [AoC 2020 Day 1 Input](https://adventofcode.com/2020/day/1/input)
- `src/aoc/y2015/input_day2.txt` → [AoC 2015 Day 2 Input](https://adventofcode.com/2015/day/2/input)
- `src/aoc/y2017/input_day4.txt` → [AoC 2017 Day 4 Input](https://adventofcode.com/2017/day/4/input)

> You need to be logged in to adventofcode.com to access your personal input.

---

## Running the Tests

1. Right-click the `test/` folder in IntelliJ → Mark Directory as → Test Sources Root
2. Open `TomtelandTest.kt` → Alt+Enter on the red import → Add JUnit 5 to classpath
3. Click the green play button next to `class TomtelandTest`

All 15 tests should pass.

---

## Purpose of the Project

The purpose of this project is to practice:

- Functional programming in Kotlin
- Working with higher-order functions, data structures and recursion
- Solving algorithmic problems with AoC puzzles
- Writing unit tests in Kotlin

---

## Author

Maruf Mulk

---

## GitHub Repository

https://github.com/maruf-89/AoC
