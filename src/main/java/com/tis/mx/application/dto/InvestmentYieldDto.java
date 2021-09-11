
package com.tis.mx.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Getter;
/**
 * The Class InvestmentYieldDto.
 */
@Getter
@Setter
@AllArgsConstructor
public class InvestmentYieldDto {

  private Integer investmentYear;
  private Double initialInvestment;
  private Double yearlyInput;
  private Double investmentYield;
  private Double finalBalance;
  /**
   * int investmentYear; double initialInvestment; double yearlyInput; double investmentYield;
   * double finalBalance;
   **/
}
