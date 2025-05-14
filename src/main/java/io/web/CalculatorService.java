package io.web;

import calculator.Configuration;
import calculator.Expression;
import calculator.Programmer;
import calculator.parser.CalculatorParser;
import io.web.dto.CalculatorDTO;
import io.web.dto.SettingDTO;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import visitor.Evaluator;

@Service
@NoArgsConstructor
public class CalculatorService {

    /// Compute the request using the appropriate mode
    public String compute(CalculatorDTO request) throws Exception {

        System.out.println(request.getIsProgra());
        if (request.getIsProgra()) {
            Programmer programmer = CalculatorParser.parseProgrammer(request.getInput());
            if (programmer == null) throw new Exception("Unable to parse");
            return programmer.toString();
        } else {
            Expression expression = CalculatorParser.parseArithmetic(request.getInput());
            Evaluator evaluator = new Evaluator();
            if (expression != null) {
                expression.accept(evaluator);
            }
            return evaluator.getResult().toString();
        }
    }

    /// Update the global settings of the application
    public void setSettings(SettingDTO request) {
        if (request.getRoundingMode() != null) Configuration.setRealRoundingMode(request.getRoundingMode());
        if (request.getRealPrecision() != null) Configuration.setRealPrecision(request.getRealPrecision());
        if (request.getUseRealNotation() != null) Configuration.setUseRealNotation(request.getUseRealNotation());
        if (request.getUseScientificNotation() != null) Configuration.setUseScientificNotation(request.getUseScientificNotation());
        if (request.getScNotationMaxLeft() != null) Configuration.setScNotationMaxLeft(request.getScNotationMaxLeft());
        if (request.getScNotationMaxRight() != null) Configuration.setScNotationMaxRight(request.getScNotationMaxRight());
        if (request.getUseDegrees() != null) Configuration.setUseDegrees(request.getUseDegrees());
        if (request.getSeed() != null) Configuration.setSeed(request.getSeed());
        if (request.getBaseNotationConvention() != null) Configuration.setBaseNotationConvention(request.getBaseNotationConvention());
        if (request.getLogicalSymbol() != null) Configuration.setLogicalSymbol(request.getLogicalSymbol());
    }

    /// Fetch the current global settings
    public SettingDTO getSettings() {
        return SettingDTO.builder()
                .roundingMode(Configuration.getRealRoundingMode())
                .realPrecision(Configuration.getRealPrecision())
                .logicalSymbol(Configuration.getLogicalSymbol())
                .baseNotationConvention(Configuration.getBaseNotationConvention())
                .scNotationMaxRight(Configuration.getScNotationMaxRight())
                .seed(Configuration.getSeed())
                .scNotationMaxLeft(Configuration.getScNotationMaxLeft())
                .useRealNotation(Configuration.isUsingRealNotation())
                .useDegrees(Configuration.isUsingDegrees())
                .useScientificNotation(Configuration.usesScientificNotation())
                .build();
    }
}
