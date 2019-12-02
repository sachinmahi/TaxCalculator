package com.example.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public class MainActivity extends AppCompatActivity {
        private Button btnCalculate;
        private EditText edSIN;
        private EditText fnm;
        private EditText lnm;
        private EditText mainAge;
        private RadioGroup rgGender;
        private RadioButton rbMale;
        private RadioButton rbFemale;
        private RadioButton rbOthers;
        String radio = "";
        private TextView txtDateOfBirth;
        DatePickerDialog datePickerDialog;
        DatePickerDialog taxDatePickerDialog;
        final Calendar calendar = Calendar.getInstance();
        final Calendar calendarTax = Calendar.getInstance();
        private TextView taxFilling;
        private TextView rrspMain;
        private  EditText grossIncome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate = findViewById(R.id.btnCalculate);
        fnm = findViewById(R.id.txtFirstName);
        edSIN = findViewById(R.id.edSinNumber);
        lnm = findViewById(R.id.txtLastName);
        mainAge = findViewById(R.id.txtAge);
        rgGender = findViewById(R.id.rgGender);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        rbOthers = findViewById(R.id.rbOthers);
        txtDateOfBirth = findViewById(R.id.txtDOB);
        taxFilling = findViewById(R.id.txtFillingDate);
        rrspMain = findViewById(R.id.txtRRSPContributed);
        grossIncome = findViewById(R.id.edGrossIncome);

        radioAction();
        calculateAll();





        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth)
            {

                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                // DatePicker.getDatePicker().setMaxDate(System.currentTimeMillis());
                // datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
                dateFormat();

              };

        txtDateOfBirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new DatePickerDialog(com.example.taxcalculator.MainActivity.this, date, calendar
                        .get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)).show();
//                datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
             };


                taxFilling.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        new DatePickerDialog(com.example.taxcalculator.MainActivity.this, date1, calendarTax
                                .get(Calendar.YEAR), calendarTax.get(Calendar.MONTH),
                                calendarTax.get(Calendar.DAY_OF_MONTH)).show();


                    }
                });

                public void radioAction()
                {
                    rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(RadioGroup group, int checkedId)
                        {

                            if(checkedId==R.id.rbMale)
                            {
                                radio = rbMale.getText().toString();
                                Toast.makeText(getApplicationContext(),"Male",Toast.LENGTH_SHORT).show();
                                rbMale.setSelected(true);
                            }
                            else if(checkedId==R.id.rbFemale)
                            {

                                radio = rbFemale.getText().toString();
                                Toast.makeText(getApplicationContext(),"Female",Toast.LENGTH_SHORT).show();
                                rbFemale.setSelected(true);
                                //rbFMale.setText("Female!");
                            }
                            else if(checkedId==R.id.rbOthers)
                            {

                                radio = rbOthers.getText().toString();
                                Toast.makeText(getApplicationContext(),"Others",Toast.LENGTH_SHORT).show();
                                rbOthers.setSelected(true);
                                // rbOthers.setText("Others!");
                            }
                        }
                    });
                }

            }
        }
}
