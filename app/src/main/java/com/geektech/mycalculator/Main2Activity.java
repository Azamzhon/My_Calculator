package com.geektech.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button button;
    TextView textView;
    String resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.resultShow);
        if (getIntent() != null){
            String s = getIntent().getStringExtra("result_calc");
            textView.setText(s);
        }

        button = findViewById(R.id.share);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, resultText);
                intent.setType("text/plain");

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        textView = findViewById(R.id.resultShow);
        button  = findViewById(R.id.Calculator);
        Intent intent = getIntent();
        String text = intent.getStringExtra("result_calc");
        textView.setText(text);
    }

    public void Calculator(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
