package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import visitor.Counter;

import java.util.Arrays;
import java.util.List;

class TestOperation {

	private Operation o;
	private Operation o2;
	private Counter c;

	@BeforeEach
	void setUp() throws Exception {
		c = new Counter();
		List<Expression> params1 = Arrays.asList(new MyInteger(3), new MyInteger(4), new MyInteger(5));
		List<Expression> params2 = Arrays.asList(new MyInteger(5), new MyInteger(4));
		List<Expression> params3 = Arrays.asList(new Operation(params1, Operation.Type.PLUS), new Operation(params2, Operation.Type.MINUS), new MyInteger(7));
		o = new Operation(params3, Operation.Type.DIVIDES);
		o2 = new Operation(params3, Operation.Type.DIVIDES);
	}

	@Test
	void testEquals() {
		assertEquals(o,o2);
	}

	@Test
	void testCountDepth() {
		o.accept(c);
		assertEquals(2, c.getDepth());
	}

	@Test
	void testCountOps() {
		o.accept(c);
		assertEquals(3, c.getOps());
	}

	@Test
	void testCountNbs() {
		o.accept(c);
		assertEquals(Integer.valueOf(6), c.getNbs());
	}

}
