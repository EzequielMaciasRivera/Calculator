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

import lombok.Getter;
import lombok.Setter;

/**
 * The Class InitialInvestmentDto.
 */
@Getter
@Setter
public class InitialInvestmentDto {
  double initialInvestment;
  double yearlyInput;
  int yearlyInpuntIncrement;
  float investmentYield;
  int investmentYears;
  
  @Override
  public String toString() {
    return "InitialInvestmentDto [initialInvestment=" + initialInvestment + ", yearlyInput="
        + yearlyInput + ", yearlyInpuntIncrement=" + yearlyInpuntIncrement + ", investmentYield="
        + investmentYield + ", investmentYears=" + investmentYears + "]";
  }

  
 
  
}
