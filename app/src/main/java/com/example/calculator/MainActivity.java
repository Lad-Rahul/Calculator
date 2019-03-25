package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnplus,btnminus,btnmulti,btndiv,btnans,btndot,btnsign;
    EditText disp;
    TextView sec_disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btndot = (Button)findViewById(R.id.btn_dot);
        btnsign = (Button)findViewById(R.id.btn_sign);
        btnplus = (Button)findViewById(R.id.btn_plus);
        btnminus = (Button)findViewById(R.id.btn_minus);
        btnmulti = (Button)findViewById(R.id.btn_multi);
        btndiv = (Button)findViewById(R.id.btn_div);
        btnans = (Button)findViewById(R.id.btn_ans);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(disp.getText().toString())==true){
                    disp.setText("");
                }
                disp.setText(disp.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(disp.getText().toString())==true){
                    disp.setText("");
                }
                disp.setText(disp.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(disp.getText().toString())==true){
                    disp.setText("");
                }
                disp.setText(disp.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(disp.getText().toString())==true){
                    disp.setText("");
                }
                disp.setText(disp.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(disp.getText().toString())==true){
                    disp.setText("");
                }
                disp.setText(disp.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(disp.getText().toString())==true){
                    disp.setText("");
                }
                disp.setText(disp.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(disp.getText().toString())==true){
                    disp.setText("");
                }
                disp.setText(disp.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(disp.getText().toString())==true){
                    disp.setText("");
                }
                disp.setText(disp.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(disp.getText().toString())==true){
                    disp.setText("");
                }
                disp.setText(disp.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(disp.getText().toString())==true){

                }
                disp.setText(disp.getText() + "0");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = disp.getText().toString();
                boolean flag = false;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)=='.'){
                        flag = true;
                        break;
                    }
                }
                if(flag==false)
                    disp.setText(disp.getText() + ".");
            }
        });

        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = evaluate(sec_disp.toString());
                str = str+'+';
                sec_disp.setText(str);
                disp.setText("0");
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = evaluate(sec_disp.toString());
                str = str+'-';
                sec_disp.setText(str);
                disp.setText("0");
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = evaluate(sec_disp.toString());
                str = str+'*';
                sec_disp.setText(str);
                disp.setText("0");
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = evaluate(sec_disp.toString());
                str = str+'/';
                sec_disp.setText(str);
                disp.setText("0");
            }
        });

        btnans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = evaluate(sec_disp.toString());
                sec_disp.setText(str);
                disp.setText("0");

            }
        });
    }

    boolean checkzero(String str){
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='0' || str.charAt(i)=='.'){

            }
            else{
                return false;
            }
        }
        return true;
    }

    String evaluate(String str){
        int i;
        int n = str.length();
        if(str.charAt(n-1)<48 || str.charAt(n-1)>57){
            Integer n1 = Integer.parseInt(str.substring(0,n-1));
            Integer n2 = Integer.parseInt(disp.getText().toString());

            int ans = 0;
            if(str.charAt(n-1)=='+'){
                ans = n1+n2;
            }
            if(str.charAt(n-1)=='-'){
                ans = n1-n2;
            }
            if(str.charAt(n-1)=='*'){
                ans = n1*n2;
            }
            if(str.charAt(n-1)=='/'){
                ans = n1/n2;
            }
            str = String.valueOf(ans);

        }else{
            str = disp.getText().toString();
        }
//        for(i=0;i<str.length();i++){
//            if(str.charAt(i)<48 || str.charAt(i)>57){
//                break;
//            }
//        }
//        if(i==str.length())
//            return str;
//        else{
//            Integer n1 = Integer.parseInt(str.substring(0,i));
//            Integer n2 = Integer.parseInt(str.substring(i+1,str.length()));
//            Integer ans = 0;
//            if(str.charAt(i)=='+'){
//                ans = n1+n2;
//            }
//            if(str.charAt(i)=='-'){
//                ans = n1-n2;
//            }
//            if(str.charAt(i)=='*'){
//                ans = n1*n2;
//            }
//            if(str.charAt(i)=='/'){
//                ans = n1/n2;
//            }
//            str = ans.toString();
//        }
        return str;
    }
}
