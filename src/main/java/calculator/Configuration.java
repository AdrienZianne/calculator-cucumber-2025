package calculator;


import java.math.RoundingMode;

/**
 * A class used to store every static value considered as a setting. It cannot be instantiated.
 */
public final class Configuration {
    private Configuration() {
        // Prevents any instantiation of this "static" class
    }

    /*__________________________________________________________________ Real Precision */
    private static int realPrecision = 5;
    private static RoundingMode realRoundingMode = RoundingMode.HALF_UP;

    /**
     * Sets the real precision of the {@link MyReal} class.
     * @param realPrecision The number of decimals values being stored.
     */
    public static void setRealPrecision(int realPrecision) {
        if (realPrecision <= 0) return;
        Configuration.realPrecision = realPrecision;
    }

    /**
     * Gets the current real precision of the {@link MyReal} class.
     * @return The current real precision.
     */
    public static int getRealPrecision() {
        return realPrecision;
    }

    /**
     * Sets the rounding mode of {@link MyReal} class.
     * @param realRoundingMode How to round the last value.
     */
    public static void setRealRoundingMode(RoundingMode realRoundingMode) {
        Configuration.realRoundingMode = realRoundingMode;
    }

    /**
     * Gets the current rounding mode of {@link MyReal} class.
     * @return The current rounding mode.
     */
    public static RoundingMode getRealRoundingMode() {
        return realRoundingMode;
    }

    /*__________________________________________________________________ Scientific Notation Options */
    private static boolean useScientificNotation = false;
    private static int scientificNotationPrecision = 20;

    /**
     * Get the current precision of the scientific notation.
     * @return The current precision.
     */
    public static int getScientificNotationPrecision() {
        return scientificNotationPrecision;
    }

    /**
     * Sets the current precision of the scientific notation.
     * @param scientificNotationPrecision The new precision to use.
     */
    public static void setScientificNotationPrecision(int scientificNotationPrecision) {
        if (scientificNotationPrecision <= 0) return;
        Configuration.scientificNotationPrecision = scientificNotationPrecision;
    }

    /**
     * Checks if the scientific notation is being used or not.
     * @return True if it is, false otherwise.
     */
    public static boolean usesScientificNotation() {
        return useScientificNotation;
    }

    /**
     * Changes whether big numbers are displayed using a scientific notation or not
     * @param useScientificNotation True if the scientific notation is to be used, false otherwise.
     */
    public static void setUseScientificNotation(boolean useScientificNotation) {
        Configuration.useScientificNotation = useScientificNotation;
    }

    /*__________________________________________________________________ Trigonometric Options */

    private static boolean useDegrees = true;


}
