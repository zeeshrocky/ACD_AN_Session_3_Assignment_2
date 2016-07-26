package com.example.admin.vibgyor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    LinearLayout v, i, b, g, y, o, r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v=(LinearLayout)findViewById(R.id.v_layout);
        i=(LinearLayout)findViewById(R.id.i_layout);
        b=(LinearLayout)findViewById(R.id.b_layout);
        g=(LinearLayout)findViewById(R.id.g_layout);
        y=(LinearLayout)findViewById(R.id.y_layout);
        o=(LinearLayout)findViewById(R.id.o_layout);
        r=(LinearLayout)findViewById(R.id.r_layout);

        v.setOnClickListener(this);
        i.setOnClickListener(this);
        b.setOnClickListener(this);
        g.setOnClickListener(this);
        y.setOnClickListener(this);
        o.setOnClickListener(this);
        r.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.v_layout:
                Toast.makeText(MainActivity.this, "This is violet", Toast.LENGTH_SHORT).show();
                Log.i("Colour", "violet");
                break;
            case R.id.i_layout:
                Toast.makeText(MainActivity.this, "This is indigo", Toast.LENGTH_SHORT).show();
                Log.i("Colour", "indigo");
                break;
            case R.id.b_layout:
                Toast.makeText(MainActivity.this, "This is blue", Toast.LENGTH_SHORT).show();
                Log.i("Colour", "blue");
                break;
            case R.id.g_layout:
                Toast.makeText(MainActivity.this, "This is green", Toast.LENGTH_SHORT).show();
                Log.i("Colour", "green");
                break;
            case R.id.y_layout:
                Toast.makeText(MainActivity.this, "This is yellow", Toast.LENGTH_SHORT).show();
                Log.i("Colour", "yellow");
                break;
            case R.id.o_layout:
                Toast.makeText(MainActivity.this, "This is orange", Toast.LENGTH_SHORT).show();
                Log.i("Colour", "orange");
                break;
            case R.id.r_layout:
                Toast.makeText(MainActivity.this, "This is red", Toast.LENGTH_SHORT).show();
                Log.i("Colour", "red");
                break;
        }
    }
}