package com.example.calculator;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnplus, btnminus, btnmulti, btndiv, btnans, btndot, btnsign,btnback,btnAC;
    EditText disp;
    TextView sec_disp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btndot = (Button) findViewById(R.id.btn_dot);
        btnplus = (Button) findViewById(R.id.btn_plus);
        btnminus = (Button) findViewById(R.id.btn_minus);
        btnmulti = (Button) findViewById(R.id.btn_multi);
        btndiv = (Button) findViewById(R.id.btn_div);
        btnans = (Button) findViewById(R.id.btn_ans);
        btnAC = (Button)findViewById(R.id.btn_AC);
        btnback = (Button)findViewById(R.id.btn_backspace);

        disp = (EditText) findViewById(R.id.display);
        disp.setSelection(disp.getText().length());
        sec_disp = (TextView) findViewById(R.id.screen);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(String.valueOf(disp.getText())))
                    disp.setText("");
                disp.setText(disp.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(String.valueOf(disp.getText())))
                    disp.setText("");
                disp.setText(disp.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(String.valueOf(disp.getText())))
                    disp.setText("");
                disp.setText(disp.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(String.valueOf(disp.getText())))
                    disp.setText("");
                disp.setText(disp.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(String.valueOf(disp.getText())))
                    disp.setText("");
                disp.setText(disp.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(String.valueOf(disp.getText())))
                    disp.setText("");
                disp.setText(disp.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(String.valueOf(disp.getText())))
                    disp.setText("");
                disp.setText(disp.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(String.valueOf(disp.getText())))
                    disp.setText("");
                disp.setText(disp.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(String.valueOf(disp.getText())))
                    disp.setText("");
                disp.setText(disp.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkzero(String.valueOf(disp.getText())))
                    disp.setText("");
                disp.setText(disp.getText() + "0");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(disp.getText());
                int n = str.length();
                boolean flag = false;
                for(int i=n-1;i>=0;i--){
                    if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' )
                        break;
                    if(str.charAt(i)=='.'){
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                    disp.setText(str + ".");
                }
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(disp.getText());
                String upstr = String.valueOf(sec_disp.getText());
                String res = basicOperation(str,upstr,'+');
                sec_disp.setText(res);
                disp.setText("0");
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(disp.getText());
                String upstr = String.valueOf(sec_disp.getText());
                String res = basicOperation(str,upstr,'-');
                sec_disp.setText(res);
                disp.setText("0");
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(disp.getText());
                String upstr = String.valueOf(sec_disp.getText());
                String res = basicOperation(str,upstr,'*');
                sec_disp.setText(res);
                disp.setText("0");
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(disp.getText());
                String upstr = String.valueOf(sec_disp.getText());
                String res = basicOperation(str,upstr,'/');
                sec_disp.setText(res);
                disp.setText("0");
            }
        });

        btnans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(disp.getText());
                String upstr = String.valueOf(sec_disp.getText());
                String res = getAns(str,upstr);
                sec_disp.setText(res);
                disp.setText(res);
            }
        });


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = String.valueOf(disp.getText());
                int n = str.length();
                if(n==1){
                    str = "0";
                }
                else{
                    str = str.substring(0,n-1);
                }
                disp.setText(str);
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disp.setText("0");
            }
        });

    }
    static boolean checkzero(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){

            }
            else{
                return false;
            }
        }
        return true;
    }

    static String basicOperation(String str,String upstr,char op){
        int n = str.length();
        int m = upstr.length();
        String res;
        if((upstr.charAt(m-1)>=48 && upstr.charAt(m-1)<=57)||upstr.charAt(m-1)=='.') {
            res = str + op;
        }
        else{
            Double n1 = Double.parseDouble(upstr.substring(0,m-1));
            Double n2 = Double.parseDouble(str);
            double ans = 0;
            if(upstr.charAt(m-1)=='+'){
                ans = n1 + n2;
            }
            else if(upstr.charAt(m-1)=='-'){
                ans = n1 - n2;
            }
            else if(upstr.charAt(m-1)=='*'){
                ans = n1 + n2;
            }
            else if(upstr.charAt(m-1)=='/'){
                ans = n1 + n2;
            }
            res = String.valueOf(ans) + op;
        }
        return res;
    }

    static String getAns(String str,String upstr){
        int n = str.length();
        int m = upstr.length();
        String res;
        if((upstr.charAt(m-1)>=48 && upstr.charAt(m-1)<=57)||upstr.charAt(m-1)=='.') {
            res = str;
        }
        else{
            Double n1 = Double.parseDouble(upstr.substring(0,m-1));
            Double n2 = Double.parseDouble(str);
            double ans = 0;
            if(upstr.charAt(m-1)=='+'){
                ans = n1 + n2;
            }
            else if(upstr.charAt(m-1)=='-'){
                ans = n1 - n2;
            }
            else if(upstr.charAt(m-1)=='*'){
                ans = n1 + n2;
            }
            else if(upstr.charAt(m-1)=='/'){
                ans = n1 + n2;
            }
            res = String.valueOf(ans);
        }
        return res;
    }

}
