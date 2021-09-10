
package com.tis.mx.application.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class InvestmentYieldDto.
 */
@Getter
@Setter
public class InvestmentYieldDto {
  private Integer investmentYear;
  private Double initialInvestment;
  private Double yearlyInput;
  private Double investmentYield;
  private Double finalBalance;
}
