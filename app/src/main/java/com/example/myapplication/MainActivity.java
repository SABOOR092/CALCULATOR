package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bclear,bplus,bminus,bmultiplay,bdivide,bequal;
    EditText ed1;
    float result1,result2;
    boolean plus,minus,divide,multipy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= (Button)findViewById(R.id.b1);
        b2= (Button)findViewById(R.id.b2);
        b3= (Button)findViewById(R.id.b3);
        b4= (Button)findViewById(R.id.b4);
        b5= (Button)findViewById(R.id.b5);
        b6= (Button)findViewById(R.id.b6);
        b7= (Button)findViewById(R.id.b7);
        b8= (Button)findViewById(R.id.b8);
        b9= (Button)findViewById(R.id.b9);
        b0= (Button)findViewById(R.id.b0);
        bdot= (Button)findViewById(R.id.bdot);
        bclear= (Button)findViewById(R.id.bclear);
        bdivide= (Button)findViewById(R.id.bdivide);
        bmultiplay= (Button)findViewById(R.id.bmultiply);
        bplus= (Button)findViewById(R.id.bplus);
        bminus= (Button)findViewById(R.id.bminus);
        bequal= (Button)findViewById(R.id.bequal);
        ed1= (EditText)findViewById(R.id.bedit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+ "1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+ "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+ "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+ "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+ "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+ "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+ "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+ "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+ "9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+ ".");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+ "0");
            }
        });


        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    result1=Float.parseFloat(ed1.getText()+" ");
                    plus=true;
                    ed1.setText(null);
                }
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    result1=Float.parseFloat(ed1.getText()+"");
                    minus=true;
                    ed1.setText(null);
                }
            }
        });
        bmultiplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    result1=Float.parseFloat(ed1.getText()+"");
                    multipy=true;
                    ed1.setText(null);
                }
            }
        });
        bdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    result1=Float.parseFloat(ed1.getText()+"");
                    divide=true;
                    ed1.setText(null);
                }
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2=Float.parseFloat(ed1.getText()+"");
                if(plus==true)
                {
                    ed1.setText(result1+result2+"");
                    plus=false;
                }
                if(minus==true)
                {
                    ed1.setText(result1-result2+"");
                    plus=false;
                }
                if(multipy==true)
                {
                    ed1.setText(result1*result2+"");
                    plus=false;
                }
                if(divide==true)
                {
                    ed1.setText(result1/result2+"");
                    plus=false;
                }
            }
        });

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });
    }
}