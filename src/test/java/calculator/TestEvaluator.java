package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import calculator.operation.binary.Divides;
import calculator.operation.binary.Minus;
import calculator.operation.binary.Plus;
import calculator.operation.binary.Times;
import jdk.jshell.spi.ExecutionControl;
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
    void testEvaluatorMyInteger() throws ExecutionControl.NotImplementedException, IllegalConstruction {
        assertEquals(MyInteger.valueOf(value1), calc.eval(new MyInteger(value1)));
    }

    @ParameterizedTest
    @ValueSource(strings = { "*", "+", "/", "-" })
    void testEvaluateOperations(String symbol) throws ExecutionControl.NotImplementedException, IllegalConstruction {
        List<Expression> params = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
        try {
            // construct another type of operation depending on the input value
            // of the parameterised test
            switch (symbol) {
                case "+" -> assertEquals(MyInteger.valueOf(value1 + value2), calc.eval(new Plus(params)));
                case "-" -> assertEquals(MyInteger.valueOf(value1 - value2), calc.eval(new Minus(params)));
                case "*" -> assertEquals(MyInteger.valueOf(value1 * value2), calc.eval(new Times(params)));
                case "/" -> assertEquals(new MyRational(value1, value2), calc.eval(new Divides(params)));
                default -> fail();
            }
        } catch (IllegalConstruction e) {
            fail();
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }
}
