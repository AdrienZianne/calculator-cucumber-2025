package calculator;

import java.math.BigInteger;
import java.util.Random;

/*
seed -> seed(int num)
reset seed -> seed()
integer -> rand_int(int max)
real -> rand_real()
rational -> rand_ratio(int max1, int max2)
complexe -> rand_cpl()
*/

/**
 * The purpose of this class is to generate random numbers for different types.
 * The seed can be chosen to have a deterministic output.
 */
public abstract class RandomGenerator {
    /**
     * The seed used for number generation, if not defined then not used.
     */
    private static Integer seed = null;

    /**
     * Set the seed for use in future generations.
     */
    public static void setSeed(int customSeed) {
        seed = customSeed;
    }

    /**
     * Deactivates seed.
     */
    public static void resetSeed() {
        seed = null;
    }

    /**
     * This method generates a random integer number between 0 and the maximum
     * specified in the parameter.
     *
     * @param max The maximum value the random number can have.
     * @return The randomly generated number.
     */
    public static MyInteger genInt(BigInteger max) {
        Random rand = seed == null ? new Random() : new Random(seed);
        BigInteger res;
        do {
            res = new BigInteger(max.bitLength(), rand);
        } while (res.compareTo(max) >= 0);
        return new MyInteger(res);
    }

    /**
     * This method generates a random real number between 0 and 1.
     *
     * @return The randomly generated number.
     */
    public static MyReal genReal() {
        Random rand = seed == null ? new Random() : new Random(seed);
        return new MyReal(rand.nextDouble());
    }

    /**
     * This method generates a random rational number by generating two integers,
     * one for the numerator and one for the denominator.
     *
     * @param max1 The maximum value the numerator can have.
     * @param max2 The maximum value the denominator can have.
     * @return The randomly generated number.
     */
    public static MyRational genRational(BigInteger max1, BigInteger max2) {
        return new MyRational(genInt(max1), genInt(max2));
    }

    /**
     * This method generates a complex number randomly. The real and imaginary parts
     * will be random reals between 0 and 1.
     *
     * @return The randomly generated number.
     */
    public static MyComplex genComplex() {
        return new MyComplex(genReal(), genReal());
    }
}
