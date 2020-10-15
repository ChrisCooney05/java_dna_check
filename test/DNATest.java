import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DNATest {
    DNA dna = new DNA();

    @Test
    void hasStartCodon() {
        String test1 = "ATG";
        String test2 = "TGA";
        assertTrue(dna.hasStartCodon(test1));
        assertFalse(dna.hasStartCodon(test2));
    }

    @Test
    void hasEndCodon() {
        String test1 = "ATG";
        String test2 = "TGA";
        assertTrue(dna.hasEndCodon(test2));
        assertFalse(dna.hasEndCodon(test1));
    }

    @Test
    void isCorrectLength() {
        String test1 = "ATGCGATACGCTTGA";
        String test2 = "ATGCGATACGTGA";
        assertTrue(dna.isCorrectLength(test1));
        assertFalse(dna.isCorrectLength(test2));
    }

    @Test
    void hasProtein() {
        String test1 = "ATGCGATACGCTTGA";
        String test2 = "ATGCGATACGTGA";
        assertEquals("Protein found: CGATACGCT", dna.hasProtein(test1));
        assertEquals("No Protein found", dna.hasProtein(test2));
    }
}