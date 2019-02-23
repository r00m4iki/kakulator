package com.example.kakulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //---BUTTONS---
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnplus,btnminus,btnres,btnmul,btndel;
    TextView tv,allrestv;
    //-------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---INIT BUTTONS---
        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        tv = findViewById(R.id.res);
        allrestv = findViewById(R.id.all_res);
        btnplus = findViewById(R.id.btn_plus);
        btnminus = findViewById(R.id.btn_min);
        btnres = findViewById(R.id.btn_res);
        btnmul = findViewById(R.id.btn_mul);
        btndel = findViewById(R.id.btn_del_all);
        //---INIT BUTTONS---

        //---SET CLICK LISTENER---
        btn0.setOnClickListener(clickListener);
        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);
        btn3.setOnClickListener(clickListener);
        btn4.setOnClickListener(clickListener);
        btn5.setOnClickListener(clickListener);
        btn6.setOnClickListener(clickListener);
        btn7.setOnClickListener(clickListener);
        btn8.setOnClickListener(clickListener);
        btn9.setOnClickListener(clickListener);
        btnres.setOnClickListener(clickListener);
        btnplus.setOnClickListener(clickListener);
        btnminus.setOnClickListener(clickListener);
        btnmul.setOnClickListener(clickListener);
        btndel.setOnClickListener(clickListener);
        //------------------------

        tv.setText("0");
      //  System.out.println(Integer.parseInt("-5"));
    }

    View.OnClickListener clickListener = new View.OnClickListener() {

        String expr_str = "";
        String allexpr_str = "";
        boolean doublesign = true;
        int expr = 0;
        char sign = ' ';


        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.btn_0:
                    expr_str = expr_str + "0";
                    tv.setText(expr_str);
                    allexpr_str += "0";
                    doublesign = true;
                    break;

                case R.id.btn_1:
                    expr_str = expr_str + "1";
                    tv.setText(expr_str);
                    allexpr_str += "1";
                    doublesign = true;
                    break;

                case R.id.btn_2:
                    expr_str = expr_str + "2";
                    tv.setText(expr_str);
                    allexpr_str += "2";
                    doublesign = true;
                    break;

                case R.id.btn_3:
                    expr_str = expr_str + "3";
                    tv.setText(expr_str);
                    allexpr_str += "3";
                    doublesign = true;
                    break;

                case R.id.btn_4:
                    expr_str = expr_str + "4";
                    tv.setText(expr_str);
                    allexpr_str += "4";
                    doublesign = true;
                    break;

                case R.id.btn_5:
                    expr_str = expr_str + "5";
                    tv.setText(expr_str);
                    allexpr_str += "5";
                    doublesign = true;
                    break;

                case R.id.btn_6:
                    expr_str = expr_str + "6";
                    tv.setText(expr_str);
                    allexpr_str += "6";
                    doublesign = true;
                    break;

                case R.id.btn_7:
                    expr_str = expr_str + "7";
                    tv.setText(expr_str);
                    allexpr_str += "7";
                    doublesign = true;
                    break;

                case R.id.btn_8:
                    expr_str = expr_str + "8";
                    tv.setText(expr_str);
                    allexpr_str += "8";
                    doublesign = true;
                    break;

                case R.id.btn_9:
                    expr_str = expr_str + "9";
                    tv.setText(expr_str);
                    allexpr_str += "9";
                    doublesign = true;
                    break;

                case R.id.btn_plus:
                    if (sign == '+' && !expr_str.isEmpty())
                        expr = expr + Integer.parseInt(expr_str);
                    else {
                        switch (sign)
                        {
                            case ' ':
                                if (!expr_str.isEmpty())
                                    expr = Integer.parseInt(expr_str);
                                if (allexpr_str.isEmpty())
                                    allexpr_str += Integer.toString(expr);
                                break;
                            case '-':
                                if (!expr_str.isEmpty())
                                    expr = expr - Integer.parseInt(expr_str);
                                break;
                            case '*':
                                if (!expr_str.isEmpty())
                                    expr = expr * Integer.parseInt(expr_str);
                                break;
                        }
                    }
                    sign = '+';
                    expr_str = "";
                    if (doublesign) {
                        allexpr_str += Character.toString(sign);
                        allrestv.setText(allexpr_str);
                    }
                    doublesign = false;
                    tv.setText(Integer.toString(expr));
                    break;

                case R.id.btn_min:
                    if (sign =='-' && !expr_str.isEmpty())
                        expr = expr - Integer.parseInt(expr_str);
                    else {
                        switch (sign)
                        {
                            case ' ':
                                if (!expr_str.isEmpty())
                                    expr = Integer.parseInt(expr_str);
                                if (allexpr_str.isEmpty())
                                    allexpr_str += Integer.toString(expr);
                                break;
                            case '+':
                                if (!expr_str.isEmpty())
                                    expr = expr + Integer.parseInt(expr_str);
                                break;
                            case '*':
                                if (!expr_str.isEmpty())
                                    expr = expr * Integer.parseInt(expr_str);
                                break;
                        }
                    }
                    sign = '-';
                    expr_str = "";
                    if (doublesign) {
                        allexpr_str += Character.toString(sign);
                        allrestv.setText(allexpr_str);
                    }
                    doublesign = false;
                    tv.setText(Integer.toString(expr));

                    break;

                case R.id.btn_mul:

                    if (sign =='*' && !expr_str.isEmpty())
                        expr = expr * Integer.parseInt(expr_str);
                    else {
                        switch (sign)
                        {
                            case ' ':
                                if (!expr_str.isEmpty())
                                    expr = Integer.parseInt(expr_str);
                                if (allexpr_str.isEmpty())
                                    allexpr_str += Integer.toString(expr);
                                break;
                            case '+':
                                if (!expr_str.isEmpty())
                                    expr = expr + Integer.parseInt(expr_str);

                                break;
                            case '-':
                                if (!expr_str.isEmpty()) 
                                    expr = expr - Integer.parseInt(expr_str);
                                break;
                        }
                    }
                    sign = '*';
                    expr_str = "";
                    if (doublesign) {
                        allexpr_str += Character.toString(sign);
                        allrestv.setText(allexpr_str);
                    }
                    doublesign = false;
                    tv.setText(Integer.toString(expr));
                    allrestv.setText(allexpr_str);
                    break;

                case R.id.btn_del_all:
                    expr_str = "";
                    allexpr_str = "";
                    tv.setText(expr_str);
                    allrestv.setText(allexpr_str);
                    break;

                case R.id.btn_res:
                    switch (sign)
                    {
                        case '+':
                            expr = expr + Integer.parseInt(expr_str);
                            break;

                        case  '-':
                            expr = expr - Integer.parseInt(expr_str);
                            break;
                        case '*':
                            if (!expr_str.isEmpty())
                                expr = expr * Integer.parseInt(expr_str);
                            break;
                    }
                    sign = ' ';
                    expr_str = "";
                    allexpr_str = "";
                    tv.setText(Integer.toString(expr));
                    allrestv.setText(allexpr_str);
                    expr = 0;
                    break;
            }
        }
    };

}
