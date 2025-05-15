package calculator.operation.unary;

import calculator.*;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Divides;
import calculator.operation.binary.Times;

/**
 * A class used to represent the radian to degree conversion.
 * Let {@code x} be our number, the operation will result in {@code x * 180/π}.
 */
public final class RadianToDegree extends DegreeRadianConvertor {
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
        super(argument, "RadToDeg", notation, MyInteger.valueOf(180), ConstantNumber.PI);
    }

    @Override
    public MyNumber op(MyUnknown x) {return MyUnknown.applyToAllOperators(x, RadianToDegree::new);}

}