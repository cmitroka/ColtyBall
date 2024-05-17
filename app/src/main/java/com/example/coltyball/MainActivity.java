package com.example.coltyball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView txtHit;
    private TextView txtScore;
    int min=1;
    int max;
    int v0;
    int v1;
    int v2;
    int v3;
    int v4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHit = findViewById(R.id.txtHit);

    }
    private String GetNumber()
    {
        String retVal="";
        //int min=1;
        //int max=275;
        int iTest=new Random().nextInt(max - min + 1) + min;
        if (iTest>0&&iTest<=200)
        {
            retVal="0";
        }
        else if (iTest>200&&iTest<=250)
        {
            retVal="1!";
        }
        else if (iTest>250&&iTest<=265)
        {
            retVal="2!!";

        }
        else if (iTest>265&&iTest<=272)
        {
            retVal="3!!!";

        }
        else if (iTest>272&&iTest<=275)
        {
            retVal="4!!!!";

        }
        return retVal;
    }
    public void onClickHit(View v)
    {
        txtHit.setText(GetNumber());
    }
    public void onClickClear(View v)
    {
        txtHit.setText("");
    }

    private void DoMath()
    {
        TextView txt0 = findViewById(R.id.txt0);
        TextView txt1 = findViewById(R.id.txt1);
        TextView txt2 = findViewById(R.id.txt2);
        TextView txt3 = findViewById(R.id.txt3);
        TextView txt4 = findViewById(R.id.txt4);
        String textValue0 = txt0.getText().toString();
        int numericValue0 = 0;
        try {
            numericValue0 = Integer.parseInt(textValue0);
        } catch (NumberFormatException e) {
        }
        String textValue1 = txt1.getText().toString();
        int numericValue1 = 0;
        try {
            numericValue1 = Integer.parseInt(textValue1);
        } catch (NumberFormatException e) {
        }
        String textValue2 = txt2.getText().toString();
        int numericValue2 = 0;
        try {
            numericValue2 = Integer.parseInt(textValue2);
        } catch (NumberFormatException e) {
        }
        String textValue3 = txt3.getText().toString();
        int numericValue3 = 0;
        try {
            numericValue3 = Integer.parseInt(textValue3);
        } catch (NumberFormatException e) {
        }
        String textValue4 = txt4.getText().toString();
        int numericValue4 = 0;
        try {
            numericValue4 = Integer.parseInt(textValue4);
        } catch (NumberFormatException e) {
        }
        v0=numericValue0;
        v1=numericValue1;
        v2=numericValue2;
        v3=numericValue3;
        v4=numericValue4;
        max=numericValue0+numericValue1+numericValue2+numericValue3+numericValue4;
    }
}