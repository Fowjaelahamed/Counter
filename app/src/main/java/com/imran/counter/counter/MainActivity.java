package com.imran.counter.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.String;

public class MainActivity extends AppCompatActivity {

    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView=(TextView)findViewById(R.id.textView);
        final Button Minus=(Button)findViewById(R.id.minus);
        final Button Reset=(Button)findViewById(R.id.reset);
        final Button Plus=(Button)findViewById(R.id.plus);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=0;
                String st=String.valueOf(i);
                textView.setText(st);
            }
        });
        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st=String.valueOf(--i);
                textView.setText(st);
            }
        });
        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String  st=String.valueOf(++i);
                textView.setText(st);
            }
        });
    }
}
