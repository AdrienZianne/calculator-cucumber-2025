package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

class TestEvaluator {

    private Calculator calc;
    private int value1, value2;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        value1 = 8;
        value2 = 6;
    }

    @Test
    void testEvaluatorMyInteger() {
        assertEquals( value1, calc.eval(new MyInteger(value1)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"*", "+", "/", "-"})
    void testEvaluateOperations(String symbol) {
        List<Expression> params = Arrays.asList(new MyInteger(value1),new MyInteger(value2));
        try {
            //construct another type of operation depending on the input value
            //of the parameterised test
            switch (symbol) {
                case "+"	->	assertEquals( value1 + value2, calc.eval(new Operation(params, Operation.Type.PLUS)));
                case "-"	->	assertEquals( value1 - value2, calc.eval(new Operation(params, Operation.Type.MINUS)));
                case "*"	->	assertEquals( value1 * value2, calc.eval(new Operation(params, Operation.Type.TIMES)));
                case "/"	->	assertEquals( value1 / value2, calc.eval(new Operation(params, Operation.Type.DIVIDES)));
                default		->	fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        }
    }

}
