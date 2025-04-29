package calculator.operation.unary;

import calculator.*;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Divides;
import calculator.operation.binary.Times;

/**
 * A class used to represent the degree to radian conversion.
 * Let {@code x} be our number, the operation will result in {@code x * π/180}.
 */
public class DegreeToRadian extends UnaryOperation {
    /**
     * The default constructor of the {@link DegreeToRadian} class.
     *
     * @param expression An expression to apply the conversion to.
     */
    public DegreeToRadian(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }

    /**
     * A constructor of the {@link DegreeToRadian} class.
     *
     * @param argument The argument to apply the conversion to.
     * @param notation The notation to display this operation with.
     */
    public DegreeToRadian(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation);
        symbol = "degToRad";
    }

    @Override
    public MyNumber op(MyInteger i) {
        return degToRadian(i);
    }

    @Override
    public MyNumber op(MyReal r) {
        return degToRadian(r);
    }

    @Override
    public MyNumber op(MyRational r) {
        return degToRadian(r);
    }

    @Override
    public MyNumber op(MyComplex c) {
        return new MyErrorNumber(this,  "Cannot apply a transformation from degrees to radians on a complex number: " + c);
    }

    private static MyNumber degToRadian(MyNumber og) {
        MyNumber nb = BinaryOperation.op(ConstantNumber.PI, MyInteger.valueOf(180), Divides::new);
        return BinaryOperation.op(og, nb, Times::new);
    }

}
