package calculator;

//Import Junit5 libraries for unit testing:

import calculator.operation.binary.Divides;
import calculator.operation.binary.Minus;
import calculator.operation.binary.Plus;
import calculator.operation.binary.Times;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import visitor.Counter;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class TestCounting {

    private int value1, value2;
    private Expression expression;

    @BeforeEach
    void setUp() {
        value1 = 8;
        value2 = 6;
        expression = null;
    }

    @Test
    void testNumberCounting() {
        expression = new MyInteger(value1);
        Counter c = new Counter();
        try {
            expression.accept(c);
        } catch (Exception _) {
            fail();
        }
        //test whether a number has zero depth (i.e. no nested expressions)
        assertEquals( 0, c.getDepth());
        //test whether a number contains zero operations
        assertEquals(0, c.getOps());
        //test whether a number contains 1 number
        assertEquals(1, c.getNbs());
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testOperationCounting(String symbol) {
        List<Expression> params = Arrays.asList(new MyInteger(value1),new MyInteger(value2));
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	expression = new Plus(params);
                case "-"	->	expression = new Minus(params);
                case "*"	->	expression = new Times(params);
                case "/"	->	expression = new Divides(params);
                default		->	fail();
            }
        } catch (IllegalConstruction _) {
            fail();
        }
        Counter c = new Counter();
        try {
            expression.accept(c);
        } catch (Exception _) {
            fail();
        }
        //test whether a binary operation has depth 1
        assertEquals(1, c.getDepth(),"counting depth of an Operation");
        //test whether a binary operation contains 1 operation
        assertEquals(1, c.getOps());
        //test whether a binary operation contains 2 numbers
        assertEquals(2, c.getNbs());
    }

}
