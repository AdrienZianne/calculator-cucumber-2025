package calculator;

import java.math.BigInteger;
import java.util.Collections;

/**
 * Programmer
 * This class represents numbers of different bases.
 * It aims to be flexible by using a base_value notation.
 * The maximum base simply depends on the number of characters available, of
 * which there are currently thirty.
 * {@link Configuration}
 */
public class Programmer {
    /**
     * ProgrammerException
     * Class used to represent a number creation error.
     * This is necessary because no error can be thrown into the parser.
     * 
     * An error number is represented by a base of 0 and contains the error message
     * in realNum.
     */
    public static class ProgrammerException extends Exception {
        public ProgrammerException(String message) {
            super(message);
        }
    }

    /**
     * The list of characters used to represent numbers.
     * Bases from 1 to 32 inclusive are permitted.
     */
    private static String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUV";

    /**
     * The value on a certain basis.
     */
    public final String realNum;

    /**
     * The number base.
     */
    public final int base;

    /**
     * The binary representation of numbers.
     */
    public final String binaryNum;

    /**
     * The prefix used for the known bases, i.e. binary, octal and hexadecimal.
     */
    public final String prefix;

    /**
     * The class constructor. It checks that the value only uses characters
     * corresponding to its base.
     * 
     * @param num  The value.
     * @param base The base.
     */
    public Programmer(String num, int base) throws ProgrammerException {
        if (base <= 0 || base > chars.length()) {
            throw new ProgrammerException(
                    "Error: A value of " + base + " is not allowed as a base. The base must be between 1 and 32.");

        }

        checkBase(num.toUpperCase(), base);

        this.realNum = num.toUpperCase();
        this.base = base;
        this.binaryNum = conversionToBaseN(2);
        this.prefix = getPrefix();
    }

    /**
     * This constructor is used to create an error number, which represents an
     * error.
     * 
     * We can't throw an error because of the way the parser works.
     * 
     * @param error explanation of the error.
     * 
     *              {@link ProgrammerOperation}
     */
    public Programmer(String error) {
        this.realNum = error;
        this.base = 0;
        this.binaryNum = "";
        this.prefix = null;
    }

    /**
     * Method that checks that the value uses only the symbols authorized by the
     * base.
     * 
     * @param num  The value.
     * @param base The base.
     * @return True if the value is correct according to the base otherwise false.
     */
    private void checkBase(String num, int base) throws ProgrammerException {
        for (int i = 0; i < num.length(); i++) {
            if (!chars.substring(0, base).contains(num.substring(i, i + 1))) {
                throw new ProgrammerException(
                        "Error: The " + num.substring(i, i + 1) + " symbol is not allowed in base " + base + ".");
            }
        }
    }

    /**
     * Method for finding the prefix to use according to the base value.
     * 
     * @return The prefix according to the base.
     */
    private String getPrefix() {
        switch (base) {
            case 2:
                return "0b";
            case 8:
                return "0o";
            case 10:
                return "";
            case 16:
                return "0x";
            default:
                return null;
        }
    }

    /**
     * Method that returns the truth value at a given position of the value.
     * 
     * @param index The position of the desired symbol.
     * @return The truth value of the symbol.
     */
    public boolean logicValue(int index) throws ProgrammerException {
        if (binaryNum.isEmpty()) {
            throw new ProgrammerException(realNum);
        }

        if (index >= binaryNum.length()) {
            return false;
        }
        return binaryNum.charAt(binaryNum.length() - index - 1) == '1';
    }

    /**
     * Method for converting any number from any base to base 10.
     * 
     * @return A value in base 10.
     */
    private String conversionToBase10() {
        if (base == 10) {
            return realNum;
        }
        if (base == 1) {
            return "" + realNum.length();
        }

        BigInteger newRealNum = BigInteger.valueOf(0);
        for (int i = realNum.length() - 1; i >= 0; i--) {
            BigInteger multiplier = new BigInteger("" + chars.indexOf(realNum.charAt(i)));
            BigInteger baseExponentialValue = new BigInteger("" + base).pow(realNum.length() - i - 1);
            BigInteger digit = multiplier.multiply(baseExponentialValue);
            newRealNum = newRealNum.add(new BigInteger("" + digit));
        }

        return newRealNum.toString();
    }

    /**
     * Method of converting any number from any base to a requested base.
     * This method uses base-10 notation.
     * 
     * @param newBase The new base.
     * @return The new value according to the new base.
     */
    private String conversionToBaseN(int newBase) {
        if (base == newBase) {
            return realNum;
        }
        if (newBase == 10) {
            return conversionToBase10();
        }

        BigInteger oldRealNum = new BigInteger(conversionToBase10());

        if (newBase == 1) {
            try {
                return String.join("", Collections.nCopies(oldRealNum.intValueExact(), "0"));
            } catch (ArithmeticException error) {
                // If you can't convert the BigInteger to an integer without losing information,
                // then you need to loop.
                StringBuilder result = new StringBuilder();
                for (BigInteger i = BigInteger.ZERO; i.compareTo(oldRealNum) < 0; i = i.add(BigInteger.ONE)) {
                    result.append("0");
                }
                return result.toString();
            }
        }

        String res = "";
        if (oldRealNum.toString().equals("0")) {
            res = "0";
        } else {
            while (oldRealNum.compareTo(BigInteger.valueOf(0)) > 0) {
                BigInteger[] divideAndRemainder = oldRealNum.divideAndRemainder(new BigInteger("" +
                        newBase));
                res = chars.charAt(divideAndRemainder[1].intValue()) + res;
                oldRealNum = divideAndRemainder[0];
            }
        }

        return res;
    }

    /**
     * Method used to create a Programmer object using the current value and a new
     * base.
     * 
     * @param newBase The new base.
     * 
     * @return A Programmer object with the converted value in the new base.
     */
    public Programmer newBase(int newBase) throws ProgrammerException {
        return new Programmer(conversionToBaseN(newBase), newBase);
    }

    /**
     * Method that returns the size of the value.
     * 
     * @return The size of the value.
     */
    public int length() {
        return binaryNum.length();
    }

    /**
     * Method that compares the current value with another.
     * 
     * @param n The other value to compare.
     * @return True if both values are equivalent, false otherwise.
     */
    public boolean isEquals(Programmer n) {
        return binaryNum.equals(n.binaryNum);
    }

    public String toString() {
        // Base 0 means that there has been an error when creating the number.
        if (base == 0) {
            return realNum;
        }
        if (Configuration.getLogicalSymbol() && base == 10) {
            if (binaryNum.equals("1")) {
                return "T";
            } else if (binaryNum.equals("0")) {
                return "F";
            }
        }
        if (Configuration.getBaseNotationConvention() && prefix != null)

        {
            return prefix + realNum;
        }
        return realNum + "_" + base;
    }
}
