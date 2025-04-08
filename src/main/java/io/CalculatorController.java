package io;

import calculator.IllegalConstruction;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/calc")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity compute(@RequestBody CalculatorDTO request) throws IllegalConstruction, ExecutionControl.NotImplementedException {
        String value = calculatorService.compute(request.getInput());
        return ResponseEntity.ok(CalculatorResponse.builder().answer(value).build());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public ResponseEntity handleException(Exception exception) {
        return new ResponseEntity<ErrorResponse>(
                ErrorResponse.builder()
                        .status(HttpStatus.BAD_REQUEST.value())
                        .message("An unexpected error has occurred.\n" +
                                "Please contact the maintainers of this application with the step to get this error.")
                        .build(),
                HttpStatus.BAD_REQUEST
        );
    }
}
