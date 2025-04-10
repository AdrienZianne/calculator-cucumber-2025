package io;

import calculator.Expression;
import calculator.IllegalConstruction;
import calculator.parser.CalculatorParser;
import jdk.jshell.spi.ExecutionControl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import visitor.Evaluator;

@Service
@NoArgsConstructor
public class CalculatorService {

    public String compute(String request) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        Expression expression = CalculatorParser.parseString(request);
        Evaluator evaluator = new Evaluator();
        expression.accept(evaluator);
        return evaluator.getResult().toString();
    }
}
