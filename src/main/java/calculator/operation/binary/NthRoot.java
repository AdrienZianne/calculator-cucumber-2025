package calculator.operation.binary;

import calculator.*;

import java.math.MathContext;
import java.util.List;

public class NthRoot extends BinaryOperation {
    public NthRoot(List<Expression> elist) throws IllegalConstruction {
        this(elist, null);
    }

    public NthRoot(List<Expression> elist, Notation n) throws IllegalConstruction {
        super(elist, n);
        symbol = "root";
        neutral = 1;
    }

    @Override
    public MyNumber op(MyInteger l, MyInteger r) {
        return null;
    }

    @Override
    public MyNumber op(MyInteger l, MyReal r) {
        return null;
    }

    @Override
    public MyNumber op(MyInteger l, MyComplex r) {
        return null;
    }

    @Override
    public MyNumber op(MyInteger l, MyRational r) {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyInteger r) {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyReal r) {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyComplex r) {
        return null;
    }

    @Override
    public MyNumber op(MyReal l, MyRational r) {
        return null;
    }

    @Override
    public MyNumber op(MyComplex l, MyInteger r) {
        return null;
    }

    @Override
    public MyNumber op(MyComplex l, MyReal r) {
        return null;
    }

    @Override
    public MyNumber op(MyComplex l, MyComplex r) {
        return null;
    }

    @Override
    public MyNumber op(MyComplex l, MyRational r) {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyInteger r) {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyReal r) {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyComplex r) {
        return null;
    }

    @Override
    public MyNumber op(MyRational l, MyRational r) {
        return null;
    }

    public static double nthroot(int n, double A, double p) {
        if(A < 0) {
            System.err.println("A < 0");// we handle only real positive numbers
            return -1;
        } else if(A == 0) {
            return 0;
        }
        double x_prev = A;
        double x = A / n;  // starting "guessed" value...
        while(Math.abs(x - x_prev) > p) {
            x_prev = x;
            x = ((n - 1.0) * x + A / Math.pow(x, n - 1.0)) / n;
        }
        return x;
    }
}
