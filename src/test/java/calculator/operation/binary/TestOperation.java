package calculator.operation.binary;

//Import Junit5 libraries for unit testing:

import calculator.Expression;
import calculator.MyInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import visitor.Counter;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestOperation {

	private BinaryOperation o;
	private BinaryOperation o2;
	private Counter c;

	@BeforeEach
	void setUp() throws Exception {
		c = new Counter();
		List<Expression> params1 = Arrays.asList(new MyInteger(3), new MyInteger(4), new MyInteger(5));
		List<Expression> params2 = Arrays.asList(new MyInteger(5), new MyInteger(4));
		List<Expression> params3 = Arrays.asList(new Plus(params1), new Minus(params2), new MyInteger(7));
		o = new Divides(params3);
		o2 = new Divides(params3);
	}

	@Test
	void testEquals() {
		assertEquals(o,o2);
	}

	@Test
	void testCountDepth() {
		try {
			o.accept(c);
		} catch (Exception e) {
			fail();
		}
		assertEquals(2, c.getDepth());
	}

	@Test
	void testCountOps() {
		try {
			o.accept(c);
		} catch (Exception e) {
			fail();
		}
		assertEquals(3, c.getOps());
	}

	@Test
	void testCountNbs() {
		try {
			o.accept(c);
		} catch (Exception e) {
			fail();
		}
		assertEquals(Integer.valueOf(6), c.getNbs());
	}


	

}
