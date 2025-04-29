package calculator.operation.unary;

import calculator.*;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Divides;
import calculator.operation.binary.Times;

/**
 * A class used to represent the radian to degree conversion.
 * Let {@code x} be our number, the operation will result in {@code x * 180/π}.
 */
public class RadianToDegree extends UnaryOperation {
    /**
     * The default constructor of the {@link RadianToDegree} class.
     *
     * @param expression An expression to apply the conversion to.
     */
    public RadianToDegree(Expression expression) throws IllegalConstruction {
        this(expression, null);
    }

    /**
     * A constructor of the {@link RadianToDegree} class.
     *
     * @param argument The argument to apply the conversion to.
     * @param notation The notation to display this operation with.
     */
    public RadianToDegree(Expression argument, Notation notation) throws IllegalConstruction {
        super(argument, notation);
        symbol = "RadToDeg";
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
        return new MyErrorNumber(this,  "Cannot apply a transformation from radian to degree on a complex number: " + c);
    }

    private static MyNumber degToRadian(MyNumber og) {
        MyNumber nb = BinaryOperation.op(MyInteger.valueOf(180), ConstantNumber.PI, Divides::new);
        return BinaryOperation.op(og, nb, Times::new);
    }

}
