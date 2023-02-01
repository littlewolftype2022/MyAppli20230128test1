package com.example.myappli20230128test1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button go1,sign;
    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        go1 = (Button) findViewById(R.id.btn_GO1);
        go1.setOnClickListener(this);
        sign = (Button) findViewById(R.id.sign);
        sign.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        /*
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        startActivity(intent);

         */

        switch (v.getId()) {
            case R.id.btn_GO1:
                Intent intent = new Intent();
                intent.setAction("ac2new");
                startActivity(intent);
            case R.id.sign:
                Intent intent2 = new Intent();
                intent2.setAction("ac3new");
                startActivity(intent2);
        }
    }


}
