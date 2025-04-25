package calculator.operation.binary;

import calculator.*;
import calculator.operation.unary.Inverse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestInverse {
    private Calculator calculator = new Calculator();

    @Test
    void testConstruct() {
        assertThrows(IllegalConstruction.class, () -> new Inverse(null));
    }

    @Test
    void testEquals() {
        ArrayList<Pair<MyNumber, MyNumber>> paramResultList = new ArrayList<>();
        // paramResultList.add(new Pair<>(new MyInteger(0), new MyInteger(0)));
        paramResultList.add(new Pair<>(new MyInteger(1), new MyInteger(1)));
        paramResultList
                .add(new Pair<>(new MyReal(-3.5), MyRational.create(MyInteger.valueOf(-2), MyInteger.valueOf(7))));
        paramResultList.add(new Pair<>(MyComplex.create(MyInteger.valueOf(-1), MyInteger.valueOf(2)),
                MyComplex.create(MyRational.create(-1, 5),
                        MyRational.create(-2, 5))));
        try {
            for (Pair<MyNumber, MyNumber> pair : paramResultList) {
                assertEquals(calculator.eval(pair.b), calculator.eval(new Inverse(pair.a)));
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }
}
