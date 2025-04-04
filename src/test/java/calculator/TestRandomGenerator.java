package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.math.BigInteger;

class TestRandomGenerator {

    @Test
    void testRandomInt() {
        assertNotNull(RandomGenerator.genInt(new BigInteger("10")));
        RandomGenerator.setSeed(0);
        assertEquals(RandomGenerator.genInt(new BigInteger("10")), new MyInteger(0));
        RandomGenerator.resetSeed();
        assertNotNull(RandomGenerator.genInt(new BigInteger("10")));
    }

    @Test
    void testRandomReal() {
        assertNotNull(RandomGenerator.genReal());
        RandomGenerator.setSeed(0);
        assertEquals(RandomGenerator.genReal(), new MyReal("0.73097"));
        RandomGenerator.resetSeed();
        assertNotNull(RandomGenerator.genReal());
    }

    @Test
    void testRandomRatio() {
        assertNotNull(RandomGenerator.genRational(new BigInteger("10"), new BigInteger("30")));
        RandomGenerator.setSeed(1); // With a seed of 0, the generation of the number will give 0 for the
                                    // denominator, which poses a problem for a rational number.
        assertEquals(RandomGenerator.genRational(new BigInteger("10"), new BigInteger("30")), new MyRational(3, 19));
        RandomGenerator.resetSeed();
        assertNotNull(RandomGenerator.genRational(new BigInteger("10"), new BigInteger("30")));
    }

    @Test
    void testRandomComplex() {
        assertNotNull(RandomGenerator.genComplex());
        RandomGenerator.setSeed(0);
        assertEquals(RandomGenerator.genComplex(), new MyComplex(new MyReal("0.73097"), new MyReal("0.73097")));
        RandomGenerator.resetSeed();
        assertNotNull(RandomGenerator.genComplex());
    }
}
