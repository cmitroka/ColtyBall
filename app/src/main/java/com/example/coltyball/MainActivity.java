package com.example.coltyball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView txtHit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHit = findViewById(R.id.txtHit);

    }
    private String GetNumber()
    {
        String retVal="";
        int min=1;
        int max=275;
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

}