package com.example.scicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnDot;
    private Button btn0;
    private Button btnclear;
    private Button btnadd;
    private Button btnsub;
    private Button btnmul;
    private Button btndiv;
    private Button btnequ;
    private TextView info;
    private TextView rslt;


    private char ACTION;
    private final char add = '+';
    private final char sub = '-';
    private final char mul = '*';
    private final char div = '/';

    private double val1;
    private double val2;
    private double val3;

    public void compute() {
        switch (ACTION) {
            case add: {
                val3 = val1 + val2;
                rslt.setText(val1 + "+" + val2 + "=" + String.format("%.2f", val3));
                break;
            }
            case sub: {
                val3 = val1 - val2;
                rslt.setText(val1 + "-" + val2 + "=" + String.format("%.2f", val3));
                break;
            }
            case mul: {
                val3 = val1 * val2;
                rslt.setText(val1 + "*" + val2 + "=" + String.format("%.2f", val3));
                break;

            }
            case div: {
                val3 = val1 / val2;
                rslt.setText(val1 + "/" + val2 + "=" + String.format("%.2f", val3));
                break;

            }
        }
    }

    public void setupUIViews() {

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnDot = findViewById(R.id.button10);
        btn0 = findViewById(R.id.button11);
        btnclear = findViewById(R.id.button12);
        btnadd = findViewById(R.id.button13);
        btnsub = findViewById(R.id.button14);
        btnmul = findViewById(R.id.button15);
        btndiv = findViewById(R.id.button16);
        info = findViewById(R.id.textView);
        rslt = findViewById(R.id.textView2);
        btnequ = findViewById(R.id.button17);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + ".");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.parseDouble(info.getText().toString());
                rslt.setText(val1 + "+");
                info.setText(null);
                ACTION = add;


            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val1 = Double.parseDouble(info.getText().toString());
                rslt.setText(val1 + "-");
                info.setText(null);
                ACTION = sub;

            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.parseDouble(info.getText().toString());
                rslt.setText(val1 + "*");
                info.setText(null);
                ACTION = mul;


            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.parseDouble(info.getText().toString());
                rslt.setText(val1 + "/");
                info.setText(null);
                ACTION = div;

            }
        });
        btnequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val2 = Double.parseDouble(info.getText().toString());
                compute();
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (info.getText().length() > 0) {
                    CharSequence name = info.getText().toString();
                    rslt.setText(name.subSequence(0, name.length() - 1));
                    info.setText(null);
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    rslt.setText(null);
                }

            }
        });

    }

}
