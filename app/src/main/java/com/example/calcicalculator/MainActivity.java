package com.example.calcicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtCalculations, txtResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCalculations = findViewById(R.id.txtCalculations);
        txtResults = findViewById(R.id.txtResults);

        findViewById(R.id.btnEqual).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn1).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn2).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn3).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn4).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn5).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn6).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn7).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn8).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn9).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn0).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnPlus).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnSubtract).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnMultiply).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnDivide).setOnClickListener(MainActivity.this);
        findViewById(R.id.btnReset).setOnClickListener(MainActivity.this);


    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){

                case R.id.btnEqual:

                    break;
                case R.id.btnMultiply:

                    break;
                case R.id.btnDivide:

                    break;
                case R.id.btnPlus:

                    break;
                case R.id.btnSubtract:

                    break;
                case R.id.btnReset:

                    break;
                case R.id.btn0:

                    break;
                case R.id.btn1:
                    break;
                case R.id.btn2:
                    break;
                case R.id.btn3:
                    break;
                case R.id.btn4:
                    break;
                case R.id.btn5:
                    break;
                case R.id.btn6:
                    break;
                case R.id.btn7:
                    break;
                case R.id.btn8:
                    break;
                case R.id.btn9:
                    break;
            
        }
    }
}