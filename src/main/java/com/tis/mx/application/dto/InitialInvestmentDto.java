/* 
* This program is free software: you can redistribute it and/or modify  
* it under the terms of the GNU General Public License as published by  
* the Free Software Foundation, version 3.
*
* This program is distributed in the hope that it will be useful, but 
* WITHOUT ANY WARRANTY; without even the implied warranty of 
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
* General Public License for more details.
*
* Nombre de archivo: InitialInvestmentDto.java
* Autor: ezmacias
* Fecha de creación: 8 sep 2021
*/
package com.tis.mx.application.dto;

/**
 * The Class InitialInvestmentDto.
 */

public class InitialInvestmentDto {
  double initialInvestment;
  double yearlyInput;
  int yearlyInpuntIncrement;
  float investmentYield;
  int investmentYears;
  public double getInitialInvestment() {
    return initialInvestment;
  }
  public void setInitialInvestment(double initialInvestment) {
    this.initialInvestment = initialInvestment;
  }
  public double getYearlyInput() {
    return yearlyInput;
  }
  public void setYearlyInput(double yearlyInput) {
    this.yearlyInput = yearlyInput;
  }
  public int getYearlyInpuntIncrement() {
    return yearlyInpuntIncrement;
  }
  public void setYearlyInpuntIncrement(int yearlyInpuntIncrement) {
    this.yearlyInpuntIncrement = yearlyInpuntIncrement;
  }
  public float getInvestmentYield() {
    return investmentYield;
  }
  public void setInvestmentYield(float investmentYield) {
    this.investmentYield = investmentYield;
  }
  public int getInvestmentYears() {
    return investmentYears;
  }
  public void setInvestmentYears(int investmentYears) {
    this.investmentYears = investmentYears;
  }
  @Override
  public String toString() {
    return "InitialInvestmentDto [initialInvestment=" + initialInvestment + ", yearlyInput="
        + yearlyInput + ", yearlyInpuntIncrement=" + yearlyInpuntIncrement + ", investmentYield="
        + investmentYield + ", investmentYears=" + investmentYears + "]";
  }

  
 
  
}
