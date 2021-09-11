
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

  public InvestmentYieldDto(Double initialInvestment2, Integer investmentYear2, Double yearlyInput2,
      Double investmentYield2, Double finalBalance2) {
    // TODO Auto-generated constructor stub
  }
  private Integer investmentYear;
  private Double initialInvestment;
  private Double yearlyInput;
  private Double investmentYield;
  private Double finalBalance;
  /**
   int investmentYear; 
   double initialInvestment; 
   double yearlyInput; 
   double investmentYield;
   double finalBalance;
   **/
}
