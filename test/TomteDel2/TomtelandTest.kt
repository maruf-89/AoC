package TomteDel2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

// 8 tester: lövnoder → tom lista (size == 0)
// 7 tester: noder med underordnade → rätt antal och innehåll

class TomtelandTest {

    private val tl = Tomteland()

    private val uTomten = listOf(
        "Glader", "Butter",
        "Tröger", "Trötter", "Blyger",
        "Skumtomten", "Dammråttan",
        "Rådjuret", "Nyckelpigan", "Haren", "Räven",
        "Gråsuggan", "Myran", "Bladlusen"
    )
    private val uGlader     = listOf("Tröger", "Trötter", "Blyger", "Skumtomten", "Dammråttan")
    private val uButter     = listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen")
    private val uTrötter    = listOf("Skumtomten", "Dammråttan")
    private val uSkumtomten = listOf("Dammråttan")
    private val uRäven      = listOf("Gråsuggan", "Myran", "Bladlusen")
    private val uMyran      = listOf("Bladlusen")

    // LÖVNODER — ska returnera tom lista

    @Test fun getUnderlingsBladlusenTest() {
        assertEquals(0, tl.getUnderlings("Bladlusen", mutableListOf()).size)
    }

    @Test fun getUnderlingsTrögerTest() {
        assertEquals(0, tl.getUnderlings("Tröger", mutableListOf()).size)
    }

    @Test fun getUnderlingsBlygerTest() {
        assertEquals(0, tl.getUnderlings("Blyger", mutableListOf()).size)
    }

    @Test fun getUnderlingsDammråttanTest() {
        assertEquals(0, tl.getUnderlings("Dammråttan", mutableListOf()).size)
    }

    @Test fun getUnderlingsGråsugganTest() {
        assertEquals(0, tl.getUnderlings("Gråsuggan", mutableListOf()).size)
    }

    @Test fun getUnderlingsHarenTest() {
        assertEquals(0, tl.getUnderlings("Haren", mutableListOf()).size)
    }

    @Test fun getUnderlingsNyckelpiganTest() {
        assertEquals(0, tl.getUnderlings("Nyckelpigan", mutableListOf()).size)
    }

    @Test fun getUnderlingsRådjuretTest() {
        assertEquals(0, tl.getUnderlings("Rådjuret", mutableListOf()).size)
    }

    // NODER MED UNDERORDNADE — rätt antal och rätt innehåll

    @Test fun getUnderlingsMyranTest() {
        val result = tl.getUnderlings("Myran", mutableListOf())
        assertEquals(uMyran.size, result.size)
        assertTrue(result.containsAll(uMyran))
    }

    @Test fun getUnderlingsRävenTest() {
        val result = tl.getUnderlings("Räven", mutableListOf())
        assertEquals(uRäven.size, result.size)
        assertTrue(result.containsAll(uRäven))
    }

    @Test fun getUnderlingsSkumtomtenTest() {
        val result = tl.getUnderlings("Skumtomten", mutableListOf())
        assertEquals(uSkumtomten.size, result.size)
        assertTrue(result.containsAll(uSkumtomten))
    }

    @Test fun getUnderlingsTrötterTest() {
        val result = tl.getUnderlings("Trötter", mutableListOf())
        assertEquals(uTrötter.size, result.size)
        assertTrue(result.containsAll(uTrötter))
    }

    @Test fun getUnderlingsButterTest() {
        val result = tl.getUnderlings("Butter", mutableListOf())
        assertEquals(uButter.size, result.size)
        assertTrue(result.containsAll(uButter))
    }

    @Test fun getUnderlingsGladerTest() {
        val result = tl.getUnderlings("Glader", mutableListOf())
        assertEquals(uGlader.size, result.size)
        assertTrue(result.containsAll(uGlader))
    }

    @Test fun getUnderlingsTomtenTest() {
        val result = tl.getUnderlings("Tomten", mutableListOf())
        assertEquals(uTomten.size, result.size)
        assertTrue(result.containsAll(uTomten))
    }
}