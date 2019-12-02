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
}
