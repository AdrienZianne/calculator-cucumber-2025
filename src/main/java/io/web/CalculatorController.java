package io.web;

import io.web.dto.CalculatorDTO;
import io.web.dto.SettingDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    /// Calculator main endpoint for arithmetic and programming mode
    @PostMapping(value = "/calc", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity compute(@Validated @RequestBody CalculatorDTO request)
            throws Exception {
        String value = calculatorService.compute(request);
        return ResponseEntity.ok(CalculatorResponse.builder().answer(value).build());
    }

    /// Endpoint to modify global settings
    @PostMapping(value = "/settings", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Object> settings(@Validated @RequestBody SettingDTO request)
            throws Exception {
        calculatorService.setSettings(request);
        return ResponseEntity.ok().build();
    }

    /// Endpoint to fetch the global settings
    @GetMapping(value = "/settings")
    @ResponseBody
    public ResponseEntity<Object> settings() {
        return ResponseEntity.ok(calculatorService.getSettings());
    }


    /// Handle any exception
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception exception) {
        return new ResponseEntity<>(
                ErrorResponse.builder()
                        .status(HttpStatus.BAD_REQUEST.value())
                        .message("An unexpected error has occurred.\n" +
                                "Please contact the maintainers of this application with the step to get this error." + exception.getMessage())
                        .build(),
                HttpStatus.BAD_REQUEST);
    }
}
