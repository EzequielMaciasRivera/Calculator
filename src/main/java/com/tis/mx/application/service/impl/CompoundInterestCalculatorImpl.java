package com.tis.mx.application.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.dto.InvestmentYieldDto;
import com.tis.mx.application.service.CompoundInterestCalculator;

public class CompoundInterestCalculatorImpl implements CompoundInterestCalculator {

//  @Override
//  public List<InvestmentYieldDto> createRevenueGrid(InitialInvestmentDto initialInvestment) {
//
//    List<InvestmentYieldDto> tablaDeRendimiento = new ArrayList<>();
//
//    int ciclosDeInversion = initialInvestment.getInvestmentYears();
//
//    for (int ciclo = 0; ciclo < ciclosDeInversion; ciclo++) {
//
//      InvestmentYieldDto rendimientoAnual = null;
//
//      if (ciclo == 0) {
//        rendimientoAnual = this.calcularRendimientoAnual(initialInvestment, null);
//      } else {
//        // Sí existe calculo anterior
//
//        rendimientoAnual =
//            this.calcularRendimientoAnual(initialInvestment, tablaDeRendimiento.get(ciclo - 1));
//      }
//
//      tablaDeRendimiento.add(rendimientoAnual);
//
//    }
//
//
//    return tablaDeRendimiento;
//  }
//
//
//  private InvestmentYieldDto calcularRendimientoAnual(InitialInvestmentDto inversionInicial,
//      InvestmentYieldDto rendimientoAnterior) {
//    
//  InvestmentYieldDto rendimiento = new InvestmentYieldDto();
//
//  if(rendimientoAnterior == null)
//  {
//    /**
//     * Aquí aún no existe rendimiento anterioir
//     */
//
//    rendimiento.setInvestmentYear(1);
//    rendimiento.setInitialInvestment(inversionInicial.getInitialInvestment());
//    rendimiento.setYearlyInput(inversionInicial.getYearlyInput());
//  }else{
//  
//    /**
//     * En este punto ya existe un redimiento anterior
//     */
//    rendimiento.setInvestmentYear(rendimientoAnterior.getInvestmentYear() + 1);
//    rendimiento.setInitialInvestment(rendimientoAnterior.getFinalBalance());
//
//    double aportacion = rendimientoAnterior.getYearlyInput()
//        * (1 + (inversionInicial.getYearlyInputIncrement() / 100));
//    rendimiento.setYearlyInput(aportacion);
//  }
//
//  Float rendimientoAnual = rendimiento.getInitialInvestment() + rendimiento
//      .getYearlyInput();rendimientoAnual=rendimientoAnual*
//      (inversionInicial.getInvestmentYield()/100);
//
//  rendimiento.setInvestmentYield(rendimientoAnual);
//
//  Float saldoFinal = rendimiento.getInitialInvestment() + rendimiento.getYearlyInput()
//      + rendimiento.getInvestmentYield();
//
//  rendimiento.setFinalBalance(saldoFinal);
//
//  return rendimiento;
//  }





  // public List<InvestmentYieldDto> createRevenueGrid(InitialInvestmentDto initialInvestmentDto) {
  // Integer investmentYear = 0;
  // Double initialInvestment = 0.00;
  // Double yearlyInput = 0.00;
  // Double investmentYield = 0.00;
  // Double finalBalance = 0.00;
  // ArrayList<InvestmentYieldDto> investmentYieldList = new ArrayList<>();
  // double aux = 0.00;
  // for (int i = 0; i < initialInvestmentDto.getInvestmentYears(); i++) {
  // // investmentYear ++;
  // investmentYear = i + 1;
  // yearlyInput = initialInvestmentDto.getYearlyInput() + aux;
  // aux = yearlyInput * initialInvestmentDto.getYearlyInpuntIncrement() / 100;
  // aux = Math.ceil(aux);
  //
  // if (i == 0) {
  // initialInvestment = initialInvestmentDto.getInitialInvestment();
  // } else {
  // initialInvestment = finalBalance;
  // }
  // investmentYield =
  // (initialInvestment + yearlyInput) * initialInvestmentDto.getInvestmentYield();
  // finalBalance = initialInvestment + yearlyInput + investmentYield;
  //
  // investmentYieldList.add(new InvestmentYieldDto(investmentYear, initialInvestment, yearlyInput,
  // investmentYield, finalBalance));
  // }
  //
  // return investmentYieldList;
  // }
  @Override
public List<InvestmentYieldDto> createRevenueGrid(InitialInvestmentDto initialInvestmentDto) {
  Integer investmentYear = 0;
  Double initialInvestment = 0.00;
  Double yearlyInput = 0.00;
  Double investmentYield = 0.00;
  Double finalBalance = 0.00;

  ArrayList<InvestmentYieldDto> investmentYieldList = new ArrayList<>();
  double aux = 0.00;
  for (int i = 0; i < initialInvestmentDto.getInvestmentYears(); i++) {
    investmentYear = i + 1;
    yearlyInput = initialInvestmentDto.getYearlyInput() + aux;
    aux += yearlyInput * initialInvestmentDto.getYearlyInputIncrement() / 100;
    aux = Math.ceil(aux);

    if (i == 0) {
      initialInvestment = initialInvestmentDto.getInitialInvestment();
    } else if (i > 0) {
      initialInvestment = finalBalance;
    }

    investmentYield =
        (initialInvestment + yearlyInput) * initialInvestmentDto.getInvestmentYield();
    finalBalance = initialInvestment + yearlyInput + investmentYield;
    investmentYieldList.add(new InvestmentYieldDto(investmentYear, initialInvestment, yearlyInput,
        investmentYield, finalBalance));
  }

  return investmentYieldList;
}
  @Override
  public boolean validateInput(InitialInvestmentDto initialInvestment) {

    this.setDefaults(initialInvestment);
    boolean cumple = true;

    cumple = cumple && (initialInvestment.getInitialInvestment() >= 1000);
    cumple = cumple && (initialInvestment.getYearlyInput() >= 0.0);
    cumple = cumple && (initialInvestment.getYearlyInputIncrement() >= 0);
    cumple = cumple && (initialInvestment.getInvestmentYears() > 0.0);
    cumple = cumple && (initialInvestment.getInvestmentYield() > 0.0);

    return cumple;
  }

  private void setDefaults(InitialInvestmentDto initialInvestment) {
    Double yearlyInput = initialInvestment.getYearlyInput();
    yearlyInput = yearlyInput == null ? 0.0 : yearlyInput;
    initialInvestment.setYearlyInput(yearlyInput);

    Integer yearlyInputIncrement = initialInvestment.getYearlyInputIncrement();
    yearlyInputIncrement = yearlyInputIncrement == null ? 0 : yearlyInputIncrement;
    initialInvestment.setYearlyInputIncrement(yearlyInputIncrement);
  }

}
