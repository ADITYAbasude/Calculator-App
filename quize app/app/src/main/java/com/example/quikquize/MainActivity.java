package com.example.quikquize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView qview;
    RadioButton r1, r2, r3, r4;
    Button nextbtn, prebtn;
    private String[] questions = {"1). Who is the Prime minister of India?", "2). Who is the jaagu?"};
    private String[] radio1 = {"Narandra Modi", "Kiran"};
    private String[] radio2 = {"Rahul Gandhi", "Aditya"};
    private String[] radio3 = {"Amit Shah", "Jagdish"};
    private String[] radio4 = {"Gandhiji", "jatin"};
    private boolean[][] answer = {{true, false},
            {false, false},
            {false, true},
            {false, false}
    };

    private int num = 0;
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qview = findViewById(R.id.textView);
        r1 = findViewById(R.id.radio1);
        r2 = findViewById(R.id.radio2);
        r3 = findViewById(R.id.radio3);
        r4 = findViewById(R.id.radio4);

        nextbtn = findViewById(R.id.nextbtn);
        prebtn = findViewById(R.id.prebtn);

        qview.setText(questions[0]);
        r1.setText(radio1[0]);
        r2.setText(radio2[0]);
        r3.setText(radio3[0]);
        r4.setText(radio4[0]);

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                questionset();
                optionset();
            }
        });

        prebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prequestion();
                preoption();
            }
        });


    }


    void questionset() {
        if (num <= questions.length - 1) {

            num++;
            qview.setText(questions[num]);
        }
    }

    void optionset() {
        if (num <= questions.length - 1) {
            r1.setChecked(false);
            r2.setChecked(false);
            r3.setChecked(false);
            r4.setChecked(false);
            r1.setText(radio1[1]);
            r2.setText(radio2[1]);
            r3.setText(radio3[1]);
            r4.setText(radio4[1]);
        }
    }

    void prequestion() {
        if (num <= questions.length - 1) {

            qview.setText(questions[0]);
        }

    }

    void preoption() {
        if (num <= questions.length - 1) {

            num--;
            r1.setText(radio1[num]);
            r2.setText(radio2[num]);
            r3.setText(radio3[num]);
            r4.setText(radio4[num]);
        }


    }


}