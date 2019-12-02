package com.example.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TaxDetails extends AppCompatActivity {

    private TextView calculatedfullName;
    private TextView calSIN;
    private TextView calAge;
    private TextView calGender;
    private TextView calDOB;
    private TextView calTaxFillingDate;

    private TextView  txtDgrossIncome;
    private TextView txtDfederalTax;
    private TextView txtDprovincialTax;
    private TextView txtCPP;
    private TextView txtEmpInsurance;
    private TextView txtRRSPContribution;
    private TextView txtRRSPCarryForward;
    private TextView txtTaxableIncome;
    private TextView txtTaxPaid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_details);
    }
}
