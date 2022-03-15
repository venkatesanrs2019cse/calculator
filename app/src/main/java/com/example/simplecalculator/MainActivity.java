package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2,n3;
    Button b1,b2,b3,b4;
    float num1,num2,num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.add);
        b2 = (Button) findViewById(R.id.sub);
        b3 = (Button) findViewById(R.id.mul);
        b4 = (Button) findViewById(R.id.div);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        n3 = (EditText) findViewById(R.id.n3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!n1.getText().toString().isEmpty()){
                    num1 = Float.parseFloat(n1.getText().toString());
                }
                if(!n2.getText().toString().isEmpty()){
                    num2 = Float.parseFloat(n2.getText().toString());
                }
                num3 = num1 + num2;
                n3.setText(Float.toString(num3));

            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!n1.getText().toString().isEmpty()){
                    num1 = Float.parseFloat(n1.getText().toString());
                }
                if(!n2.getText().toString().isEmpty()){
                    num2 = Float.parseFloat(n2.getText().toString());
                }
                num3 = num1 - num2;
                n3.setText(Float.toString(num3));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!n1.getText().toString().isEmpty()){
                    num1 = Float.parseFloat(n1.getText().toString());
                }
                if(!n2.getText().toString().isEmpty()){
                    num2 = Float.parseFloat(n2.getText().toString());
                }
                num3 = num1 * num2;
                n3.setText(Float.toString(num3));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!n1.getText().toString().isEmpty()){
                    num1 = Float.parseFloat(n1.getText().toString());
                }
                if(!n2.getText().toString().isEmpty()){
                    num2 = Float.parseFloat(n2.getText().toString());
                }
                num3 = num1 / num2;
                n3.setText(Float.toString(num3));

            }
        });

    }
}