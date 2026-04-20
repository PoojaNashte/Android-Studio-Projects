package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText display;
    double num1, num2;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
    }

    public void onClick(View v) {

        Button b = (Button) v;
        String value = b.getText().toString();

        if (value.equals("C")) {
            display.setText("");
        }

        else if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
            num1 = Double.parseDouble(display.getText().toString());
            operator = value;
            display.setText("");
        }

        else if (value.equals("=")) {
            num2 = Double.parseDouble(display.getText().toString());
            double result = 0;

            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            display.setText(String.valueOf(result));
        }

        else {
            display.append(value);
        }
    }
}