package calculator.operation.unary;

import calculator.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestNegation {
    private final Calculator calculator = new Calculator();


    @Test
    void testEquals()
    {
        ArrayList<Pair<MyNumber, MyNumber>> paramResultList = new ArrayList<>();
        paramResultList.add(new Pair<>(new MyInteger(0), new MyInteger(0)));
        paramResultList.add(new Pair<>(new MyInteger(1), new MyInteger(-1)));
        paramResultList.add(new Pair<>(new MyReal(-3.5), new MyReal(3.5)));
        paramResultList.add(new Pair<>(MyRational.create(2, 3), MyRational.create(-2,3)));
        paramResultList.add(new Pair<>(MyComplex.create(MyInteger.valueOf(-1), MyInteger.valueOf(2)), MyComplex.create(MyInteger.valueOf(1), MyInteger.valueOf(-2))));
        try {
            for (Pair<MyNumber, MyNumber> pair : paramResultList) {
                assertEquals(pair.b, calculator.eval(new Negation(pair.a)));
            }
        }
        catch (IllegalConstruction e) { fail(); }
    }
}
