package io;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CalculatorResponse {
    String answer;
}
