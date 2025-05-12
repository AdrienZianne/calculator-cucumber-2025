package calculator;

import calculator.operation.binary.Plus;
import calculator.operation.unary.Negation;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MyUnknownTest {

    @Test
    void testCreate() {
        // Let's create the operation :
        // create(List<Pair<MyNumber, MyNumber>> operands, MyNumber rest)
        MyNumber val = MyUnknown.create((List<Pair<MyNumber, MyNumber>>) null, MyInteger.valueOf(1));
        assertEquals(MyErrorNumber.class, val.getClass());

        val = MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(1), MyInteger.valueOf(2))),
                null);
        assertEquals(MyErrorNumber.class, val.getClass());

        val = MyUnknown.create(List.of(new Pair<>(null, MyInteger.valueOf(2))),
                MyInteger.valueOf(2));
        assertEquals(MyErrorNumber.class, val.getClass());

        val = MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(2), null)),
                MyInteger.valueOf(2));
        assertEquals(MyErrorNumber.class, val.getClass());

        MyUnknown other = (MyUnknown) MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3))),
                MyInteger.valueOf(8));
        assertEquals(MyInteger.valueOf(8), other.getRest());

        assertEquals(Map.of(MyInteger.valueOf(3), MyInteger.valueOf(2)),
                other.getOperands());

        other = (MyUnknown) MyUnknown.create(List.of(
                        new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3)),
                        new Pair<>(MyInteger.valueOf(5), MyInteger.valueOf(3)),
                        new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(0)),
                        new Pair<>(MyInteger.valueOf(5), MyInteger.valueOf(20))
                ),
                MyInteger.valueOf(8));

        assertEquals(MyInteger.valueOf(10), other.getRest());

        assertEquals(Map.of(MyInteger.valueOf(3), MyInteger.valueOf(7),
                        MyInteger.valueOf(20), MyInteger.valueOf(5)),
                other.getOperands());
    }

    @Test
    void testCreate1() {
        MyUnknown other = (MyUnknown) MyUnknown.create(
                Map.of(MyInteger.valueOf(3), MyInteger.valueOf(2)),
                MyInteger.valueOf(8));
        assertEquals(MyInteger.valueOf(8), other.getRest());

        assertEquals(Map.of(MyInteger.valueOf(3), MyInteger.valueOf(2)),
                other.getOperands());

        // _____________

        other = (MyUnknown) MyUnknown.create(
                Map.of(MyInteger.valueOf(3), MyInteger.valueOf(2), MyInteger.valueOf(0), MyInteger.valueOf(2)),
                MyInteger.valueOf(8));
        assertEquals(MyInteger.valueOf(10), other.getRest());

        assertEquals(Map.of(MyInteger.valueOf(3), MyInteger.valueOf(2)),
                other.getOperands());

        // _______________

        MyNumber val = MyUnknown.create(
                Map.of(MyInteger.valueOf(3), MyInteger.valueOf(2), new MyErrorNumber(null, "test"), MyInteger.valueOf(10)),
                MyInteger.valueOf(8));

        assertEquals(MyErrorNumber.class, val.getClass());
    }

    @Test
    void testCreate2() {
        // Test : create(MyNumber a, MyNumber b)
        MyUnknown val = (MyUnknown) MyUnknown.create(MyInteger.valueOf(3), MyInteger.valueOf(2));
        assertEquals(Map.of(MyInteger.valueOf(1), MyInteger.valueOf(3)),
                val.getOperands());
        assertEquals(MyInteger.valueOf(2), val.getRest());

        MyNumber v = MyUnknown.create(MyInteger.valueOf(3), null);
        assertEquals(MyErrorNumber.class, v.getClass());

        MyNumber vv =  MyUnknown.create(MyInteger.valueOf(0), MyInteger.valueOf(2));
        assertEquals(MyInteger.valueOf(2), vv);

        vv =  MyUnknown.create(MyInteger.valueOf(5), MyInteger.valueOf(0), MyInteger.valueOf(2));
        assertEquals(MyInteger.valueOf(7), vv);
    }

    @Test
    void testCreate3() {
        // create(MyNumber a, MyNumber n, MyNumber b)
        MyUnknown val = (MyUnknown) MyUnknown.create(MyInteger.valueOf(5), MyInteger.valueOf(6), MyInteger.valueOf(7));

        assertEquals(Map.of(MyInteger.valueOf(6), MyInteger.valueOf(5)),
                val.getOperands());
        assertEquals(MyInteger.valueOf(7), val.getRest());
    }

    @Test
    void isZero() {
        MyUnknown val = (MyUnknown) MyUnknown.create(MyInteger.valueOf(5), MyInteger.valueOf(6), MyInteger.valueOf(7));
        assertFalse(val.isZero());
    }

    @Test
    void getSign() {
        MyUnknown val = (MyUnknown) MyUnknown.create(MyInteger.valueOf(5), MyInteger.valueOf(6), MyInteger.valueOf(7));
        assertTrue(val.getSign() > 0);
    }

    @Test
    void getOperands() {
        MyUnknown other = (MyUnknown) MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3))),
                MyInteger.valueOf(8));

        assertEquals(Map.of(MyInteger.valueOf(3), MyInteger.valueOf(2)),
                other.getOperands());
    }

    @Test
    void getRest() {
        MyUnknown other = (MyUnknown) MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3))),
                MyInteger.valueOf(8));
        assertEquals(MyInteger.valueOf(8), other.getRest());

        assertEquals(Map.of(MyInteger.valueOf(3), MyInteger.valueOf(2)),
                other.getOperands());
    }

    @Test
    void applyToAllOperators() {
        MyUnknown other = (MyUnknown) MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3))),
                MyInteger.valueOf(8));

        MyUnknown res = (MyUnknown) MyUnknown.applyToAllOperators(other, MyInteger.valueOf(2), Plus::new);
        assertEquals(MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(4), MyInteger.valueOf(3))), MyInteger.valueOf(10)),
                res);

    }

    @Test
    void testApplyToAllOperators() {
        MyUnknown other = (MyUnknown) MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3))),
                MyInteger.valueOf(8));

        MyUnknown res = (MyUnknown) MyUnknown.applyToAllOperators(other, Negation::new);
        assertEquals(MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(-2), MyInteger.valueOf(3))), MyInteger.valueOf(-8)),
                res);
    }

    @Test
    void testEquals() {
        MyUnknown val = (MyUnknown) MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3))),
                MyInteger.valueOf(8));
        MyUnknown other = (MyUnknown) MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3))),
                MyInteger.valueOf(8));

        assertEquals(val, other);
        other = (MyUnknown) MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(3))),
                MyInteger.valueOf(-8));
        assertNotEquals(val, other);

        other = (MyUnknown) MyUnknown.create(List.of(new Pair<>(MyInteger.valueOf(-2), MyInteger.valueOf(3))),
                MyInteger.valueOf(8));
        assertNotEquals(val, other);
    }
}