package calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * A class used to store every static value considered as a setting. It cannot
 * be instantiated.
 */
public final class Configuration {
    private Configuration() {
        // Prevents any instantiation of this "static" class
    }

    /*
     * __________________________________________________________________Mode
     */

    /**
     * Mode
     * Enumeration to list the different calculator modes.
     */
    public enum Mode {
        ARITHMETIC, PROGRAMMER
    }

    /**
     * Attribute containing the current mode used by the calculator.
     */
    private static Mode mode = Mode.ARITHMETIC;

    /**
     * Method for changing the calculator mode.
     * 
     * @param mode The desired mode.
     */
    public static void setMode(Mode mode) {
        Configuration.mode = mode;
    }

    /**
     * A method of finding out the current mode used by the calculator.
     * 
     * @return The current mode.
     */
    public static Mode getMode() {
        return mode;
    }

    /*
     * __________________________________________________________________Real_Precision
     */

    private static int realPrecision = 5;
    private static RoundingMode realRoundingMode = RoundingMode.HALF_UP;

    /**
     * Sets the real precision of the {@link MyReal} class.
     * 
     * @param realPrecision The number of decimals values being stored.
     */
    public static void setRealPrecision(int realPrecision) {
        if (realPrecision <= 0)
            return;
        Configuration.realPrecision = realPrecision;
    }

    /**
     * Gets the current real precision of the {@link MyReal} class.
     * 
     * @return The current real precision.
     */
    public static int getRealPrecision() {
        return realPrecision;
    }

    /**
     * Sets the rounding mode of {@link MyReal} class.
     * 
     * @param realRoundingMode How to round the last value.
     */
    public static void setRealRoundingMode(RoundingMode realRoundingMode) {
        Configuration.realRoundingMode = realRoundingMode;
    }

    /**
     * Gets the current rounding mode of {@link MyReal} class.
     * 
     * @return The current rounding mode.
     */
    public static RoundingMode getRealRoundingMode() {
        return realRoundingMode;
    }

    /*
     * __________________________________________________________________Scientific_Notation_Options
     */

    private static boolean useRealNotation = false;
    private static boolean useScientificNotation = false;
    private static int scNotationMaxLeft = 10;
    private static int scNotationMaxRight = 10;

    private static DecimalFormat eNotation = new DecimalFormat("0.###E0", new DecimalFormatSymbols(Locale.UK));

    /**
     * Get the current precision of left-hand scientific notation.
     * 
     * @return The current precision.
     */
    public static int getScNotationMaxLeft() {
        return scNotationMaxLeft;
    }

    /**
     * Sets the current precision of left-hand scientific notation.
     * 
     * @param value The new precision to use.
     */
    public static void setScNotationMaxLeft(int value) {
        scNotationMaxLeft = value;
    }

    /**
     * Get the current precision of right-hand scientific notation.
     * 
     * @return The current precision.
     */
    public static int getScNotationMaxRight() {
        return scNotationMaxRight;
    }

    /**
     * Sets the current precision of right-hand scientific notation.
     * 
     * @param value The new precision to use.
     */
    public static void setScNotationMaxRight(int value) {
        scNotationMaxRight = value;
    }

    /**
     * Get the current precision of the scientific notation.
     * 
     * @return The current precision.
     */
    public static String getScientificNotationPrecision() {
        return scNotationMaxLeft + "digits <-0.-> " + scNotationMaxRight + "digits";
    }

    /**
     * Sets the current precision of the scientific notation.
     * 
     * @param scNotationMaxLeft The new precision to use.
     */
    public static void setScientificNotationPrecision(int scNotationMaxLeft, int scNotationMaxRight) {
        if (scNotationMaxLeft <= 0)
            return;
        Configuration.scNotationMaxLeft = scNotationMaxLeft;
        Configuration.scNotationMaxRight = scNotationMaxRight;
    }

    /**
     * Checks if the scientific notation is being used or not.
     * 
     * @return True if it is, false otherwise.
     */
    public static boolean usesScientificNotation() {
        return useScientificNotation;
    }

    /**
     * Changes whether big numbers are displayed using a scientific notation or not
     * 
     * @param useScientificNotation True if the scientific notation is to be used,
     *                              false otherwise.
     */
    public static void setUseScientificNotation(boolean useScientificNotation) {
        Configuration.useScientificNotation = useScientificNotation;
    }

