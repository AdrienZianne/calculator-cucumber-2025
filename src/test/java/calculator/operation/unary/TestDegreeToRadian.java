package calculator.operation.unary;

import calculator.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDegreeToRadian extends TestUnaryOperation{

    @Test
    @Override
    public void testInteger() throws Exception {

        Configuration.setRealPrecision(5);

        DegreeToRadian op = new DegreeToRadian(new MyInteger(10));
        assertEquals(MyReal.valueOf(0.17453), calculator.eval(op));
    }

    @Test
    @Override
    public void testMyReal() throws Exception {

        Configuration.setRealPrecision(5);

        DegreeToRadian op = new DegreeToRadian(new MyReal(5.5));
        assertEquals(MyReal.valueOf(0.0959931), calculator.eval(op));
    }

    @Test
    @Override
    public void testMyRational() throws Exception {
        Configuration.setRealPrecision(5);

        DegreeToRadian op = new DegreeToRadian(MyRational.toRational(new MyReal(5.5)));
        assertEquals(MyReal.valueOf(0.0959931), calculator.eval(op));
    }

    @Test
    @Override
    public void testMyComplex() throws Exception {
        DegreeToRadian op = new DegreeToRadian(MyComplex.create(1,1));
        assertEquals(MyErrorNumber.class, calculator.eval(op).getClass());
    }

    @Test
    @Override
    public void testMyInfinity() throws Exception {
        DegreeToRadian op = new DegreeToRadian(new MyInfinity(true));
        assertEquals(MyErrorNumber.class, calculator.eval(op).getClass());
        op = new DegreeToRadian(new MyInfinity(false));
        assertEquals(MyErrorNumber.class, calculator.eval(op).getClass());
    }

    @Test
    @Override
    public void testMyUnknown() throws Exception {
        MyUnknown other = (MyUnknown) MyUnknown.create(List.of(
                        new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
                        new Pair<>(MyInteger.valueOf(5), MyInteger.valueOf(3)),
                        new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(0)),
                        new Pair<>(MyInteger.valueOf(5), MyInteger.valueOf(20))
                ),
                MyInteger.valueOf(8));

        DegreeToRadian op = new DegreeToRadian(other);
        assertEquals(MyUnknown.applyToAllOperators(other, DegreeToRadian::new),
                calculator.eval(op));
    }
}
