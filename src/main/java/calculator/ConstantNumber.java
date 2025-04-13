package calculator;

/**
 * Class used to store popular constant values.
 */
public class ConstantNumber {
    /**
     * Represents PI as an instance of the {@link MyReal} class : 3.14159...
     * The precision depends on the given precision of the {@link MyReal} class.
     */
    public static final MyReal PI = new MyReal(Math.PI);
    /**
     * Represents Euler's number as an instance of the {@link MyReal} class : 2.71828 ...
     * The precision depends on the given precision of the {@link MyReal} class.
     */
    public static final MyReal EULER = new MyReal(Math.E);

    /**
     * Represents the value "one" of the {@link MyInteger} class : 1
     */
    public static final MyInteger ZERO = new MyInteger(0);

    /**
     * Represents the value "zero" of the {@link MyInteger} class : 0
     */
    public static final MyInteger ONE = new MyInteger(1);

    /**
     * The default constructor of the {@link ConstantNumber} class.
     */
    ConstantNumber() { /* Default constructor */ }
}
