package com.example.taxcalculator;

public class CRACustomer {
    Integer sinNumber;
    Integer age;
    String fName,lName;
    String fullName;
    String gender;
    String dateOfBirth;
    String taxFillingDate;
    double grossIncome, federalTax, provicialTax, empInsurance;
    double rrspContri, rrspCarryForward, taxableIncome, taxPaid;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public CRACustomer(Integer sinNumber, Integer age, String fName, String lName, String gender, String dateOfBirth, String taxFillingDate, double grossIncome, double rrspContri) {
        this.sinNumber = sinNumber;
        this.age = age;
        this.fName = fName;
        this.lName = lName;
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.taxFillingDate = taxFillingDate;
        this.grossIncome = grossIncome;
        this.rrspContri = rrspContri;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(double federalTax) {
        this.federalTax = federalTax;
    }

    public double getProvicialTax() {
        return provicialTax;
    }

    public void setProvicialTax(double provicialTax) {
        this.provicialTax = provicialTax;
    }

    public double getEmpInsurance() {
        return empInsurance;
    }

    public void setEmpInsurance(double empInsurance) {
        this.empInsurance = empInsurance;
    }

    public double getRrspContri() {
        return rrspContri;
    }

    public void setRrspContri(double rrspContri) {
        this.rrspContri = rrspContri;
    }

    public double getRrspCarryForward() {
        return rrspCarryForward;
    }

    public void setRrspCarryForward(double rrspCarryForward) {
        this.rrspCarryForward = rrspCarryForward;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTaxPaid() {
        return taxPaid;
    }

    public void setTaxPaid(double taxPaid) {
        this.taxPaid = taxPaid;
    }

    //    public CRACustomer(String fullName)
//    {
//       this.fullName = fullName;
//    }
}
