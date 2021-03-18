package com.example.calculator_app_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstNumber = findViewById(R.id.editTextNumber0);
        EditText secondNumber = findViewById(R.id.editTextNumber1);
        Button plusButton = findViewById(R.id.button0);

        plusButton.setOnClickListener((v) -> {
            if(!firstNumber.getText().toString().isEmpty() && !secondNumber.getText().toString().isEmpty()){
                TextView result = findViewById(R.id.textViewResult1);
                int value1 = Integer.parseInt(firstNumber.getText().toString());
                int value2 = Integer.parseInt(secondNumber.getText().toString());
                String newValue = String.valueOf(value1 + value2);

                result.setText(newValue);
            }
        });

        Button minusButton = findViewById(R.id.button1);
        minusButton.setOnClickListener((v) -> {
            if(!firstNumber.getText().toString().isEmpty() && !secondNumber.getText().toString().isEmpty()){
                TextView result = findViewById(R.id.textViewResult1);
                int value1 = Integer.parseInt(firstNumber.getText().toString());
                int value2 = Integer.parseInt(secondNumber.getText().toString());
                String newValue = String.valueOf(value1 - value2);

                result.setText(newValue);
            }
        });

        Button timesButton = findViewById(R.id.button2);
        timesButton.setOnClickListener((v) -> {
            if(!firstNumber.getText().toString().isEmpty() && !secondNumber.getText().toString().isEmpty()){
                TextView result = findViewById(R.id.textViewResult1);
                int value1 = Integer.parseInt(firstNumber.getText().toString());
                int value2 = Integer.parseInt(secondNumber.getText().toString());
                String newValue = String.valueOf(value1 * value2);

                result.setText(newValue);
            }
        });

        Button divideButton = findViewById(R.id.button3);
        divideButton.setOnClickListener((v) -> {
            if(!firstNumber.getText().toString().isEmpty() && !secondNumber.getText().toString().isEmpty()){
                TextView result = findViewById(R.id.textViewResult1);
                int value1 = Integer.parseInt(firstNumber.getText().toString());
                int value2 = Integer.parseInt(secondNumber.getText().toString());
                if(value2 == 0){
                    Toast.makeText(getBaseContext(), "Você não pode dividir um número por 0",
                            Toast.LENGTH_LONG).show();
                } else {
                    String newValue = String.valueOf(value1 / value2);

                    result.setText(newValue);
                }
            }
        });
    }
}