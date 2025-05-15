package calculator.parser;

import calculator.Calculator;
import calculator.Expression;
import calculator.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorParserTest {
    Expression exp;
    Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @Test
    void testParseStringInfix() {
        exp = CalculatorParser.parseArithmetic("1 + 2 + 5");
        assertEquals(MyInteger.valueOf(1 + 2 + 5), c.eval(exp));
        exp = CalculatorParser.parseArithmetic("5 * 9");
        assertEquals(MyInteger.valueOf(5 * 9), c.eval(exp));
        exp = CalculatorParser.parseArithmetic("28 / 2");
        assertEquals(MyInteger.valueOf(28 / 2), c.eval(exp));
        exp = CalculatorParser.parseArithmetic("5 - 2");
        assertEquals(MyInteger.valueOf(5 - 2), c.eval(exp));
        exp = CalculatorParser.parseArithmetic("(5 - 1) + 3 * 4");
        assertEquals(MyInteger.valueOf((5 - 1) + 3 * 4), c.eval(exp));
        exp = CalculatorParser.parseArithmetic("(5 + 2 * 10 - 5) / 2");
        assertEquals(MyInteger.valueOf((5 + 2 * 10 - 5) / 2), c.eval(exp));
    }

    @Test
    void testParseStringPrefix() {
        exp = CalculatorParser.parseArithmetic("+ (30 10)");
        assertEquals(MyInteger.valueOf(40), c.eval(exp));
        exp = CalculatorParser.parseArithmetic("- (30 10)");
        assertEquals(MyInteger.valueOf(20), c.eval(exp));
        exp = CalculatorParser.parseArithmetic("* (30 10)");
        assertEquals(MyInteger.valueOf(300), c.eval(exp));
        exp = CalculatorParser.parseArithmetic("/ (30 10)");
        assertEquals(MyInteger.valueOf(3), c.eval(exp));
    }

    @Test
    void testParseStringPostfix() {
        exp = CalculatorParser.parseArithmetic("(30 10) +");
        assertEquals(MyInteger.valueOf(40), c.eval(exp));
        exp = CalculatorParser.parseArithmetic("(30 10) -");
        assertEquals(MyInteger.valueOf(20), c.eval(exp));
        exp = CalculatorParser.parseArithmetic("(30 10) *");
        assertEquals(MyInteger.valueOf(300), c.eval(exp));
        exp = CalculatorParser.parseArithmetic("(30 10) /");
        assertEquals(MyInteger.valueOf(3), c.eval(exp));
    }
}
