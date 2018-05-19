package com.apkglobal.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll;
        roll=  findViewById(R.id.roll);

        final ImageView dicethree= findViewById(R.id.dicethree);
        final ImageView dicefive=findViewById(R.id.dicefive);

        final int[] diceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","the button has been pressed");
                Random r=new Random();
                int randomNumber=r.nextInt(6);
                Log.d("Dicee","value is "+randomNumber);

                dicethree.setImageResource(diceArray[randomNumber]);
                randomNumber=r.nextInt(6);
                dicefive.setImageResource(diceArray[randomNumber]);
            }
        });
    }
}
