package com.example.myappli20230128test1;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class AC3 extends AppCompatActivity {
    public ListView mylv;
    public Button bt3_1;
    String[] strings = {
            "test text1",
            "test text2",
            "test text3",
            "to ac5",
            "jump to old one~",
            "jump to new one!",
    };
    public ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac3);
        mylv = (ListView) findViewById(R.id.mylistview);
        adapter = new ArrayAdapter<String>(this,android.R.layout.activity_list_item,
                android.R.id.text1,strings);
        mylv.setAdapter(adapter);
        mylv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (strings[4].equals("jump to old one~"))
                {
                    Intent intent1 = new Intent(AC3.this,Activity2.class);
                    startActivity(intent1);
                    /*
                    Intent intent = new Intent();
                    intent.setAction("ac2new");
                    startActivity(intent);

                     */
                }
                else if (strings[5].equals("jump to new one!"))
                {
                    Intent intent2 = new Intent(AC3.this,AC4.class);
                    startActivity(intent2);
                    /*
                    Intent intent = new Intent();
                    intent.setAction("ac4new");
                    startActivity(intent);

                     */
                }
                else if (strings[3].equals("to ac5"))
                {
                    Intent intent3 = new Intent(AC3.this,AC5.class);
                    startActivity(intent3);
                    /*
                    Intent intent = new Intent();
                    intent.setAction("ac4new");
                    startActivity(intent);

                     */
                }
            }
        });

        //=======================================================
        bt3_1 = (Button) findViewById(R.id.bt3_1);
        bt3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AC3.this, "3's button click!", Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        //super.onKeyDown(keyCode,event);这一句控制是否继承父类，
        // 继承后点击退出，就会退出，和上一级有关
        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:
                Toast.makeText(this,"点击了后退",Toast.LENGTH_LONG).show();
                //return true;
                break;

            case KeyEvent.KEYCODE_HOME:
                Toast.makeText(this,"点击了home",Toast.LENGTH_LONG).show();
                //return true;
                break;

            case KeyEvent.KEYCODE_CALL:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.A6");
                startActivity(intent);
                return true;

            case KeyEvent.KEYCODE_VOLUME_DOWN:
                Toast.makeText(this,"VD",Toast.LENGTH_LONG).show();
                //return true;
                //break;
                return false;

            case KeyEvent.KEYCODE_VOLUME_UP:
                Toast.makeText(this,"Volume up!",Toast.LENGTH_LONG).show();
                //return true;
                break;

            case KeyEvent.KEYCODE_0:
                Toast.makeText(this,"press 0",Toast.LENGTH_LONG).show();
                break;

            case KeyEvent.KEYCODE_1:
                Toast.makeText(this,"press 1",Toast.LENGTH_LONG).show();
                break;

            case KeyEvent.KEYCODE_2:
                Toast.makeText(this,"press 2",Toast.LENGTH_LONG).show();
                break;

            case KeyEvent.KEYCODE_3:
                Toast.makeText(this,"press 3",Toast.LENGTH_LONG).show();
                break;

            case KeyEvent.KEYCODE_4:
                Toast.makeText(this,"press 4",Toast.LENGTH_LONG).show();
                break;

            case KeyEvent.KEYCODE_5:
                Toast.makeText(this,"press 5",Toast.LENGTH_LONG).show();
                break;

            case KeyEvent.KEYCODE_6:
                Toast.makeText(this,"press 6",Toast.LENGTH_LONG).show();
                break;

            case KeyEvent.KEYCODE_7:
                Toast.makeText(this,"press 7",Toast.LENGTH_LONG).show();
                break;

            case KeyEvent.KEYCODE_8:
                Toast.makeText(this,"press 8",Toast.LENGTH_LONG).show();
                break;

            case KeyEvent.KEYCODE_9:
                Toast.makeText(this,"press 9",Toast.LENGTH_LONG).show();
                break;
        }

        /*
        if(keyCode == KeyEvent.KEYCODE_BACK){
            Toast.makeText(this,"点击了后退",Toast.LENGTH_LONG).show();
            return true;
        }
        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            Toast.makeText(this,"Volume up!",Toast.LENGTH_LONG).show();
            return true;
        }
        if (keyCode == KeyEvent.KEYCODE_4){
            Toast.makeText(this,"press 4",Toast.LENGTH_LONG).show();
            return true;
        }


         */
        return super.onKeyDown(keyCode,event);//返回这个可以展示全部toast内容？必须有，super视之前有无super确定。

    }
}
