package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.math.BigInteger;

class TestRandomGenerator {

    /**
     * Method for testing integer generation.
     * First we test whether we can generate a number, then whether the number
     * generated is the right one according to the seed and finally whether we can
     * disable the seed and generate numbers without any problem.
     */
    @Test
    void testRandomInt() {
        assertNotNull(RandomGenerator.genInt(new BigInteger("10")));
        Configuration.setSeed(0);
        assertEquals(new MyInteger(0), RandomGenerator.genInt(new BigInteger("10")));
        Configuration.resetSeed();
        assertNotNull(RandomGenerator.genInt(new BigInteger("10")));
    }

    /**
     * Method for testing real generation.
     * First we test whether we can generate a number, then whether the number
     * generated is the right one according to the seed and finally whether we can
     * disable the seed and generate numbers without any problem.
     */
    @Test
    void testRandomReal() {
        assertNotNull(RandomGenerator.genReal());
        Configuration.setSeed(0);
        assertEquals(new MyReal("0.73097"), RandomGenerator.genReal());
        Configuration.resetSeed();
        assertNotNull(RandomGenerator.genReal());
    }

    /**
     * Method for testing rational generation.
     * First we test whether we can generate a number, then whether the number
     * generated is the right one according to the seed and finally whether we can
     * disable the seed and generate numbers without any problem.
     */
    @Test
    void testRandomRatio() {
        assertNotNull(RandomGenerator.genRational(new BigInteger("10"), new BigInteger("30")));
        Configuration.setSeed(1); // With a seed of 0, the generation of the number will give 0 for the
                                  // denominator, which poses a problem for a rational number.
        assertEquals(RandomGenerator.genRational(new BigInteger("10"), new BigInteger("30")), MyRational.create(3, 19));
        Configuration.resetSeed();
        assertNotNull(RandomGenerator.genRational(new BigInteger("10"), new BigInteger("30")));
    }

    /**
     * Method for testing complex generation.
     * First we test whether we can generate a number, then whether the number
     * generated is the right one according to the seed and finally whether we can
     * disable the seed and generate numbers without any problem.
     */
    @Test
    void testRandomComplex() {
        assertNotNull(RandomGenerator.genComplex());
        Configuration.setSeed(0);
        assertEquals(RandomGenerator.genComplex(), MyComplex.create(new MyReal("0.73097"), new MyReal("0.73097")));
        Configuration.resetSeed();
        assertNotNull(RandomGenerator.genComplex());
    }
}
