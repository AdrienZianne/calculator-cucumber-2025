package calculator;

import static org.junit.jupiter.api.Assertions.*;

import calculator.parser.CalculatorParser;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class CalculatorSteps {
//	static final Logger log = getLogger(lookup().lookupClass());

	private ArrayList<Expression> params;
	private ArrayList<Operation> operations;
	private Calculator c;

	/**
	 * Creates a new integer operation.
	 * @param operator The operator of the operation.
	 * @param params The params to pass the created operation.
	 * @return An instance of the {@link Operation} class.
	 * @throws IllegalConstruction if the given operator is not valid
	 */
	private static  Operation createIntegerOperation(String operator, ArrayList<Expression> params) throws IllegalConstruction {

		Operation op = null;
		try {
            op = switch (operator) {
                case "sum", "+" -> new Plus(params);
                case "difference", "-" -> new Minus(params);
                case "product", "*" -> new Times(params);
                case "quotient", "/" -> new Divides(params);
                default -> throw new IllegalConstruction();
            };
		} catch (IllegalConstruction e) {
			throw new IllegalConstruction();
		}
		return op;
	}

	@Before
    public void resetMemoryBeforeEachScenario() {
		params = new ArrayList<>();
		operations = new ArrayList<>();
	}

	@Given("I initialise a calculator")
	public void givenIInitialiseACalculator() {
		c = new Calculator();
		operations = new ArrayList<>();
	}

	@Given("an integer operation {string}")
	public void givenAnIntegerOperation(String s) {
		// Write code here that turns the phrase above into concrete actions
		params = new ArrayList<>(); // create an empty set of parameters to be filled in
        try {
            operations = new ArrayList<>(List.of(createIntegerOperation(s, params)));	// create an empty set of operations to be filled in
        } catch (IllegalConstruction e) {
            fail();
        }
    }

	// The following example shows how to use a DataTable provided as input.
	// The example looks slightly complex, since DataTables can take as input
	//  tables in two dimensions, i.e. rows and lines. This is why the input
	//  is a list of lists.
	@Given("the following list of integer numbers")
	public void givenTheFollowingListOfNumbers(List<List<String>> numbers) {
		params = new ArrayList<>();
		// Since we only use one line of input, we use get(0) to take the first line of the list,
		// which is a list of strings, that we will manually convert to integers:
		numbers.get(0).forEach(n -> params.add(new MyInteger(Integer.parseInt(n))));
	    params.forEach(n -> System.out.println("value ="+ n));
		operations = new ArrayList<>();
	}

	// The string in the Given annotation shows how to use regular expressions...
	// In this example, the notation d+ is used to represent numbers, i.e. nonempty sequences of digits
	@Given("^the sum of two numbers (\\d+) and (\\d+)$")
	// The alternative, and in this case simpler, notation would be:
	// @Given("the sum of two numbers {int} and {int}")
	public void givenTheSum(int n1, int n2) {
		try {
			params = new ArrayList<>();
		    params.add(new MyInteger(n1));
		    params.add(new MyInteger(n2));
		    operations = new ArrayList<>( List.of(new Plus(params)));}
		catch(IllegalConstruction e) { fail(); }
	}

	@Then("^its (.*) notation is (.*)$")
	public void thenItsNotationIs(String notation, String s) {
		if (notation.equals("PREFIX")||notation.equals("POSTFIX")||notation.equals("INFIX")) {
			operations.getFirst().notation = Notation.valueOf(notation);
			assertEquals(s, operations.getFirst().toString());
		}
		else fail(notation + " is not a correct notation! ");
	}

	@When("^I provide a (.*) number (-?\\d+)$")
	public void whenIProvideANumber(String s, int val) {
		whenIProvideANumber(s, val, 0);
	}

	@And("^I provide a (.*) number (\\d+) to operator (.*)$")
	public void whenIProvideANumber(String s, int val, int opIndex) {
		try {
			Operation op = operations.get(opIndex);
			//add extra parameter to the operation
			params = new ArrayList<>();
			params.add(new MyInteger(val));
			op.addMoreParams(params);

		} catch (ArrayIndexOutOfBoundsException e) {
			fail("The given operator index is out of bounds! " + e);
		}
	}

	@When("^I provide a (.*) integer operation (\".*\")$")
	public void whenIProvideAnIntegerOperation(String s, String operator) {
		whenIProvideAnIntegerOperation(operator, 0);
	}


	@And("I provide another integer operation {string} to operator {int}")
	public void whenIProvideAnIntegerOperation(String operator, int opIndex) {
		try {
			// add an extra operation to the operation
			ArrayList<Expression> parameters = new ArrayList<>();

			Operation newOp = createIntegerOperation(operator, parameters);
			operations.add(newOp);

			operations.get(opIndex).addMoreParams(new ArrayList<>(List.of(newOp)));

		} catch (ArrayIndexOutOfBoundsException e) {
			fail("The given operator index is out of bounds! " + e);
		} catch (IllegalConstruction e) {
			fail();
		}
	}





	@Then("^the (.*) is (\\d+)$")
	public void thenTheOperationIs(String s, int val) {
		try {
			if (operations.isEmpty()) {
				operations.add(createIntegerOperation(s, params));
			}
			else
			{
				operations.set(0, createIntegerOperation(s, params));
			}
			assertEquals(val, c.eval(operations.getFirst()));
		}
		catch (IllegalConstruction e) {
			fail();
		}
	}

	@Then("the operation evaluates to {int}")
	public void thenTheOperationEvaluatesTo(int val) {
		assertEquals(val, c.eval(operations.getFirst()));
	}


	@And("^I provide the notation (.*) to operator (.*)$")
	public void whenIProvideANotation(String notation, int opIndex) {
		try {
			if (notation.equals("PREFIX")||notation.equals("POSTFIX")||notation.equals("INFIX")) {
				operations.get(opIndex).notation = Notation.valueOf(notation);
			}
			else fail(notation + " is not a correct notation! ");
		} catch (ArrayIndexOutOfBoundsException e) {
			fail("The given operator index is out of bounds! " + e);
		}

	}

	@Then("the operation is written like (.*)$")
	public void thenTheOperationWriteLike(String val) {
		assertEquals(val, operations.getFirst().toString());
	}

	@Then("the operation evaluates to {string}")
	public void thenTheOperationEvaluatesTo(String val) {
		if(val.equals("max")){
			assertEquals(Integer.MAX_VALUE, c.eval(operations.getFirst()));
		}
		else if (val.equals("min")){
			assertEquals(Integer.MIN_VALUE, c.eval(operations.getFirst()));
		}
		else {
			fail();
		}
	}


	@When("I provide an expression as a string {string}")
	public void whenIProvideAString(String string) {
		params.add(CalculatorParser.parseString(string));
	}

	@Then("the expression evaluates to {int}")
	public void thenTheExpressionEvaluatesTo(int val) {
		assertEquals(val, c.eval(params.getFirst()));
	}
}
