package calculator.operation.unary;

import calculator.*;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Divides;
import calculator.operation.binary.Times;

import java.util.Objects;

public abstract class DegreeRadianConvertor extends UnaryOperation {
    private final MyNumber numerator;
    private final MyNumber denominator;

    /**
     * The default constructor of the {@link DegreeToRadian} class.
     *
     * @param expression An expression to apply the conversion to.
     */
    protected DegreeRadianConvertor(Expression expression, String symbol, MyNumber numerator, MyNumber denominator) throws IllegalConstruction {
        this(expression, symbol, null, numerator, denominator);
    }

    /**
     * A constructor of the {@link DegreeToRadian} class.
     *
     * @param argument The argument to apply the conversion to.
     * @param notation The notation to display this operation with.
     */
    protected DegreeRadianConvertor(Expression argument, String symbol, Notation notation, MyNumber numerator, MyNumber denominator) throws IllegalConstruction {
        super(argument, notation);
        this.symbol = symbol;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public MyNumber op(MyInteger i) {
        return convert(i);
    }

    @Override
    public MyNumber op(MyReal r) {
        return convert(r);
    }

    @Override
    public MyNumber op(MyRational r) {
        return convert(r);
    }

    @Override
    public MyNumber op(MyComplex c) {
        return new MyErrorNumber(this,  "Cannot apply a degree and radian transformation on a complex number: " + c);
    }

    @Override
    public MyNumber op(MyInfinity i) {
        return new MyErrorNumber(this,  "Cannot apply a degree/radian conversion from infinity");
    }

    private MyNumber convert(MyNumber og) {
        MyNumber nb = BinaryOperation.op(this.numerator, this.denominator, Divides::new);
        return BinaryOperation.op(og, nb, Times::new);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DegreeRadianConvertor that = (DegreeRadianConvertor) o;
        return Objects.equals(numerator, that.numerator) && Objects.equals(denominator, that.denominator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numerator, denominator);
    }
}
