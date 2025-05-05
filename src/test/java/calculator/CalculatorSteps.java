package calculator;

import static org.junit.jupiter.api.Assertions.*;

import calculator.operation.binary.*;
import calculator.parser.CalculatorParser;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class CalculatorSteps {

	private ArrayList<Expression> params;
	private ArrayList<BinaryOperation> binaryOperations;
	private Calculator c;

	/**
	 * Creates a new integer operation.
	 * 
	 * @param operator The operator of the operation.
	 * @param params   The params to pass the created operation.
	 * @return An instance of the {@link BinaryOperation} class.
	 * @throws IllegalConstruction if the given operator is not valid
	 */
	private static BinaryOperation createIntegerOperation(String operator, ArrayList<Expression> params)
			throws IllegalConstruction {

		BinaryOperation op = null;
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
		binaryOperations = new ArrayList<>();
	}

	@Given("I initialise a calculator")
	public void givenIInitialiseACalculator() {
		c = new Calculator();
		binaryOperations = new ArrayList<>();
		params = new ArrayList<>();
	}

	@Given("I initialise a seed")
	public void givenIInitialiseASeed() {
		RandomGenerator.setSeed(1);
	}

	@Given("an operation {string}")
	public void givenAnIntegerOperation(String s) {
		// Write code here that turns the phrase above into concrete actions
		params = new ArrayList<>(); // create an empty set of parameters to be filled in
		try {
			binaryOperations = new ArrayList<>(List.of(createIntegerOperation(s, params))); // create an empty set of
			// operations to be filled in
		} catch (IllegalConstruction e) {
			fail();
		}
	}

	// The following example shows how to use a DataTable provided as input.
	// The example looks slightly complex, since DataTables can take as input
	// tables in two dimensions, i.e. rows and lines. This is why the input
	// is a list of lists.
	@Given("the following list of integer numbers")
	public void givenTheFollowingListOfNumbers(List<List<String>> numbers) {
		params = new ArrayList<>();
		// Since we only use one line of input, we use get(0) to take the first line of
		// the list,
		// which is a list of strings, that we will manually convert to integers:
		numbers.get(0).forEach(n -> params.add(new MyInteger(Integer.parseInt(n))));
		params.forEach(n -> System.out.println("value =" + n));

		binaryOperations = new ArrayList<>();
	}

	// The string in the Given annotation shows how to use regular expressions...
	// In this example, the notation d+ is used to represent numbers, i.e. nonempty
	// sequences of digits
	@Given("^the sum of two numbers (\\d+) and (\\d+)$")
	// The alternative, and in this case simpler, notation would be:
	// @Given("the sum of two numbers {int} and {int}")
	public void givenTheSum(int n1, int n2) {
		try {
			params = new ArrayList<>();
			params.add(new MyInteger(n1));
			params.add(new MyInteger(n2));
			binaryOperations = new ArrayList<>(List.of(new Plus(params)));
		} catch (IllegalConstruction e) {
			fail();
		}
	}

	@Then("^its (.*) notation is (.*)$")
	public void thenItsNotationIs(String notation, String s) {
		if (notation.equals("PREFIX") || notation.equals("POSTFIX") || notation.equals("INFIX")) {
			binaryOperations.getFirst().notation = Notation.valueOf(notation);
			assertEquals(s, binaryOperations.getFirst().toString());
		} else
			fail(notation + " is not a correct notation! ");
	}

	@When("^I provide a (.*) number (-?\\d+)$")
	public void whenIProvideAInteger(String s, int val) {
		addParams(s, new MyInteger(val), 0);
	}

	@And("^I provide a (.*) number (-?\\d+) to operator (.*)$")
	public void whenIProvideAInteger(String s, int val, int opIndex) {
		addParams(s, new MyInteger(val), opIndex);
	}

	@When("^I provide a (.*) number (-?\\d+\\.\\d+)$")
	public void whenIProvideAReal(String s, double val) {
		addParams(s, new MyReal(val), 0);
	}

	@And("^I provide a (.*) number (-?\\d+\\.\\d+) to operator (.*)$")
	public void whenIProvideAReal(String s, double val, int opIndex) {
		addParams(s, new MyReal(val), opIndex);
	}

	@When("^I provide a (.*) number (-?\\d+)/(\\d+)$")
	public void whenIProvideARational(String s, int num, int den) {
		addParams(s, MyRational.create(num, den), 0);
	}

	@And("^I provide a (.*) number (-?\\d+)/(\\d+) to operator (.*)$")
	public void whenIProvideARational(String s, int num, int den, int opIndex) {
		addParams(s, MyRational.create(num, den), opIndex);
	}

	@When("^I provide a (.*) number (-?\\d+\\.\\d+)\\s*\\+\\s*(-?\\d+\\.\\d+)\\s*i$")
	public void whenIProvideAComplex(String s, double real, double imaginary) {
		addParams(s, MyComplex.create(new MyReal(real), new MyReal(imaginary)), 0);
	}

	@And("^I provide a (.*) number (-?\\d+\\.\\d+)\\s*\\+\\s*(-?\\d+\\.\\d+)\\s*i to operator (.*)$")
	public void whenIProvideAComplex(String s, double real, double imaginary, int opIndex) {
		addParams(s, MyComplex.create(new MyReal(real), new MyReal(imaginary)), opIndex);
	}

	public void addParams(String s, MyNumber number, int opIndex) {
		try {
			BinaryOperation op = binaryOperations.get(opIndex);
			// add extra parameter to the operation
			params = new ArrayList<>();
			params.add(number);
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

			BinaryOperation newOp = createIntegerOperation(operator, parameters);
			binaryOperations.add(newOp);
			binaryOperations.get(opIndex).addMoreParams(new ArrayList<>(List.of(newOp)));
		} catch (ArrayIndexOutOfBoundsException e) {
			fail("The given operator index is out of bounds! " + e);
		} catch (IllegalConstruction e) {
			fail();
		}
	}

	@Then("^the (.*) is (\\d+)$")
	public void thenTheOperationIs(String s, int val)
			throws ExecutionControl.NotImplementedException, IllegalConstruction {
		try {
			if (binaryOperations.isEmpty()) {
				binaryOperations.add(createIntegerOperation(s, params));
			} else {
				binaryOperations.set(0, createIntegerOperation(s, params));
			}
			assert (c.eval(binaryOperations.getFirst()).equals(new MyInteger(val)));
		} catch (IllegalConstruction e) {
			fail();
		}
	}

	@Then("the operation evaluates to (-?\\d+)$")
	public void thenTheOperationEvaluatesToInteger(int val)
			throws ExecutionControl.NotImplementedException, IllegalConstruction {
		assert (c.eval(binaryOperations.getFirst()).equals(new MyInteger(val)));
	}

	@Then("the operation evaluates to (-?\\d+\\.\\d+)$")
	public void thenTheOperationEvaluatesToReal(double val)
			throws ExecutionControl.NotImplementedException, IllegalConstruction {
		assert (c.eval(binaryOperations.getFirst()).equals(new MyReal(val)));
	}

	@Then("the operation evaluates to (-?\\d+)/(\\d+)$")
	public void thenTheOperationEvaluatesToRational(int num, int den)
			throws ExecutionControl.NotImplementedException, IllegalConstruction {
		assert (c.eval(binaryOperations.getFirst()).equals(MyRational.create(num, den)));
	}

	@Then("the operation evaluates to (-?\\d+\\.\\d+)\\s*\\+\\s*(-?\\d+\\.\\d+)\\s*i$")
	public void thenTheOperationEvaluatesToComplex(double real, double imaginary)
			throws ExecutionControl.NotImplementedException, IllegalConstruction {
		assert (c.eval(binaryOperations.getFirst()).equals(MyComplex.create(new MyReal(real), new MyReal(imaginary))));
	}

	@Then("the operation evaluates to (-?\\d+)/(\\d+)\\s*\\+\\s*(-?\\d+\\.\\d+)\\s*i$")
	public void thenTheOperationEvaluatesToComplex(int realNum, int realDen, double imaginary)
			throws ExecutionControl.NotImplementedException, IllegalConstruction {
		assert (c.eval(binaryOperations.getFirst())
				.equals(MyComplex.create(MyRational.create(realNum, realDen), new MyReal(imaginary))));
	}

	@Then("the operation evaluates to (-?\\d+\\.\\d+)\\s*\\+\\s*(-?\\d+)/(\\d+)\\s*i$")
	public void thenTheOperationEvaluatesToComplex(double real, int imagNum, int imagDen)
			throws ExecutionControl.NotImplementedException, IllegalConstruction {
		assert (c.eval(binaryOperations.getFirst())
				.equals(MyComplex.create(new MyReal(real), MyRational.create(imagNum, imagDen))));
	}

	@Then("the operation evaluates to (-?\\d+)/(\\d+)\\s*\\+\\s*(-?\\d+)/(\\d+)\\s*i$")
	public void thenTheOperationEvaluatesToComplex(int realNum, int realDen, int imagNum, int imagDen)
			throws ExecutionControl.NotImplementedException, IllegalConstruction {
		assert (c.eval(binaryOperations.getFirst())
				.equals(MyComplex.create(MyRational.create(realNum, realDen), MyRational.create(imagNum, imagDen))));
	}

	@And("^I provide the notation (.*) to operator (.*)$")
	public void whenIProvideANotation(String notation, int opIndex) {
		try {
			if (notation.equals("PREFIX") || notation.equals("POSTFIX") || notation.equals("INFIX")) {
				binaryOperations.get(opIndex).notation = Notation.valueOf(notation);
			} else
				fail(notation + " is not a correct notation! ");
		} catch (ArrayIndexOutOfBoundsException e) {
			fail("The given operator index is out of bounds! " + e);
		}

	}

	@Then("the operation is written like (.*)$")
	public void thenTheOperationWriteLike(String val) {
		assertEquals(val, binaryOperations.getFirst().toString());
	}

	@When("I provide an expression as a string {string}")
	public void whenIProvideAString(String string)
			throws IllegalConstruction, ExecutionControl.NotImplementedException {
		params.add(CalculatorParser.parseString(string));

		binaryOperations = new ArrayList<>(List.of(new Plus(params)));
	}
}