    /**
     * If set to true, then when displaying a {@link MyRational} instance it will be
     * displayed as a {@link MyReal} instance.
     * Else, the rational will be simply displayed.
     * 
     * @param useRealNotation a boolean value
     */
    public static void setUseRealNotation(boolean useRealNotation) {
        Configuration.useRealNotation = useRealNotation;
    }

    /**
     * If returns true, then when displaying a {@link MyRational} instance it will
     * be displayed as a {@link MyReal} instance.
     * Else, the rational will be simply displayed.
     */
    public static boolean isUsingRealNotation() {
        return useRealNotation;
    }

    public static String getNotation(BigDecimal r) {
        if (!useScientificNotation)
            return r.stripTrailingZeros().toPlainString();
        r = r.abs();

        // Zero is a special case
        if (r.compareTo(BigDecimal.ZERO) == 0)
            return "0";

        // Check if eNotation is needed
        // If it has more digits than allowed on the left side of zero
        if (r.compareTo(new BigDecimal("1" + "0".repeat(scNotationMaxLeft))) > 0)
            return eNotation.format(r);
        // If it has more digits than allowed on the right side of zero
        if (r.compareTo(new BigDecimal("0." + "0".repeat(scNotationMaxRight - 1) + "1")) < 0)
            return eNotation.format(r);
        // If not we return the default string value.
        return r.stripTrailingZeros().toPlainString();
    }

    /*
     * __________________________________________________________________Trigonometric_Options
     */

    /**
     * Attribute that lets you know whether you're working on degrees or radians.
     */
    private static boolean useDegrees = true;

    /**
     * A method that lets you know whether you're working on degrees or not.
     * 
     * @return Preference.
     */
    public static boolean isUsingDegrees() {
        return useDegrees;
    }

    /**
     * Method for choosing whether to work on degrees or not.
     * 
     * @param useDegrees The choice.
     */
    public static void setUseDegrees(boolean useDegrees) {
        Configuration.useDegrees = useDegrees;
    }

    /*
     * __________________________________________________________________RandomGenerator
     */

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
     * 
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

    /*
     * __________________________________________________________________Programmer
     */

    /**
     * When this variable is true, the notation conventions are activated.
     * For example, 10_2 -> 0b10.
     */
    private static boolean baseNotationConvention = true;

    /**
     * When the variable is true and the value is a decimal, the values 0 and 1 are
     * replaced by F and T.
     */
    private static boolean logicalSymbol = true;

    /**
     * Method for determining whether or not to display base conventions.
     * 
     * @return True if conventions are to be displayed, False otherwise.
     */
    public static boolean getBaseNotationConvention() {
        return baseNotationConvention;
    }

    /**
     * Method for choosing whether or not to display conventions.
     * 
     * @param value True if conventions are to be displayed, False otherwise.
     */
    public static void setBaseNotationConvention(boolean value) {
        baseNotationConvention = value;
    }

    /**
     * Method for determining whether or not to display logic symbols T and F.
     * 
     * @return True if displayed, False otherwise.
     */
    public static boolean getLogicalSymbol() {
        return logicalSymbol;
    }

    /**
     * Method for choosing how to display logic values.
     * 
     * @param value True if displayed, False otherwise.
     */
    public static void setLogicalSymbol(boolean value) {
        logicalSymbol = value;
    }

    /*
     * __________________________________________________________________Memory
     */

    /**
     * Value representing the maximum number of expressions to be stored in memory.
     * In logs and favors.
     */
    private static int maxStore = 100;

    /**
     * If this value is set to True, then an expression will not be added to memory
     * if it is already present. This works for logs and favors.
     */
    private static boolean deleteDuplicates = false;

    /**
     * Method for recovering the maximum size of logs and favos.
     * 
     * @return Maximum size
     */
    public static int getMaxStore() {
        return maxStore;
    }

    /**
     * Method for changing the maximum size of logs and bookmarks.
     * 
     * @param max the desired size. This must be a positive number.
     */
    public static void setMaxStore(int max) {
        if (max > 0) {
            maxStore = max;
        }
    }

    /**
     * Method for checking whether duplicates have been removed from logs and
     * favors.
     * 
     * @return Duplicates are deleted or not.
     */
    public static boolean getDeleteDuplicates() {
        return deleteDuplicates;
    }

    /**
     * Method for choosing whether or not to delete duplicates.
     * 
     * @param delete Desired behavior.
     */
    public static void setDeleteDuplicates(boolean delete) {
        deleteDuplicates = delete;
    }
}
