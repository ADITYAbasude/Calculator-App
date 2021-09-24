package com.example.qapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    TextView text;

    private String[] arr = {"Kiran is good boy", "Mumbai is capital of Maharashtra",
            "Kya Aditya ke pass iphone 12 hai", "Kya Python ek easy programming language hai"};
    private boolean[] answer = {false, true, false, true};
    private int index = 0;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        text = findViewById(R.id.textView);

        text.setText(arr[0]);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= arr.length - 1) {


                    if (answer[index] == true) {
                        score++;
                    }
                    index++;
                    if (index <= arr.length - 1) {
                        text.setText(arr[index]);

                    }
//                    if (answer[index]!=false){
//                        text.setText(arr[index--]);
//                    }

                    else {
                        Toast.makeText(MainActivity.this, "Your score is : " + score++, Toast.LENGTH_SHORT).show();
                    }


                }


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= arr.length - 1) {
                    if (answer[index] == false) {
                        score++;
                    }
                    index++;
                    if (index <= arr.length - 1) {
                        text.setText(arr[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is : " + score++, Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });


    }
}