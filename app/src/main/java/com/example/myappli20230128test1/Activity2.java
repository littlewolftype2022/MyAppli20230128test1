package com.example.myappli20230128test1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {


    public SeekBar skb;
    public TextView tvmsb;
    public DatePicker datapicker;

    public TimePicker timepicker;

    public Spinner spinner2;
    public ArrayAdapter<String> adapter;
    //@SuppressLint("MissingInflatedId")
    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        tvmsb = (TextView) findViewById(R.id.tv_msb);

        skb = (SeekBar) findViewById(R.id.my_seek_bar);
        skb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvmsb.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        datapicker = (DatePicker) findViewById(R.id.my_data_picker);
        datapicker.getYear();
        datapicker.getMonth();
        datapicker.getDayOfMonth();

        timepicker = (TimePicker) findViewById(R.id.my_timepicker);
        timepicker.getHour();//为啥小时数目么得反应？
        timepicker.getMinute();

        spinner2 = (Spinner) findViewById(R.id.my_spinner2);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,android.R.id.text1,
                new String[]{"第一","第二","第三"});
        spinner2.setAdapter(adapter);//Spinner:似乎没有办法在一个布局内用2个spinner。加grade方法后报错。


    }
}
