package com.example.activity2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn4;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn1=(Button)findViewById(R.id.btn1);
         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                 startActivity(intent);
             }
         });
        btn4=(Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        btn3=(Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent);
            }
        });


        btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent);
            }
        });

    }
}
