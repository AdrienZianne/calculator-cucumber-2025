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
     * The default constructor of the {@link ConstantNumber} class.
     */
    ConstantNumber() { /* Default constructor */ }
}
