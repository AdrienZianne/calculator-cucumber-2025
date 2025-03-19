package calculator.parser;

import calculator.Calculator;
import calculator.Expression;
import calculator.IllegalConstruction;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorParserTest {
    Expression exp;
    Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    // TODO: Test if the exceptions are working
    @Test
    void testParseStringInfix() throws ExecutionControl.NotImplementedException, IllegalConstruction {
        exp = CalculatorParser.parseString("1 + 2 + 5");
        assertEquals(1 + 2 + 5, c.eval(exp));
        exp = CalculatorParser.parseString("5 * 9");
        assertEquals(5 * 9, c.eval(exp));
        exp = CalculatorParser.parseString("28 / 2");
        assertEquals(28 / 2, c.eval(exp));
        exp = CalculatorParser.parseString("5 - 2");
        assertEquals(5 - 2, c.eval(exp));
        exp = CalculatorParser.parseString("(5 - 1) + 3 * 4");
        assertEquals((5-1) + 3 * 4, c.eval(exp));
        exp = CalculatorParser.parseString("(5 + 2 * 10 - 5) / 2");
        assertEquals((5 + 2 * 10 - 5) / 2, c.eval(exp));
    }
    @Test
    void testParseStringPrefix() throws ExecutionControl.NotImplementedException, IllegalConstruction {
        exp = CalculatorParser.parseString("+ (30 10)");
        assertEquals(40, c.eval(exp));
        exp = CalculatorParser.parseString("- (30 10)");
        assertEquals(20, c.eval(exp));
        exp = CalculatorParser.parseString("* (30 10)");
        assertEquals(300, c.eval(exp));
        exp = CalculatorParser.parseString("/ (30 10)");
        assertEquals(3, c.eval(exp));
    }

    @Test
    void testParseStringPostfix() throws ExecutionControl.NotImplementedException, IllegalConstruction {
        exp = CalculatorParser.parseString("(30 10) +");
        assertEquals(40, c.eval(exp));
        exp = CalculatorParser.parseString("(30 10) -");
        assertEquals(20, c.eval(exp));
        exp = CalculatorParser.parseString("(30 10) *");
        assertEquals(300, c.eval(exp));
        exp = CalculatorParser.parseString("(30 10) /");
        assertEquals(3, c.eval(exp));
    }
}