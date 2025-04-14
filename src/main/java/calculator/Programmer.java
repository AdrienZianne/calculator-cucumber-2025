package calculator;

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
     */
    private static String chars = "0123456789abcdefghijklmnopqrst";

    /**
     * The value on a certain basis.
     */
    private String num = "";

    /**
     * The number base.
     */
    private int base = 0;

    /**
     * The class constructor. It checks that the value only uses characters
     * corresponding to its base.
     * 
     * @param num  The value.
     * @param base The base.
     */
    public Programmer(String num, int base) {
        if (checkBase(num, base)) {
            this.num = num;
            this.base = base;
        }
    }

    /**
     * The class constructor. It checks that the value only uses characters
     * corresponding to its base.
     * 
     * @param numBase Value and base written as a single string with an underscore
     *                to separate them.
     */
    public Programmer(String numBase) {
        String[] parse = numBase.split("_");
        if (parse.length == 2) {
            if (checkBase(parse[0], Integer.parseInt(parse[1]))) {
                this.num = parse[0];
                this.base = Integer.parseInt(parse[1]);
            }
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
     * Create a value from negation by inverting each of the values, 0->1 and 1->0.
     * 
     * @return The negation of value.
     */
    public Programmer negation() {
        String res = "";
        for (int i = 0; i < num.length(); i++) {
            if (logicValue(i)) {
                res = res + "0";
            } else {

                res = res + "1";
            }
        }
        return new Programmer(res, 2);
    }

    /**
     * Method for creating a value from the current value by cutting off the
     * beginning of a certain size.
     * 
     * @param size The size of the remaining value. If the size is negative, the
     *             same number is returned.
     * @return The truncated value
     */
    public Programmer trunk(int size) {
        if (size >= num.length()) {
            return new Programmer("", 2);
        }
        if (size <= 0) {
            return new Programmer(num, 2);
        }
        return new Programmer(num.substring(num.length() - size), 2);
    }

    /**
     * Method that returns the truth value at a given position of the value.
     * 
     * @param index The position of the desired symbol.
     * @return The truth value of the symbol.
     */
    public boolean logicValue(int index) {
        if (index >= num.length()) {
            return false;
        }
        return num.charAt(num.length() - index - 1) == '1';
    }

    /**
     * Method that returns the size of the value.
     * 
     * @return The size of the value.
     */
    public int length() {
        return num.length();
    }

    /**
     * Method that returns a copy of the value.
     * 
     * @return The value.
     */
    public String getNum() {
        return new String(num);
    }

    /**
     * Method that returns the base used for the value.
     * 
     * @return The base.
     */
    public int getBase() {
        return base;
    }

    /**
     * Method that compares the current value with another.
     * 
     * @param n The other value to compare.
     * @return True if both values are equivalent, false otherwise.
     */
    public boolean equals(Programmer n) {
        return num.equals(n.getNum());
    }

    public String toString() {
        return num + "_" + base;
    }
}
