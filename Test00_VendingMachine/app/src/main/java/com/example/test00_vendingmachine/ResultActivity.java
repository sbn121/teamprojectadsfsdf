package com.example.test00_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    EditText edt_change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        int money = intent.getIntExtra("money", 0);
        edt_change.setText("잔액 : "+money+"원");
    }
}