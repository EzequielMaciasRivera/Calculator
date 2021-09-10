package com.tis.mx.application.service.impl;


import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.dto.InvestmentYieldDto;
import com.tis.mx.application.service.CompoundInterestCalculator;
import java.util.List;

public class CompoundInterestCalculatorImpl implements CompoundInterestCalculator {

  @Override
  public List<InvestmentYieldDto> createRevenueGrid(InitialInvestmentDto initialInvestmentDto) {
    Integer investmentYear = 0;
    Double initialInvestment = 0.00;
    Double yearlyInput = 0.00;
    Double investmentYield = 0.00;
    Double finalBalance = 0.00;  
    
    
    investmentYear ++;
    if(investmentYear == 0) {
      
    }
    investmentYield = ()*(/100)
    
    finalBalance = initialInvestment + yearlyInput + investmentYield;//
    
    return null;
  }

  @Override
  public boolean validateInput(InitialInvestmentDto initialInvestment) {
   
    this.setDefaults(initialInvestment);
    boolean cumple = true;
    
    cumple = cumple && (initialInvestment.getInitialInvestment()>=1000);
    cumple = cumple && (initialInvestment.getYearlyInput() >= 0.0);
    cumple = cumple && (initialInvestment.getYearlyInpuntIncrement() >= 0);
    cumple = cumple && (initialInvestment.getInvestmentYears() > 0.0);
    cumple = cumple && (initialInvestment.getInvestmentYield() > 0.0);
    return cumple;    
    
  }
  
  private void setDefaults(InitialInvestmentDto initialInvestment) {
    Double yearlyInput = initialInvestment.getYearlyInput();
    yearlyInput = yearlyInput == null ? 0.0: yearlyInput;
    initialInvestment.setYearlyInput(yearlyInput);
    
    Integer yearlyInputIncrement = initialInvestment.getYearlyInpuntIncrement();
    yearlyInputIncrement = yearlyInputIncrement == null ? 0: yearlyInputIncrement;
    initialInvestment.setYearlyInpuntIncrement(yearlyInputIncrement);
  }
}
