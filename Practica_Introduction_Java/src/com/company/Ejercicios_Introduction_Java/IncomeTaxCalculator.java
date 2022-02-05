package com.company;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        final double tax_rate_min20k = 0.0;
        final double tax_rate_20k = 0.1;
        final double tax_rate_40k = 0.2;
        final double tax_rate_60k = 0.3;

        int taxableIncome = 12345;
        double taxPayable;

        if (taxableIncome <= 20000) {
            taxPayable = taxableIncome * tax_rate_min20k ;
        } else if(taxableIncome <= 40000 ){
            taxPayable = taxableIncome * tax_rate_20k;
        } else if(taxableIncome <= 60000){
            taxPayable = taxableIncome * tax_rate_40k;
        } else {
            taxPayable = taxableIncome * tax_rate_60k;
        }

        System.out.printf("The income tax payable is: %.2f%n", taxPayable);


    }
}
