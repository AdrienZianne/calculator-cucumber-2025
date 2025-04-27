package calculator;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

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
    private static int scNotationMaxLeft = 10;
    private static int scNotationMaxRight = 10;

    private static DecimalFormat eNotation = new DecimalFormat("0.###E0", new DecimalFormatSymbols(Locale.UK));

    /**
     * Get the current precision of the scientific notation.
     * @return The current precision.
     */
    public static String getScientificNotationPrecision() {
        return scNotationMaxLeft + "digits <-0.-> " + scNotationMaxRight + "digits";
    }

    /**
     * Sets the current precision of the scientific notation.
     * @param scNotationMaxLeft The new precision to use.
     */
    public static void setScientificNotationPrecision(int scNotationMaxLeft, int scNotationMaxRight) {
        if (scNotationMaxLeft <= 0) return;
        Configuration.scNotationMaxLeft = scNotationMaxLeft;
        Configuration.scNotationMaxRight = scNotationMaxRight;
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


    public static String getNotation(BigDecimal r)
    {
        if (!useScientificNotation) return r.stripTrailingZeros().toPlainString();
        r = r.abs();

        // Zero is a special case
        if (r.compareTo(BigDecimal.ZERO) == 0) return "0";

        // Check if eNotation is needed
        // If it has more digits than allowed on the left side of zero
        if (r.compareTo(new BigDecimal("1" + "0".repeat(scNotationMaxLeft))) > 0) return eNotation.format(r);
        // If it has more digits than allowed on the right side of zero
        if (r.compareTo(new BigDecimal("0." + "0".repeat(scNotationMaxRight-1) + "1")) < 0) return eNotation.format(r);
        // If not we return the default string value.
        return r.stripTrailingZeros().toPlainString();
    }

    /*__________________________________________________________________ Trigonometric Options */

    private static boolean useDegrees = true;


    public static boolean isUsingDegrees() {
        return useDegrees;
    }

    public static void setUseDegrees(boolean useDegrees) {
        Configuration.useDegrees = useDegrees;
    }

}
