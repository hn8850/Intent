package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button plus,minus,kefel,hiluk,equal,credits,reset;
    EditText calc;
    String st1,st2;
    double num1,num2,count;
    String op;
    int rezef = 0;
    double result = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = findViewById(R.id.calc);

    }


    public void plus(View view) {
        try{
            rezef = 0;
            if(count>0) {
                st2 = calc.getText().toString();
                num2 = Double.parseDouble(st2);
                if (op == "+") {
                    calc.setText(Double.toString(num1 + num2));
                    result = num1 + num2;
                }
                if (op == "-") {
                    calc.setText(Double.toString(num1 - num2));
                    result = num1 - num2;
                }
                if (op == "/") {
                    if (num2 == 0){
                        calc.setText("Cant divide by zero");
                        result = 0;
                    }
                    else {
                        calc.setText(Double.toString(num1 / num2));
                        result = num1 / num2;
                    }
                }
                if (op == "*") {
                    calc.setText(Double.toString(num1 * num2));
                    result = num1 * num2;

                }
            }
                st1 = calc.getText().toString();
                num1 = Double.parseDouble(st1);
                op = "+";
                calc.setText(null);
                count++;




        }
        catch (Exception e){
            calc.setText(null);
            rezef = 0;
            Toast.makeText(getApplicationContext(),"Syntax Error",Toast.LENGTH_SHORT).show();
            count = 0;
            num1 = 0;
            num2 = 0;
            op = null;
        }
    }

    public void minus(View view) {
        try{
            rezef = 0;
            if(count>0) {
                st2 = calc.getText().toString();
                num2 = Double.parseDouble(st2);
                if (op == "+") {
                    calc.setText(Double.toString(num1 + num2));
                    result = num1 + num2;
                }
                if (op == "-") {
                    calc.setText(Double.toString(num1 - num2));
                    result = num1 - num2;
                }
                if (op == "/") {
                    if (num2 == 0){
                        calc.setText("Cant divide by zero");
                        result = 0;
                    }
                    else {
                        calc.setText(Double.toString(num1 / num2));
                        result = num1 / num2;
                    }
                }
                if (op == "*") {
                    calc.setText(Double.toString(num1 * num2));
                    result = num1 * num2;

                }
            }
            st1 = calc.getText().toString();
            num1 = Double.parseDouble(st1);
            op = "-";
            calc.setText(null);
            count++;




        }
        catch (Exception e){
            calc.setText(null);
            rezef = 0;
            Toast.makeText(getApplicationContext(),"Syntax Error",Toast.LENGTH_SHORT).show();
            count = 0;
            num1 = 0;
            num2 = 0;
            op = null;
        }
    }


    public void divide(View view){
        try{
            rezef = 0;
            if(count>0) {
                st2 = calc.getText().toString();
                num2 = Double.parseDouble(st2);
                if (op == "+") {
                    calc.setText(Double.toString(num1 + num2));
                    result = num1 + num2;
                }
                if (op == "-") {
                    calc.setText(Double.toString(num1 - num2));
                    result = num1 - num2;
                }
                if (op == "/") {
                    if (num2 == 0){
                        calc.setText("Cant divide by zero");
                        result = 0;
                    }
                    else {
                        calc.setText(Double.toString(num1 / num2));
                        result = num1 / num2;
                    }
                }
                if (op == "*") {
                    calc.setText(Double.toString(num1 * num2));
                    result = num1 * num2;

                }
            }
            st1 = calc.getText().toString();
            num1 = Double.parseDouble(st1);
            op = "/";
            calc.setText(null);
            count++;




        }
        catch (Exception e){
            calc.setText(null);
            rezef = 0;
            Toast.makeText(getApplicationContext(),"Syntax Error",Toast.LENGTH_SHORT).show();
            count = 0;
            num1 = 0;
            num2 = 0;
            op = null;
        }
    }


    public void kefel(View view) {
        try{
            rezef = 0;
            if(count>0) {
                st2 = calc.getText().toString();
                num2 = Double.parseDouble(st2);
                if (op == "+") {
                    calc.setText(Double.toString(num1 + num2));
                    result = num1 + num2;
                }
                if (op == "-") {
                    calc.setText(Double.toString(num1 - num2));
                    result = num1 - num2;
                }
                if (op == "/") {
                    if (num2 == 0){
                        calc.setText("Cant divide by zero");
                        result = 0;
                    }
                    else {
                        calc.setText(Double.toString(num1 / num2));
                        result = num1 / num2;
                    }
                }
                if (op == "*") {
                    calc.setText(Double.toString(num1 * num2));
                    result = num1 * num2;

                }
            }
            st1 = calc.getText().toString();
            num1 = Double.parseDouble(st1);
            op = "*";
            calc.setText(null);
            count++;




        }
        catch (Exception e){
            calc.setText(null);
            rezef = 0;
            Toast.makeText(getApplicationContext(),"Syntax Error",Toast.LENGTH_SHORT).show();
            count = 0;
            num1 = 0;
            num2 = 0;
            op = null;
        }
    }


    public void equal(View view) {
        try {
            if (rezef == 0) {
                st2 = calc.getText().toString();
                num2 = Double.parseDouble(st2);
                if (op == "+") {
                    calc.setText(Double.toString(num1 + num2));
                    result = num1 + num2;
                }
                if (op == "-") {
                    calc.setText(Double.toString(num1 - num2));
                    result = num1 - num2;
                }
                if (op == "/") {
                    if (num2 == 0){
                        calc.setText("Cant divide by zero");
                        result = 0;
                    }
                    else {
                        calc.setText(Double.toString(num1 / num2));
                        result = num1 / num2;
                    }

                }
                if (op == "*") {
                    calc.setText(Double.toString(num1 * num2));
                    result = num1 * num2;

                }
                count = 0;
                rezef++;

            }

        }
        catch (Exception e){
            calc.setText(null);
            Toast.makeText(getApplicationContext(),"Syntax Error",Toast.LENGTH_SHORT).show();
            count = 0;
            num1 = 0;
            num2 = 0;
            op = null;

        }



        }


    public void reset(View view) {
        calc.setText("");
        count = 0;
        num1 = 0;
        num2 = 0;
        op = null;
    }


    public void credits(View view) {

        Intent si = new Intent(this,credits.class);
        si.putExtra("result",result);
        startActivity(si);
    }

}
