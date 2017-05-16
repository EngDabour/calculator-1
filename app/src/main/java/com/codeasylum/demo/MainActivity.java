package com.codeasylum.demo;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;3

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btsub, bt0, btadd, btmultiply, btdivide, btdot, bt16, btclear, btequal;
    //TextView text;
    EditText text;
    TextView txtinput1, txtinput2, txtsolution;
    float first, second;
    boolean madd = false, msub = false, mmultiply = false, mdivide = false, mequal = false, mclear = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        bt1 = (Button) findViewById(R.id.button1);
        bt2 = (Button) findViewById(R.id.button2);
        bt3 = (Button) findViewById(R.id.button3);
        bt4 = (Button) findViewById(R.id.button4);
        bt5 = (Button) findViewById(R.id.button5);
        bt6 = (Button) findViewById(R.id.button6);
        bt7 = (Button) findViewById(R.id.button7);
        bt8 = (Button) findViewById(R.id.button8);
        bt9 = (Button) findViewById(R.id.button9);
        btsub = (Button) findViewById(R.id.buttonsub);
        bt0 = (Button) findViewById(R.id.button0);
        btadd = (Button) findViewById(R.id.buttonadd);
        btmultiply = (Button) findViewById(R.id.buttonmultiply);
        btequal = (Button) findViewById(R.id.buttonequal);
        btdivide = (Button) findViewById(R.id.buttondevide);
        bt16 = (Button) findViewById(R.id.button16);
        btclear = (Button) findViewById(R.id.buttonclear);
        btdot = (Button) findViewById(R.id.buttondot);
        // text= (TextView) findViewById(R.id.txt);
        text = (EditText) findViewById(R.id.txt);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //input=et.text.getText().toString();
                // int i = Integer.parseInt(text.getText().toString());
                text.setText(text.getText() + "1");

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "2");


            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "3");

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "9");
            }
        });
        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null)
                    txtinput1.setText("");
                else {
                    first = Float.parseFloat(text.getText().toString() + "");
                    //text.setText(first+"");
                    msub = true;
                    text.setText("");
                }
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "0");
            }
        });
        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null)
                    text.setText("");
                else {
                    first = Float.parseFloat(text.getText().toString() + "");
                    //txtinput1.setText(first+"");
                    madd = true;
                    text.setText("");
                }
            }
        });
        btmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null)
                    text.setText("");
                else {
                    first = Float.parseFloat(text.getText().toString() + "");
                    //txtinput1.setText(first+"");
                    madd = false;
                    msub = false;
                    mdivide = false;
                    mmultiply = true;
                    text.setText("");
                }
            }
        });
        btequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second = Float.parseFloat(text.getText().toString() + "");
                //txtinput2.setText(second +"");
                if (madd == true) {
                    text.setText(first + second + "");
                    madd = false;
                }
                if (msub == true) {
                    text.setText(first - second + "");
                    msub = false;
                }
                if (mmultiply == true) {
                    text.setText(first * second + "");
                    mmultiply = false;
                }
                if (mdivide == true) {
                    text.setText(first / second + "");
                    mdivide = false;
                }
            }
        });
        btdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text == null)
                    text.setText("");
                else {
                    first = Float.parseFloat(text.getText().toString() + "");
                    mdivide = true;
                    text.setText("");
                }
            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("1");
                text.getText();
            }
        });
        btclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });
        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + ".");
            }
        });
        //text.getText();

    }


}
