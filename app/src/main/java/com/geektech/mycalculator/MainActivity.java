package com.geektech.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String saveResult;

    EditText editText;
    TextView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnDivide, btnMultiply, btnMinus, btnPlus, btnPercent, btnEqual, btnDot, btnRemove;

    double valueOne, valueTwo;
    boolean addition, subtraction, multiplication, division, percents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.textResult);
        btn0 = findViewById(R.id.zero);
        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
        btnPlus = findViewById(R.id.plus);
        btnMinus = findViewById(R.id.minus);
        btnMultiply = findViewById(R.id.multiply);
        btnDivide = findViewById(R.id.divide);
        btnPercent = findViewById(R.id.percent);
        btnEqual = findViewById(R.id.equal);
        btnDot = findViewById(R.id.dot);
        btnRemove = findViewById(R.id.remove);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num0 = editText.getText().toString();
                if (TextUtils.isEmpty(num0)) {
                    editText.setText("");
                }else{
                    editText.setText(editText.getText() + "0");
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null){
                    editText.setText("");
                }else {
                    valueOne = Double.parseDouble(editText.getText()+"");
                    addition=true;
                    editText.setText(null);
                }

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    subtraction = true;
                    editText.setText(null);
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    division = true;
                    editText.setText(null);
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null){
                    editText.setText("");
                }else {
                    valueOne = Double.parseDouble(editText.getText()+"");
                    multiplication = true;
                    editText.setText(null);
                }

            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null){
                    editText.setText("");
                }else {
                    valueOne = Double.parseDouble(editText.getText()+"");
                    percents =true;
                    editText.setText(null);
                }

            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dot=editText.getText().toString();
                if (TextUtils.isEmpty(dot)) {
                    editText.setText("");
                }else{
                    editText.setText(editText.getText()+".");
                }

            }
        });

        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Double.parseDouble(editText.getText()+"");
                if (addition == true){
                    editText.setText(valueOne + valueTwo + "");
                    addition=false;
                }
                if (subtraction == true){
                    editText.setText(valueOne - valueTwo + "");
                    subtraction =false;
                }
                if (percents == true){
                    editText.setText((valueOne/100)*valueTwo + "");
                    percents =false;
                }
                if (multiplication == true){
                    editText.setText(valueOne * valueTwo + "");
                    multiplication =false;
                }
                if (division == true){
                    editText.setText(valueOne / valueTwo + "");
                    division=false;
                }
            }
        });
    }

    public void showResultValues(View view) {
        saveResult = editText.getText().toString();

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("result_calc", saveResult);
        startActivity(intent);
    }
}