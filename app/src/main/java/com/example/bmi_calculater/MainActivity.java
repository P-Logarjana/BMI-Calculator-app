package com.example.bmi_calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editTextWeight;
    private EditText editTextHeight;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWeight = (EditText) findViewById(R.id.weightId);
        editTextHeight = (EditText) findViewById(R.id.heightId);
        button = (Button) findViewById(R.id.btnId);
        textView = (TextView) findViewById(R.id.bmiId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height = Float.parseFloat(String.valueOf(editTextHeight.getText())) / 100;
                float weight = Float.parseFloat(String.valueOf(editTextWeight.getText()));
                float bmi = weight / (height*height);
                textView.setText(String.valueOf(bmi));
            }
        });
    }
}