package com.example.taxcalculator;

import android.os.Parcel;
import android.os.Parcelable;

public class CRACustomer implements Parcelable


{
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

    public String getDateOfBirth()

    {
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

    public void setRrspCarryForward(double rrspCarryForward)
    {
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



    public static final Parcelable.Creator<CRACustomer> CREATOR = new Parcelable.Creator<CRACustomer>() {
        @Override
        public CRACustomer createFromParcel(Parcel in) {
            return new CRACustomer(in);
        }

        @Override
        public CRACustomer[] newArray(int size) {
            return new CRACustomer[size];
        }
    };

    public String getTaxFillingDate() {
        return taxFillingDate;
    }

    public void setTaxFillingDate(String taxFillingDate) {
        this.taxFillingDate = taxFillingDate;
    }

    public String getLname() {
        return lName;
    }

    public void setLname(String lname) {
        this.lName = lname;
    }

    public Integer getSinNumber() {
        return sinNumber;
    }

    public void setSinNumber(Integer sinNumber) {
        this.sinNumber = sinNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFullName()
    {

        return lName.toUpperCase() + ", " +
                fName.substring(0,1).toUpperCase() + fName.substring(1);
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fName);
        dest.writeString(lName);
        dest.writeString(fullName);
        dest.writeInt(sinNumber);
        dest.writeInt(age);
        dest.writeString(gender);
        dest.writeString(dateOfBirth);
        dest.writeString(taxFillingDate);
        dest.writeDouble(grossIncome);
        dest.writeDouble(rrspContri);

    }
    public CRACustomer(Parcel parcel)
    {
        fName = parcel.readString();
        lName = parcel.readString();
        fullName =parcel.readString();
        sinNumber = parcel.readInt();
        age = parcel.readInt();
        gender = parcel.readString();
        dateOfBirth = parcel.readString();
        taxFillingDate = parcel.readString();
        grossIncome = parcel.readDouble();
        rrspContri = parcel.readDouble();
    }

}
