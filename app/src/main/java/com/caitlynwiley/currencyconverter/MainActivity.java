package com.caitlynwiley.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double dollarsToEuroRatio = .85;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText dollarField = (EditText)  findViewById(R.id.currencyField);
        String dollarText = dollarField.getText().toString();
        if (dollarText.equals("")) {
            Toast.makeText(MainActivity.this, "Enter a dollar amount to convert.", Toast.LENGTH_SHORT).show();
        } else {
            double dollars = Double.parseDouble(dollarText);
            double euros = dollars * dollarsToEuroRatio;

            Toast.makeText(MainActivity.this, String.format("\u20AC %.2f", euros), Toast.LENGTH_SHORT).show();
        }
    }
}
