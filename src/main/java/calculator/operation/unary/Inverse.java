package calculator.operation.unary;

import calculator.*;
import calculator.operation.binary.Divides;
import calculator.operation.binary.Times;
import calculator.operation.binary.Plus;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * A class used to represent the inversion of an expression.
 * Let {@code x} be our expression, the operation will result in {@code 1/x}.
 */
public class Inverse extends UnaryOperation {
    /**
     * The default constructor of the {@link Inverse} class.
     * 
     * @param arg The argument to apply the inverse operation to.
     * @throws IllegalConstruction
     */
    public Inverse(Expression arg) throws IllegalConstruction {
        this(arg, null);
    }

    /**
     * A constructor of the {@link Inverse} class.
     * 
     * @param arg      The argument to apply the inverse operation to.
     * @param notation The notation to display this operation with.
     * @throws IllegalConstruction
     */
    public Inverse(Expression arg, Notation notation) throws IllegalConstruction {
        super(arg, notation);
        symbol = "1/";
    }

    @Override
    public MyNumber op(MyInteger i) throws IllegalConstruction {
        if (i.isZero()) {
            throw new IllegalConstruction();
        }
        return MyRational.create(MyInteger.valueOf(1), MyInteger.valueOf(i.getValue()));
    }

    @Override
    public MyNumber op(MyReal r) throws IllegalConstruction {
        if (r.isZero()) {
            throw new IllegalConstruction();
        }
        MyNumber rational = MyRational.toRational(r);
        try {
            return op(rational);
        } catch (ExecutionControl.NotImplementedException e) {
            return new MyErrorNumber(null, ""); // FIXME axel
        }
    }

    @Override
    public MyNumber op(MyRational r) throws IllegalConstruction {
        if (r.isZero()) {
            throw new IllegalConstruction();
        }
        return MyRational.create(r.getNumDenomPair().b, r.getNumDenomPair().a);
    }

    @Override
    public MyNumber op(MyComplex c) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        if (c.isZero()) {
            throw new IllegalConstruction();
        }
        // Denom : a^2 + b^2
        Plus plus = new Plus(List.of());
        Times times = new Times(List.of());
        Divides divides = new Divides(List.of());
        Negation negation = new Negation(c);
        MyNumber denom = plus.op(times.op(c.getRealImaginaryPair().a, c.getRealImaginaryPair().a),
                times.op(c.getRealImaginaryPair().b, c.getRealImaginaryPair().b));

        return new MyComplex(divides.op(c.getRealImaginaryPair().a, denom),
                negation.op(divides.op(c.getRealImaginaryPair().b, denom)));
    }
}
