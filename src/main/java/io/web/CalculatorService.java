package io.web;

import calculator.*;
import calculator.parser.CalculatorParser;
import io.cli.Memory;
import io.web.dto.CalculatorDTO;
import io.web.dto.SettingDTO;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import visitor.Evaluator;

@Service
@NoArgsConstructor
public class CalculatorService {

    /// Compute the request using the appropriate mode
    public String compute(CalculatorDTO request) throws Exception {

        if (request.getIsProgra()) {
            Programmer programmer = CalculatorParser.parseProgrammer(request.getInput());
            if (programmer == null) throw new Exception("Unable to parse");
            if (programmer.toString().contains("Error")) throw new Exception(programmer.toString());
            return programmer.toString();
        } else {

            Evaluator evaluator = new Evaluator();

            if (!request.getInput().contains("=")) {
                Expression expression = CalculatorParser.parseArithmetic(request.getInput());

                if (expression != null) {
                    expression.accept(evaluator);
                }

                if (evaluator.getResult() instanceof MyErrorNumber e) {
                    throw new Exception(e.getMessage());
                }
                return evaluator.getResult().toString();
            } else {
                Equation equation =  CalculatorParser.parseArithmeticEquation(request.getInput());
                if (equation == null || equation.getErrorState() != null) {
                    throw new Exception();
                }

                return equation.prettyResult();
            }


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
        if (request.getUseComplexDomain() != null) Configuration.setUsesComplexDomainDefault(request.getUseComplexDomain());
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
                .useComplexDomain(Configuration.usesComplexDomainDefault())
                .build();
    }
}
