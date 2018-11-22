import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    private Utilities utils;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        //fail("This test has not been implemented");
        utils = new Utilities();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        //fail("This test has not been implemented");
    }

    @org.junit.jupiter.api.Test
    void everyNthChar() {
        //fail("This test has not been implemented");
        char[] output = utils.everyNthChar(new  char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] { 'e', 'l'}, output);
        char[] output2 = utils.everyNthChar(new  char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @org.junit.jupiter.api.Test
    void removePairs() {
        //fail("This test has not been implemented");
        assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utils.removePairs("ABCCABDEEF"));
        assertNull(utils.removePairs(null), "Did not get null returned when argument passed was null");
        assertEquals("A", utils.removePairs("A"));
        assertEquals("", utils.removePairs(""));
    }

    @org.junit.jupiter.api.Test
    void converter() {
        //fail("This test has not been implemented");
        assertEquals(300, utils.converter(10, 5));
    }

    /**
     * Checking if a method throws Arithmetic Exception in case
     * a number was divided by 0.
     */
    @org.junit.jupiter.api.Test
    void converter_arithmeticException(){
        //fail("This test has not been implemented");
        assertThrows(ArithmeticException.class, () -> utils.converter(10,0));
    }

    @org.junit.jupiter.api.Test
    void nullIfOddLength() {
        //fail("This test has not been implemented");
        assertNull(utils.nullIfOddLength("odd"));
        assertNotNull(utils.nullIfOddLength("even"));
    }
}