package com.example.kakulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //---BUTTONS---
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnplus,btnminus,btnres,btnmul,btndiv,btnper,btndel,btnalldel;
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
        btndiv = findViewById(R.id.btn_div);
        btnper = findViewById(R.id.btn_per);
        btndel = findViewById(R.id.btn_del);
        btnalldel = findViewById(R.id.btn_del_all);
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
        btndiv.setOnClickListener(clickListener);
        btnper.setOnClickListener(clickListener);
        btndel.setOnClickListener(clickListener);
        btnalldel.setOnClickListener(clickListener);
        //------------------------

        tv.setText("0");
        allrestv.setText("");
    }


    View.OnClickListener clickListener = new View.OnClickListener() {

        String expr_str = "";
        String allexpr_str = "";
        boolean doublesign = true, perdoublesign = true;
        int expr = 0;
        char sign = ' ';

        private void Operations(){
            switch (sign){
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
                case '*':
                    if (!expr_str.isEmpty())
                        expr = expr * Integer.parseInt(expr_str);
                    break;
                case '/':
                    if (!expr_str.isEmpty() && Integer.parseInt(expr_str) == 0){
                        expr = 0;
                        break;
                    }
                    if (!expr_str.isEmpty())
                        expr = expr / Integer.parseInt(expr_str);
                    break;
            }
        }

        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.btn_0:
                    if(expr_str == "") break;
                    expr_str = expr_str + "0";
                    tv.setText(expr_str);
                    allexpr_str += "0";
                    doublesign = true;
                    perdoublesign = true;
                    break;

                case R.id.btn_1:
                    if(expr_str == "0") expr_str = "";
                    expr_str = expr_str + "1";
                    tv.setText(expr_str);
                    allexpr_str += "1";
                    doublesign = true;
                    perdoublesign = true;
                    break;

                case R.id.btn_2:
                    if(expr_str == "0") expr_str = "";
                    expr_str = expr_str + "2";
                    tv.setText(expr_str);
                    allexpr_str += "2";
                    doublesign = true;
                    perdoublesign = true;
                    break;

                case R.id.btn_3:
                    if(expr_str == "0") expr_str = "";
                    expr_str = expr_str + "3";
                    tv.setText(expr_str);
                    allexpr_str += "3";
                    doublesign = true;
                    perdoublesign = true;
                    break;

                case R.id.btn_4:
                    if(expr_str == "0") expr_str = "";
                    expr_str = expr_str + "4";
                    tv.setText(expr_str);
                    allexpr_str += "4";
                    doublesign = true;
                    perdoublesign = true;
                    break;

                case R.id.btn_5:
                    if(expr_str == "0") expr_str = "";
                    expr_str = expr_str + "5";
                    tv.setText(expr_str);
                    allexpr_str += "5";
                    doublesign = true;
                    perdoublesign = true;
                    break;

                case R.id.btn_6:
                    if(expr_str == "0") expr_str = "";
                    expr_str = expr_str + "6";
                    tv.setText(expr_str);
                    allexpr_str += "6";
                    doublesign = true;
                    perdoublesign = true;
                    break;

                case R.id.btn_7:
                    if(expr_str == "0") expr_str = "";
                    expr_str = expr_str + "7";
                    tv.setText(expr_str);
                    allexpr_str += "7";
                    doublesign = true;
                    perdoublesign = true;
                    break;

                case R.id.btn_8:
                    if(expr_str == "0") expr_str = "";
                    expr_str = expr_str + "8";
                    tv.setText(expr_str);
                    allexpr_str += "8";
                    doublesign = true;
                    perdoublesign = true;
                    break;

                case R.id.btn_9:
                    if(expr_str == "0") expr_str = "";
                    expr_str = expr_str + "9";
                    tv.setText(expr_str);
                    allexpr_str += "9";
                    doublesign = true;
                    perdoublesign = true;
                    break;

                case R.id.btn_plus:
                    Operations();
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
                    Operations();
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
                    Operations();
                    sign = '*';
                    expr_str = "";
                    if (doublesign) {
                        allexpr_str += Character.toString(sign);
                        allrestv.setText(allexpr_str);
                    }
                    doublesign = false;
                    tv.setText(Integer.toString(expr));
                    break;

                case R.id.btn_div:
                    Operations();
                    sign = '/';
                    expr_str = "";
                    if (doublesign) {
                        allexpr_str += Character.toString(sign);
                        allrestv.setText(allexpr_str);
                    }
                    doublesign = false;
                    tv.setText(Integer.toString(expr));
                    break;

                case R.id.btn_per:
                    if (expr_str != "") expr_str = Integer.toString(expr * Integer.parseInt(expr_str)/100);
                    Operations();
                    sign = '%';
                    expr_str = "";
                    if (perdoublesign) {
                        allexpr_str += Character.toString(sign);
                        allrestv.setText(allexpr_str);
                    }
                    perdoublesign = false;
                    tv.setText(Integer.toString(expr));
                    break;

                case R.id.btn_del_all:
                    sign = ' ';
                    expr_str = "";
                    allexpr_str = "";
                    expr = 0;
                    tv.setText(Integer.toString(expr));
                    allrestv.setText(allexpr_str);
                    doublesign = true;
                    break;

                case R.id.btn_del:
                    if(expr_str.length() == 0) break;
                    expr_str = expr_str.substring(0, expr_str.length() - 1);
                    tv.setText(expr_str);
                    allexpr_str = allexpr_str.substring(0, allexpr_str.length() - 1);
                    break;

                case R.id.btn_res:
                    Operations();
                    sign = ' ';
                    expr_str = "";
                    allexpr_str = "";
                    tv.setText(Integer.toString(expr));
                    allrestv.setText(allexpr_str);
                    break;
            }
        }
    };

}
