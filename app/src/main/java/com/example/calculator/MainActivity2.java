package com.example.calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {
    private MaterialButton exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String text = getIntent().getStringExtra("k1");
        exit = findViewById(R.id.result);
        ((MaterialButton) exit).setText(text);
    }

    public void onClickExit(View view) {
        finishAffinity();
//        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        intent.putExtra("EXIT", true);
//        startActivity(intent);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.d("bb", "onCreate 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("bb", "onStart 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("bb", "onResume 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("bb", "onStop 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("bb", "onPause 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("bb", "onDestroy 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("bb", "onRestart 2");
    }
}