package calculator;

import java.util.Collections;

/**
 * Programmer
 * This class represents numbers of different bases.
 * It aims to be flexible by using a base_value notation.
 * The maximum base simply depends on the number of characters available, of
 * which there are currently thirty.
 */
public class Programmer {
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
    public Programmer(String num, int base) {
        if (checkBase(num, base)) {
            this.realNum = num.toUpperCase();
            this.base = base;
            this.binaryNum = conversionToBaseN(2);
            this.prefix = getPrefix();
        } else {
            this.realNum = "";
            this.base = 0;
            this.binaryNum = "";
            this.prefix = null;
        }
    }

    /**
     * Method that checks that the value uses only the symbols authorized by the
     * base.
     * 
     * @param num  The value.
     * @param base The base.
     * @return True if the value is correct according to the base otherwise false.
     */
    private boolean checkBase(String num, int base) {
        for (int i = 0; i < num.length(); i++) {
            if (!chars.substring(0, base).contains(num.substring(i, i + 1))) {
                return false;
            }
        }
        return true;
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
    public boolean logicValue(int index) {
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

        double newRealNum = 0.0;
        for (int i = realNum.length() - 1; i >= 0; i--) {
            double digit = ((int) chars.indexOf(realNum.charAt(i)) * Math.pow(base, realNum.length() - i - 1));
            newRealNum = newRealNum + digit;
        }

        return "" + ((int) newRealNum);
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

        int oldRealNum = Integer.parseInt(conversionToBase10());

        if (newBase == 1) {
            return String.join("", Collections.nCopies(oldRealNum, "0"));
        }

        String res = "";
        while (oldRealNum > 0) {
            res = chars.charAt(oldRealNum % newBase) + res;
            oldRealNum = (int) (oldRealNum / newBase);
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
    public Programmer newBase(int newBase) {
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
    public boolean equals(Programmer n) {
        return binaryNum.equals(n.binaryNum);
    }

    public String toString() {
        if (prefix != null) {
            return prefix + realNum;
        }
        return realNum + "_" + base;
    }
}
