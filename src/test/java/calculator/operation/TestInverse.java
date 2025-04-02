package calculator.operation;

import calculator.*;
import calculator.operation.unary.Inverse;
import calculator.operation.unary.Negation;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestInverse {
    private Calculator calculator = new Calculator();


    @Test
    void testConstruct()
    {
        assertThrows(IllegalConstruction.class, () -> new Negation(null));
    }

    @Test
    void testEquals()
    {
        ArrayList<Pair<MyNumber, MyNumber>> paramResultList = new ArrayList<>();
        //paramResultList.add(new Pair<>(new MyInteger(0), new MyInteger(0)));
        paramResultList.add(new Pair<>(new MyInteger(1), new MyInteger(1)));
        paramResultList.add(new Pair<>(new MyReal(-3.5), new MyRational(MyInteger.valueOf(-2), MyInteger.valueOf(7))));
        paramResultList.add(new Pair<>(new MyComplex(MyInteger.valueOf(-1), MyInteger.valueOf(2)),
                                        new MyComplex(new MyRational(-1, 5),
                                                      new MyRational(-2, 5))));
        try {
            for (Pair<MyNumber, MyNumber> pair : paramResultList) {
                assertEquals(calculator.eval(pair.b), calculator.eval(new Inverse(pair.a)));
            }
        }
        catch (IllegalConstruction e) { fail(); } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }
}
