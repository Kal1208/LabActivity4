package com.example.labexercise4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Addition(View view) {
        EditText et1 =(EditText)findViewById(R.id.Num1);
        EditText et2 =(EditText)findViewById(R.id.Num2);
        EditText et3 =(EditText)findViewById(R.id.Result);
        int Num1 = Integer.parseInt(et1.getText().toString());
        int Num2 = Integer.parseInt(et2.getText().toString());
        int Sum = (Num1+Num2);
        et3.setText("The Sum is " + Sum);
    }

    public void Subtraction(View view) {
        EditText et1 =(EditText)findViewById(R.id.Num1);
        EditText et2 =(EditText)findViewById(R.id.Num2);
        EditText et3 =(EditText)findViewById(R.id.Result);
        int Num1 = Integer.parseInt(et1.getText().toString());
        int Num2 = Integer.parseInt(et2.getText().toString());
        int Difference = (Num1-Num2);
        et3.setText("The Difference is " + Difference);
    }

    public void Multiplication(View view) {
        EditText et1 =(EditText)findViewById(R.id.Num1);
        EditText et2 =(EditText)findViewById(R.id.Num2);
        EditText et3 =(EditText)findViewById(R.id.Result);
        int Num1 = Integer.parseInt(et1.getText().toString());
        int Num2 = Integer.parseInt(et2.getText().toString());
        int Product = (Num1*Num2);
        et3.setText("The Product is " + Product);
    }

    public void Quotient(View view) {
        EditText et1 =(EditText)findViewById(R.id.Num1);
        EditText et2 =(EditText)findViewById(R.id.Num2);
        EditText et3 =(EditText)findViewById(R.id.Result);
        float Num1 = Integer.parseInt(et1.getText().toString());
        float Num2 = Integer.parseInt(et2.getText().toString());
        float Quotient = (Num1/Num2);
        et3.setText("The Quotient is " + Quotient);
    }


}