package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;


class TestNotation {

	private Operation o;

    /* This is an auxilary method to avoid code duplication.
     */
	void testNotation(String s,Operation o,Notation n) {
		assertEquals(s, o.toString(n));
		o.notation = n;
		assertEquals(s, o.toString());
	}

	void testNotation(String s,Operation o) {
		assertEquals(s, o.toString());
	}

	/* This is an auxilary method to avoid code duplication.
     */
	void testNotations(String symbol,int value1,int value2,Operation op) {
		//prefix notation:
		testNotation(symbol +" (" + value1 + ", " + value2 + ")", op, Notation.PREFIX);
		//infix notation:
		testNotation("( " + value1 + " " + symbol + " " + value2 + " )", op, Notation.INFIX);
		//postfix notation:
		testNotation("(" + value1 + ", " + value2 + ") " + symbol, op, Notation.POSTFIX);
	}

	@ParameterizedTest
	@ValueSource(strings = {"*", "+", "/", "-"})
	void testOutput(String symbol) {
		int value1 = 8;
		int value2 = 6;
		Operation op = null;
		List<Expression> params = Arrays.asList(new MyNumber(value1),new MyNumber(value2));
		try {
			//construct another type of operation depending on the input value
			//of the parameterised test
			switch (symbol) {
				case "+"	->	op = new Plus(params);
				case "-"	->	op = new Minus(params);
				case "*"	->	op = new Times(params);
				case "/"	->	op = new Divides(params);
				default		->	fail();
			}
		} catch (IllegalConstruction e) {
			fail();
		}
		testNotations(symbol, value1, value2, op);
	}

	@BeforeEach
	void setUp() throws Exception {
		List<Expression> params1 = Arrays.asList(new MyNumber(3), new MyNumber(4), new MyNumber(5));
		List<Expression> params2 = Arrays.asList(new MyNumber(5), new MyNumber(4));
		List<Expression> params3 = Arrays.asList(new Plus(params1, Notation.INFIX), new Minus(params2, Notation.PREFIX), new MyNumber(7));
		o = new Divides(params3, Notation.POSTFIX);
	}

	@Test
	void testBaseConsistency() {
		testNotation("((3, 4, 5) +, (5, 4) -, 7) /", o);
	}

	@Test
	void testPostfixConsistency() {
		testNotation("((3, 4, 5) +, (5, 4) -, 7) /", o, Notation.POSTFIX);
	}

	@Test
	void testInfixConsistency() {
		testNotation("( ( 3 + 4 + 5 ) / ( 5 - 4 ) / 7 )", o, Notation.INFIX);
	}

	@Test
	void testPrefixConsistency() {
		testNotation("/ (+ (3, 4, 5), - (5, 4), 7)", o, Notation.PREFIX);
	}
}
