package io.web;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CalculatorResponse {
    String answer;
}
