package com.example.learninggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScorecardActivity extends AppCompatActivity {
    TextView txt;
    Button btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorecard);
        txt=findViewById(R.id.textView);
        btn=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        Intent intent = getIntent();
        String id = intent.getStringExtra("score");
        String name = intent.getStringExtra("total");
        txt.setText("Total Attempted : "+name+"\nScore : "+id);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ScorecardActivity.this,QuizActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ScorecardActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}