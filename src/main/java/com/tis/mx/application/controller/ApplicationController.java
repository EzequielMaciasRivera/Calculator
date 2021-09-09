package com.tis.mx.application.controller;

import java.util.function.Supplier;
import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.service.impl.CompoundInterestCalculatorImpl;

public class ApplicationController {

  public static void main(String[] args) {
   // Supplier<InitialInvestmentDto> supplierUser = () -> {
     
      InitialInvestmentDto user = new InitialInvestmentDto();
      user.setInitialInvestment(1100);
      user.setYearlyInput(2.5);
      user.setYearlyInpuntIncrement(3);
      user.setInvestmentYield(3);
      user.setInvestmentYears(2);
     
    
    //InitialInvestmentDto user = new InitialInvestmentDto();
    CompoundInterestCalculatorImpl validate = new CompoundInterestCalculatorImpl();
    System.out.println(user.toString());
    System.out.println(validate.validateInput(user));
  }


}
