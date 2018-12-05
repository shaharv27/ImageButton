package com.example.shahar.anew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
TextView Tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        Tv1 = (TextView) findViewById(R.id.Tv1);



    }
    public void btn1 (View view) {
        Random rnd = new Random();
        int x=rnd.nextInt();
        Tv1.setText("number:  " + x);

    }
    public void btn2 (View view) {
        Tv1.setText("Nothing");
    }
}
