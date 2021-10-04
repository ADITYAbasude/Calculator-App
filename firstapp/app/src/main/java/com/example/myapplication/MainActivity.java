package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView answer , result;
    private Button b1, b2, b3, b4, b5, b6 , b7 , b8 , b9 , b0 , plus , subtract, multiply , divide  , clear , delect , equal1 ;
    private String count = "" , res = "" ;
    private boolean operator_inserted = false;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getActionBar().setTitle("Calculator");
        answer = findViewById(R.id.textView);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.button0);
        plus = findViewById(R.id.plus);
        subtract = findViewById(R.id.substract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        clear = findViewById(R.id.clear);
        delect = findViewById(R.id.delect);
        equal1 = findViewById(R.id.equal);
        result = findViewById(R.id.result);



        b1.setOnClickListener(view -> {
            count += "1";
            display();

        });
        b2.setOnClickListener(view -> {
            count += "2";
            display();

        });
        b3.setOnClickListener(view -> {
            count+= "3";
            display();

        });
        b4.setOnClickListener(view ->  {
            count+= "4";
            display();

        });
        b5.setOnClickListener(view-> {
            count+= "5";
            display();

        });
        b6.setOnClickListener(view-> {
            count += "6";
            display();
        });
        b7.setOnClickListener(view -> {
            count+="7";
            display();
        });
        b8.setOnClickListener(view -> {
            count += "8";
            display();
        });
        b9.setOnClickListener(view -> {
            count += "9";
            display();
        });
        b0.setOnClickListener(view -> {
            count += "0";
            display();
        });
        plus.setOnClickListener(view ->{
            if (!count.isEmpty()){
                if (!operator_inserted){

                    count += " + ";
                    operator_inserted = true;
                }
            }
            display();

        });
        subtract.setOnClickListener(view -> {
            if (!count.isEmpty()){
                if (!operator_inserted){

                    count += " - ";
                    operator_inserted = true;
                }
            }
            display();

        });
        multiply.setOnClickListener(view -> {
            if (!count.isEmpty()){
                if (!operator_inserted){

                    count += " * ";
                    operator_inserted = true;
                }
            }
            display();

        });
        divide.setOnClickListener(view -> {
            if (!count.isEmpty()){
                if (!operator_inserted){

                    count += " / ";
                    operator_inserted = true;
                }

            }
            display();

        });
        clear.setOnClickListener(view -> {
            if (!count.isEmpty()){
                operator_inserted = false;
            }
            count = "";
            res = "";
            displayresult();
            display();
        });
        delect.setOnClickListener(view->{

            if (!count.isEmpty()){
//
                if (count.substring(count.length()-1 , count.length()).equals(" ")){
                    count = count.substring(0 , count.length()-2);
                    operator_inserted  = false;
                }

                count = count.substring(0,count.length() - 1);
            }
            else if(count.isEmpty()){
                res = "";
                displayresult();
            }
            display();

        });

        equal1.setOnClickListener(view-> {
            if (operator_inserted==true && !count.substring(count.length()-1, count.length()).equals(" ")){
                String[] tokens = count
                        .split(" ");
                switch (tokens[1].charAt(0)){
                    case '+':
                        res  = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                        break;
                    case '-':
                        res  = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                        break;
                    case '*':
                        res  = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                        break;
                    case '/':
                        res  = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                        break;

                }
                displayresult();
            }
        });

    }
    public void display(){
        answer.setText(count);
    }
    public  void displayresult(){
        result.setText(res);
    }


}