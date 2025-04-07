package io;

import calculator.Expression;
import calculator.parser.CalculatorParser;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import visitor.Evaluator;

@Service
@NoArgsConstructor
public class CalculatorService {

    public Integer compute(String request) {
        Expression expression = CalculatorParser.parseString(request);
        Evaluator evaluator = new Evaluator();
        expression.accept(evaluator);
        return evaluator.getResult();
    }
}
