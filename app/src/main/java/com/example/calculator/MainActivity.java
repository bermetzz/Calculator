package com.example.calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick;
    private String operationType;
    private Button visible;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        visible = findViewById(R.id.btn_invisible);


    }


    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_0:
                visible.setVisibility(View.GONE);
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("0");
                }
                else textView.append("0");
                break;
            case R.id.btn_1:
                visible.setVisibility(View.GONE);
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("1");
                }
                else textView.append("1");
                break;
            case R.id.btn_2:
                visible.setVisibility(View.GONE);
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("2");
                }
                else textView.append("2");
                break;
            case R.id.btn_3:
                visible.setVisibility(View.GONE);
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("3");
                }
                else textView.append("3");
                break;
            case R.id.btn_4:
                visible.setVisibility(View.GONE);
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("4");
                }
                else textView.append("4");
                break;
            case R.id.btn_5:
                visible.setVisibility(View.GONE);
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("5");
                }
                else textView.append("5");
                break;
            case R.id.btn_6:
                visible.setVisibility(View.GONE);
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("6");
                }
                else textView.append("6");
                break;
            case R.id.btn_7:
                visible.setVisibility(View.GONE);
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("7");
                }
                else textView.append("7");
                break;
            case R.id.btn_8:
                visible.setVisibility(View.GONE);
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("8");
                }
                else textView.append("8");
                break;
            case R.id.btn_9:
                visible.setVisibility(View.GONE);
                if (textView.getText().toString().equals("0") || isOperationClick){
                    textView.setText("9");
                }
                else textView.append("9");
                break;
            case R.id.clear:
                visible.setVisibility(View.GONE);
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
                operationType = "+";
                visible.setVisibility(View.GONE);
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_minus:
                operationType = "-";
                visible.setVisibility(View.GONE);
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_multiplication:
                operationType = "*";
                visible.setVisibility(View.GONE);
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_division:
                operationType = "/";
                visible.setVisibility(View.GONE);
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.equal:
                visible.setVisibility(View.VISIBLE);
                second = Integer.valueOf(textView.getText().toString());
                if (operationType.equals("+")){
                    Integer result = first + second;
                    textView.setText(result.toString());
                    break;
                }
                if (operationType.equals("-")){
                    Integer result = first - second;
                    textView.setText(result.toString());
                    break;

                }
                if (operationType.equals("*")){
                    Integer result = first * second;
                    textView.setText(result.toString());
                    break;

                }
                if (operationType.equals("/")){
                    Integer result = first / second;
                    textView.setText(result.toString());
                    break;

                }
        }
        isOperationClick = true;
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        String text = ((TextView) findViewById(R.id.text_view)).getText().toString();
        intent.putExtra("k1", text);
        startActivity(intent);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.d("bb", "onCreate");
//        if(getIntent().getBooleanExtra("EXIT", false)){
//            finish();
//        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("bb", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("bb", "onResume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("bb", "onStop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("bb", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("bb", "onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("bb", "onRestart");

    }
}