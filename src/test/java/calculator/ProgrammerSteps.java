package calculator;

import static org.junit.jupiter.api.Assertions.*;

import calculator.parser.CalculatorParser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * ProgrammerSteps
 * Class for testing the parser in programmer mode using cucumber.
 */
public class ProgrammerSteps {
    /**
     * Attribute that stores the result of the parsed expression.
     */
    public Programmer res;

    /**
     * Method that parses the expression and stores it in the attribute.
     * 
     * @param string the parser expression.
     */
    @When("I provide a programmer expression as a string {string}")
    public void whenIProvideAProgrammerExpression(String string) {
        res = CalculatorParser.parseProgrammer(string);
    }

    /**
     * Method that tests whether the previously calculated result is the same as the
     * expected one (passed in parameter).
     * 
     * @param val The expected value.
     */
    @Then("the result of programmer is {string}")
    public void thenTheResultProgrammer(String val) {
        Programmer.logicalSymbol = false;
        assertEquals(res.toString(), val);
    }
}
