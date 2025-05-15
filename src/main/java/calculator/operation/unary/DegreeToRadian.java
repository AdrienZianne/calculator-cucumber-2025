package calculator.operation.unary;

import calculator.*;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Divides;
import calculator.operation.binary.Times;

/**
 * A class used to represent the degree to radian conversion.
 * Let {@code x} be our number, the operation will result in {@code x * π/180}.
 */
public final class DegreeToRadian extends DegreeRadianConvertor {
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
        super(argument, "degToRad", notation, ConstantNumber.PI, MyInteger.valueOf(180));
    }


    @Override
    public MyNumber op(MyUnknown x) {
        return MyUnknown.applyToAllOperators(x, DegreeToRadian::new);
    }

}
