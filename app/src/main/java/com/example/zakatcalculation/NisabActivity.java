package com.example.zakatcalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class NisabActivity extends AppCompatActivity {

    TextView nisab,nisabAmount;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nisab);

        nisab = findViewById(R.id.nisab);
        nisabAmount = findViewById(R.id.nisabAmount);

        Bundle bundle = getIntent().getExtras();
        String value1 = bundle.getString("tag1");
        String value2 = bundle.getString("tag2");
        nisab.setText(value1);
        nisabAmount.setText(value2);
    }
}