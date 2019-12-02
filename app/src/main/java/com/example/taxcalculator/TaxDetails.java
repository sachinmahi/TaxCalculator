package com.example.taxcalculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class TaxDetails extends AppCompatActivity {

    CRACustomer calCRA;
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

    private double cpp = 0, ei = 0;  double rrsp = 0, rrspCf = 0, taxableIncome, federalTax,
            provincialTax, totalTaxPaid;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_details);

        calculatedfullName = findViewById(R.id.txtCalFullName);
        calSIN =findViewById(R.id.edCalSinNumber);
        calAge = findViewById(R.id.txtCalAge);
        calGender = findViewById(R.id.calRadioGender);
        calDOB = findViewById(R.id.txtCalDOB);
        calTaxFillingDate = findViewById(R.id.txtCalFillingDate);

        txtDgrossIncome = findViewById(R.id.txtCalGrossIncome);
        txtDfederalTax = findViewById(R.id.txtCalFederalTax);
        txtDprovincialTax = findViewById(R.id.txtCalProvincialTax);
        txtCPP = findViewById(R.id.txtCalCPP);
        txtEmpInsurance= findViewById(R.id.txtCalEI);
        txtRRSPContribution = findViewById(R.id.txtCalRRSPContributed);
        txtRRSPCarryForward = findViewById(R.id.txtCalCarryForwardRRSP);
        txtTaxableIncome = findViewById(R.id.txtCalTotalTaxableIncome);
        txtTaxPaid = findViewById(R.id.txtCalTotalTaxPaid);

        backButton();

        Intent intent = getIntent();
        calCRA = intent.getParcelableExtra("CRACustomer");


        calSIN.setText("SIN: " + calCRA.getSinNumber());
        calculatedfullName.setText("FullName: " + calCRA.getFullName());
        calAge.setText("Age: " + calCRA.getAge());
        calGender.setText("Gender: " + calCRA.getGender());
        calDOB.setText("DOB: " + calCRA.getDateOfBirth());
        calTaxFillingDate.setText("TaxFillingDate: "+ calCRA.getTaxFillingDate());

        txtDgrossIncome.setText(" GROSS INCOME: \t" + calCRA.getGrossIncome());
        txtRRSPContribution.setText("RRSP Contributed: \t" + calCRA.getRrspContri());
        performLogic();


    }
    public void backButton()
    {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    


}
