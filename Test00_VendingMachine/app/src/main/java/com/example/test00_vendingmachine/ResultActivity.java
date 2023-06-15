package com.example.test00_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.Serializable;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //getIntent().getIntExtra("money",-1) + "원" ;
        TextView change = findViewById(R.id.change);
        change.setText(getIntent().getIntExtra("money",-1) + "  원 ");

    }
}