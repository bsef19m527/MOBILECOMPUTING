package com.example.learninggame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


public class QuizActivity extends AppCompatActivity {
    CharSequence match;
    int[] number;
    char[] option;
    ArrayList<Character> mylist = new ArrayList<Character>();

    char option1, option2, option3, option4;
    char answer;
    RadioGroup rg;
    RadioButton b1, b2, b3, b4, checkedButton;
    boolean bool1, bool2, bool3, bool4;
    ImageView img;
    TextView txt;
    Button btn, btn2;
    int score = 0;
    int total_question = 0;
    int checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);
        setContentView(R.layout.activity_quiz);
        rg = findViewById(R.id.rg);
        img = findViewById(R.id.imageView4);
        btn = findViewById(R.id.next);
        b1 = findViewById(R.id.radioButton1);
        b2 = findViewById(R.id.radioButton2);
        b3 = findViewById(R.id.radioButton3);
        b4 = findViewById(R.id.radioButton4);
        txt = findViewById(R.id.textView3);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Question Attempted: "+(total_question-1)+"\nRight Answers: "+score);
                builder.setTitle("Your Score");
                builder.setCancelable(false);
                builder.setPositiveButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int asdf) {
                                finish();
                            }
                        });

                builder.show();
            }
        });
        question();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checked = rg.getCheckedRadioButtonId();
                checkedButton = findViewById(checked);
                CharSequence ans = checkedButton.getText();
                if (ans.charAt(0) == answer) {
                    score++;
                    builder.setMessage("Right Answer");
                    builder.setTitle("Congrats!");
                    builder.setCancelable(false);
                    builder.setNegativeButton(
                            "Cancel",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int asdf) {
                                    dialog.cancel();
                                }
                            });

                    builder.show();
                    txt.setText("Your Score :" + score + "/" + total_question);
                } else {
                    String rightAnswer=rightAnswer(answer);
                    builder.setMessage("Wrong Answer\nRight Answer: "+ answer+" for "+rightAnswer);
                    builder.setTitle("Ahhhhh!");
                    builder.setCancelable(false);
                    builder.setNegativeButton(
                            "Close",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int asdf) {
                                    dialog.cancel();
                                }
                            });

                    builder.show();
                    txt.setText("Your Score :" + score + "/" + total_question);
                }
                rg.clearCheck();
                question();
            }
        });

    }

    public void question() {
        total_question++;
        answer = random();
        setImage(answer);
        mylist.add(answer);
        mylist.add(random());
        mylist.add(random());
        mylist.add(random());
        Collections.shuffle(mylist);
        b1.setText("" + mylist.get(0) + "");
        b2.setText("" + mylist.get(1) + "");
        b3.setText("" + mylist.get(2) + "");
        b4.setText("" + mylist.get(3) + "");
        mylist.clear();

    }

    public char random() {
        Random random = new Random();
        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        return randomizedCharacter;
    }

    public void setImage(char current_id) {
        if (current_id == 'a') {
            img.setImageResource(R.drawable.apple);
        } else if (current_id == 'b') {
            img.setImageResource(R.drawable.ball);
        } else if (current_id == 'c') {
            img.setImageResource(R.drawable.cat);
        } else if (current_id == 'd') {
            img.setImageResource(R.drawable.dog);
        } else if (current_id == 'e') {
            img.setImageResource(R.drawable.elephant);
        } else if (current_id == 'f') {
            img.setImageResource(R.drawable.fish);
        } else if (current_id == 'g') {
            img.setImageResource(R.drawable.goat);
        } else if (current_id == 'h') {
            img.setImageResource(R.drawable.hen);
        } else if (current_id == 'i') {
            img.setImageResource(R.drawable.icecream);
        } else if (current_id == 'j') {
            img.setImageResource(R.drawable.jug);
        } else if (current_id == 'k') {
            img.setImageResource(R.drawable.kite);
        } else if (current_id == 'l') {
            img.setImageResource(R.drawable.lion);
        } else if (current_id == 'm') {
            img.setImageResource(R.drawable.mango);
        } else if (current_id == 'n') {
            img.setImageResource(R.drawable.nest);
        } else if (current_id == 'o') {
            img.setImageResource(R.drawable.orange);
        } else if (current_id == 'p') {
            img.setImageResource(R.drawable.parrot);
        } else if (current_id == 'q') {
            img.setImageResource(R.drawable.quail);
        } else if (current_id == 'r') {
            img.setImageResource(R.drawable.rabbit);
        } else if (current_id == 's') {
            img.setImageResource(R.drawable.sun);
        } else if (current_id == 't') {
            img.setImageResource(R.drawable.tree);
        } else if (current_id == 'u') {
            img.setImageResource(R.drawable.umbrella);
        } else if (current_id == 'v') {
            img.setImageResource(R.drawable.van);
        } else if (current_id == 'w') {
            img.setImageResource(R.drawable.whale);
        } else if (current_id == 'x') {
            img.setImageResource(R.drawable.xray);
        } else if (current_id == 'y') {
            img.setImageResource(R.drawable.yak);
        } else if (current_id == 'z') {
            img.setImageResource(R.drawable.zebra);
        }
    }

    public String rightAnswer(char current_id) {
        if (current_id == 'a') {
            return "Apple";
        } else if (current_id == 'b') {
            return "Ball";
        } else if (current_id == 'c') {
            return "Cat";
        } else if (current_id == 'd') {
            return "Dot";
        } else if (current_id == 'e') {
            return "Elephant";
        } else if (current_id == 'f') {
            return "Fish";
        } else if (current_id == 'g') {
            return "Goat";
        } else if (current_id == 'h') {
            return "Hen";
        } else if (current_id == 'i') {
            return "IceCream";
        } else if (current_id == 'j') {
            return "Jug";
        } else if (current_id == 'k') {
            return "Kite";
        } else if (current_id == 'l') {
            return "Lion";
        } else if (current_id == 'm') {
            return "Mango";
        } else if (current_id == 'n') {
            return "Nest";
        } else if (current_id == 'o') {
            return "Orange";
        } else if (current_id == 'p') {
            return "Parrot";
        } else if (current_id == 'q') {
            return "Quail";
        } else if (current_id == 'r') {
            return "Rabbit";
        } else if (current_id == 's') {
            return "Sun";
        } else if (current_id == 't') {
            return "Tree";
        } else if (current_id == 'u') {
            return "Umbrella";
        } else if (current_id == 'v') {
            return "Van";
        } else if (current_id == 'w') {
            return "Whale";
        } else if (current_id == 'x') {
            return "X-ray";
        } else if (current_id == 'y') {
            return "Yak";
        } else if (current_id == 'z') {
            return "Zebra";
        } else {
            return "Nothing";
        }
    }
}