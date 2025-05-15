package io.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.RoundingMode;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SettingDTO {
    Integer realPrecision;
    RoundingMode roundingMode;
    Boolean useRealNotation;
    Boolean useScientificNotation;
    Integer scNotationMaxLeft;
    Integer scNotationMaxRight;
    Boolean useDegrees;
    Integer seed;
    Boolean baseNotationConvention;
    Boolean logicalSymbol;
    Boolean useComplexDomain;
}
