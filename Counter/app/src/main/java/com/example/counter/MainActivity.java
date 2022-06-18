package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnIncrease,btnDecrease,btnReset;
    TextView textView;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIncrease=findViewById(R.id.increase);
        btnDecrease=findViewById(R.id.decrease);
        btnReset=findViewById(R.id.reset);
        textView=findViewById(R.id.counter);
        btnIncrease.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                counter++;
                textView.setText(Integer.toString(counter));
            }
        });
        btnDecrease.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                if(counter>0) {
                    counter--;
                    textView.setText(Integer.toString(counter));
                }
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                counter=0;
                textView.setText(Integer.toString(counter));
            }
        });

    }

}