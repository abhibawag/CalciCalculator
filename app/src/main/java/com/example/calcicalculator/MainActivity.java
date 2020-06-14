package com.example.calcicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private enum OPERATOR{
        PLUS, SUBTRACT, DIVIDE, MULTIPLY, EQUAL;
    }

    TextView txtCalculations, txtResults;

    //Instance Variables
    private String currentNumber;
    private String stringNumberAtLeft;
    private String stringNumberAtRight;
    private OPERATOR currentOperator;
    private int calculationsResult;
    private String calculationsString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCalculations = findViewById(R.id.txtCalculations);
        txtResults = findViewById(R.id.txtResults);
        currentNumber = "";
        calculationsResult = 0;
        calculationsString = "";

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
                    operatorIsTapped(OPERATOR.EQUAL);
                    break;
                case R.id.btnMultiply:
                    operatorIsTapped(OPERATOR.MULTIPLY);
                    break;
                case R.id.btnDivide:
                    operatorIsTapped(OPERATOR.DIVIDE);
                    break;
                case R.id.btnPlus:
                    operatorIsTapped(OPERATOR.PLUS);
                    break;
                case R.id.btnSubtract:
                    operatorIsTapped(OPERATOR.SUBTRACT);
                    break;
                case R.id.btnReset:
                    clearTapped();
                    break;
                case R.id.btn0:
                    numberIsTapped(0);
                    break;
                case R.id.btn1:
                    numberIsTapped(1);
                    break;
                case R.id.btn2:
                    numberIsTapped(2);
                    break;
                case R.id.btn3:
                    numberIsTapped(3);
                    break;
                case R.id.btn4:
                    numberIsTapped(4);
                    break;
                case R.id.btn5:
                    numberIsTapped(5);
                    break;
                case R.id.btn6:
                    numberIsTapped(6);
                    break;
                case R.id.btn7:
                    numberIsTapped(7);
                    break;
                case R.id.btn8:
                    numberIsTapped(8);
                    break;
                case R.id.btn9:
                    numberIsTapped(9);
                    break;

        }

    //    txtCalculations.setText(calculationsString);

    }

    private void numberIsTapped(int tappedNumber){
        currentNumber = currentNumber + String.valueOf(tappedNumber);
        txtResults.setText(currentNumber);

        calculationsString = currentNumber;
        txtCalculations.setText(calculationsString);
    }

    private void operatorIsTapped(OPERATOR tappedOperator){

        if(currentOperator!=null) {

            if (currentNumber != "") {

                stringNumberAtRight = currentNumber;
                currentNumber = "";

                switch (currentOperator) {

                    case PLUS:

                        calculationsResult = Integer.parseInt(stringNumberAtLeft) + Integer.parseInt(stringNumberAtRight);
                        calculationsString += " + ";

                        break;
                    case SUBTRACT:

                        calculationsResult = Integer.parseInt(stringNumberAtLeft) - Integer.parseInt(stringNumberAtRight);
                        calculationsString += " - ";

                        break;
                    case MULTIPLY:

                        calculationsResult = Integer.parseInt(stringNumberAtLeft) * Integer.parseInt(stringNumberAtRight);
                        calculationsString += " * ";

                        break;
                    case DIVIDE:

                        calculationsResult = Integer.parseInt(stringNumberAtLeft) / Integer.parseInt(stringNumberAtRight);
                        calculationsString += " / ";

                        break;
                    case EQUAL:
                        break;

                }

                stringNumberAtLeft = String.valueOf(calculationsResult);
                txtResults.setText(stringNumberAtLeft);
                calculationsString = stringNumberAtLeft;
                txtCalculations.setText(calculationsString);


            }
        }else {

            stringNumberAtLeft = currentNumber;
            currentNumber = "";

        }

        currentOperator = tappedOperator;

    }

    public void clearTapped(){

        stringNumberAtLeft = "";
        stringNumberAtRight = "";
        txtResults.setText("0");
        txtCalculations.setText("0");
        currentOperator = null;
        calculationsString = "";
        calculationsResult = 0;
        currentNumber = "";
    }
}