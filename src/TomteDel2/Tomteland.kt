package TomteDel2

// HIERARKI:
//   Tomten
//   +-- Glader
//   |   +-- Tröger              (lövnod - inga underordnade)
//   |   +-- Trötter
//   |   |   +-- Skumtomten
//   |   |       +-- Dammråttan  (lövnod)
//   |   +-- Blyger              (lövnod)
//   +-- Butter
//       +-- Rådjuret            (lövnod)
//       +-- Nyckelpigan         (lövnod)
//       +-- Haren               (lövnod)
//       +-- Räven
//           +-- Gråsuggan       (lövnod)
//           +-- Myran
//               +-- Bladlusen   (lövnod)


class Tomteland {

    // DATASTRUKTUR: Map<String, List<String>>

    private val hierarchy: Map<String, List<String>> = mapOf(
        "Tomten"     to listOf("Glader", "Butter"),
        "Glader"     to listOf("Tröger", "Trötter", "Blyger"),
        "Butter"     to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
        "Trötter"    to listOf("Skumtomten"),
        "Skumtomten" to listOf("Dammråttan"),
        "Räven"      to listOf("Gråsuggan", "Myran"),
        "Myran"      to listOf("Bladlusen")
    )

    // ============================================================
    // REKURSIV FUNKTION: getUnderlings
    // Parametrar: currentName & res

    fun getUnderlings(currentName: String, res: MutableList<String>): List<String> {
        val directReports = hierarchy[currentName] ?: return res

        res.addAll(directReports)

        for (report in directReports) {
            getUnderlings(report, res)
        }

        return res
    }
}

// Visa hur hierarkin ser ut
fun main() {
    val tl = Tomteland()

    println("Räven underordnade:  ${tl.getUnderlings("Räven",  mutableListOf())}")
    println("Glader underordnade: ${tl.getUnderlings("Glader", mutableListOf())}")
    println("Tomten underordnade: ${tl.getUnderlings("Tomten", mutableListOf())}")
    println("Tröger underordnade: ${tl.getUnderlings("Tröger", mutableListOf())}")
}