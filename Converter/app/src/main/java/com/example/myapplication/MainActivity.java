package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void btn(View view)
    {
        EditText dollarAmount=(EditText) findViewById(R.id.dollar);
        String dollars=dollarAmount.getText().toString();
        Double doubleDollar=Double.parseDouble(dollars);
        Double Pkr=doubleDollar*189.85;
        TextView pkr=(TextView) findViewById(R.id.pkr);
        String show=Pkr.toString();
        pkr.setText(show);
        Toast.makeText(this, show, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}