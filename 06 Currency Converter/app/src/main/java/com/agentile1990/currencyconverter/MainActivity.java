package com.agentile1990.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText currencyEditText;
    TextView currencyTextView;
    double exchangeRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.currencyEditText = findViewById(R.id.currencyEditText);
        this.currencyTextView = findViewById(R.id.currencyTextView);

        this.exchangeRate = 0.81;
    }

    public void convert(View view) {
        Double input = Double.parseDouble(this.currencyEditText.getText().toString());

        currencyTextView.setText(String.format("£%.2f", input * this.exchangeRate));
    }
}
