package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick;
    private Boolean isOperationPlus, isOperationMinus, isOperationMultiply, isOperationDivide;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);


    }


    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_0:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("0");
                }
                else textView.append("0");
                break;
            case R.id.btn_1:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("1");
                }
                else textView.append("1");
                break;
            case R.id.btn_2:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("2");
                }
                else textView.append("2");
                break;
            case R.id.btn_3:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("3");
                }
                else textView.append("3");
                break;
            case R.id.btn_4:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("4");
                }
                else textView.append("4");
                break;
            case R.id.btn_5:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("5");
                }
                else textView.append("5");
                break;
            case R.id.btn_6:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("6");
                }
                else textView.append("6");
                break;
            case R.id.btn_7:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("7");
                }
                else textView.append("7");
                break;
            case R.id.btn_8:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("8");
                }
                else textView.append("8");
                break;
            case R.id.btn_9:
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("9");
                }
                else textView.append("9");
                break;
            case R.id.clear:
                textView.setText("0");
                first = 0;
                second = 0;
        }
        isOperationClick = false;
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                isOperationPlus = true;
                break;
            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                isOperationMinus = true;
                break;
            case R.id.btn_multiplication:
                first = Integer.valueOf(textView.getText().toString());
                isOperationMultiply = true;
                break;
            case R.id.btn_division:
                first = Integer.valueOf(textView.getText().toString());
                isOperationDivide = true;
                break;

            case R.id.equal:
                second = Integer.valueOf(textView.getText().toString());
                if (isOperationPlus){
                    Integer result = first + second;
                    textView.setText(result.toString());
                    isOperationPlus = false;
                    break;

                }
                if (isOperationMinus){
                    Integer result = first - second;
                    textView.setText(result.toString());
                    isOperationMinus = false;
                    break;

                }
                if (isOperationMultiply){
                    Integer result = first * second;
                    textView.setText(result.toString());
                    isOperationMultiply = false;
                    break;

                }
                if (isOperationDivide){
                    Integer result = first / second;
                    textView.setText(result.toString());
                    isOperationDivide = false;
                    break;

                }


        }
        isOperationClick = true;
    }
}