package com.example.learninggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LearnActivity extends AppCompatActivity {
    ListView lv1,lv2;
    String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        ArrayList<Character> a_m=new ArrayList<Character>();
        ArrayList<Character> n_z=new ArrayList<Character>();
        lv1=findViewById(R.id.lv1);
        lv2=findViewById(R.id.lv2);
        for(int i=0;i<13;i++)
        {
            a_m.add(str.charAt(i));
            n_z.add(str.charAt(i+13));
        }
        ArrayAdapter<Character> ad1=new ArrayAdapter<Character>(this,android.R.layout.simple_list_item_1,a_m);
        ArrayAdapter<Character> ad2=new ArrayAdapter<Character>(this,android.R.layout.simple_list_item_1,n_z);
        lv1.setAdapter(ad1);
        lv2.setAdapter(ad2);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                toast(i);
            }
        });
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                toast(i+13);
            }
        });
    }
    public void sendImage(int i,ImageView imageView,TextView myMessage) {
        int current_id=i;
        if(current_id==0) {
            myMessage.setText("Apple");
            imageView.setImageResource(R.drawable.apple);
        }
        else if(current_id==1) {
            myMessage.setText("Ball");
            imageView.setImageResource(R.drawable.ball);
        }
        else if(current_id==2) {
            myMessage.setText("Cat");
            imageView.setImageResource(R.drawable.cat);
        }
        else if(current_id==3) {
            myMessage.setText("Dog");
            imageView.setImageResource(R.drawable.dog);
        }
        else if(current_id==4) {
            myMessage.setText("Elephant");
            imageView.setImageResource(R.drawable.elephant);
        }
        else if(current_id==5) {
            myMessage.setText("Fish");
            imageView.setImageResource(R.drawable.fish);
        }
        else if(current_id==6) {
            myMessage.setText("Goat");
            imageView.setImageResource(R.drawable.goat);
        }
        else if(current_id==7) {
            myMessage.setText("Hen");
            imageView.setImageResource(R.drawable.hen);
        }
        else if(current_id==8) {
            myMessage.setText("IceCream");
            imageView.setImageResource(R.drawable.icecream);
        }
        else if(current_id==9) {
            myMessage.setText("Jug");
            imageView.setImageResource(R.drawable.jug);
        }
        else if(current_id==10) {
            myMessage.setText("Kite");
            imageView.setImageResource(R.drawable.kite);
        }
        else if(current_id==11) {
            myMessage.setText("Lion");
            imageView.setImageResource(R.drawable.lion);
        }
        else if(current_id==12) {
            myMessage.setText("Mango");
            imageView.setImageResource(R.drawable.mango);
        }
        else if(current_id==13) {
            myMessage.setText("Nest");
            imageView.setImageResource(R.drawable.nest);
        }
        else if(current_id==14) {
            myMessage.setText("Orange");
            imageView.setImageResource(R.drawable.orange);
        }
        else if(current_id==15) {
            myMessage.setText("Parrot");
            imageView.setImageResource(R.drawable.parrot);
        }
        else if(current_id==16) {
            myMessage.setText("Quail");
            imageView.setImageResource(R.drawable.quail);
        }
        else if(current_id==17) {
            myMessage.setText("Rabbit");
            imageView.setImageResource(R.drawable.rabbit);
        }
        else if(current_id==18) {
            myMessage.setText("Sun");
            imageView.setImageResource(R.drawable.sun);
        }
        else if(current_id==19) {
            myMessage.setText("Tree");
            imageView.setImageResource(R.drawable.tree);
        }
        else if(current_id==20) {
            myMessage.setText("Umbrella");
            imageView.setImageResource(R.drawable.umbrella);
        }
        else if(current_id==21) {
            myMessage.setText("Van");
            imageView.setImageResource(R.drawable.van);
        }
        else if(current_id==22) {
            myMessage.setText("Whale");
            imageView.setImageResource(R.drawable.whale);
        }
        else if(current_id==23) {
            myMessage.setText("XRay");
            imageView.setImageResource(R.drawable.xray);
        }
        else if(current_id==24) {
            myMessage.setText("Yak");
            imageView.setImageResource(R.drawable.yak);
        }
        else if(current_id==25) {
            myMessage.setText("Zebra");
            imageView.setImageResource(R.drawable.zebra);
        }
    }
    public void toast(int id){
        LayoutInflater layoutInflater = getLayoutInflater();
        View myLayout=layoutInflater.inflate(R.layout.activity_view_toast,null);
        ImageView imageView=myLayout.findViewById(R.id.imageView);
        TextView myMessage= myLayout.findViewById(R.id.textView4);
        sendImage(id,imageView,myMessage);
        Toast myToast=new Toast(getApplicationContext());
        myToast.setDuration(Toast.LENGTH_LONG);
        myToast.setView(myLayout);
        myToast.setGravity(Gravity.CENTER, 0, 0);
        myToast.show();
    }

}