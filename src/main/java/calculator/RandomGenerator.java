package calculator;

import java.math.BigInteger;
import java.util.Random;

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
     * Gets the seed used to generate numbers.
     * @return The seed used.
     */
    public static Integer getSeed() {
        return seed;
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
     * If the seed is set and the generator gives 0 when generating an integer, we
     * call MyRational.create(), which returns a MyErrorNumber object to indicate an
     * error.If the seed is set and the generator gives 0 when generating an
     * integer, we call MyRational.create(), which returns a MyErrorNumber object to
     * indicate an error.If the seed is set and the generator gives 0 when
     * generating an integer, we call MyRational.create(), which returns a
     * MyErrorNumber object to indicate an error.
     *
     * @param max1 The maximum value the numerator can have.
     * @param max2 The maximum value the denominator can have.
     * @return The randomly generated number.
     */
    public static MyNumber genRational(BigInteger max1, BigInteger max2) {
        MyInteger num = genInt(max1);
        MyInteger den = genInt(max2);
        if (den.equals(new MyInteger(0))) {
            return MyRational.create(num, den);
        }
        while (den.equals(new MyInteger(0))) {
            den = genInt(max2);
        }
        return MyRational.create(num, den);
    }

    /**
     * This method generates a complex number randomly. The real and imaginary parts
     * will be random reals between 0 and 1.
     *
     * @return The randomly generated number.
     */
    public static MyNumber genComplex() {
        return MyComplex.create(genReal(), genReal());
    }
}
