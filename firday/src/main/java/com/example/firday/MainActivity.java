package com.example.firday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnOk;
    Button btnCanel;
    TextView tvOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOk = findViewById(R.id.btnOk);
        btnCanel = findViewById(R.id.btnCanel);
        tvOut = findViewById(R.id.tvOut);
        btnOk.setOnClickListener(onclBtnOK);
        btnCanel.setOnClickListener(onclBtnCancel);


    }
    View.OnClickListener onclBtnOK = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvOut.setText("Нажата кнопка Ок по второму методу");
        }
    };
    View.OnClickListener onclBtnCancel = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvOut.setText("Нажата кнопка Cancel по второму методу");
        }
    };
}