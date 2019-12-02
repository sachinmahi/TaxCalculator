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
}
