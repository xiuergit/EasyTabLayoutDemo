package com.bigdata.easytablayoutdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bigdata.easytablayout.View.EasyTabLayout;

public class MainActivity extends AppCompatActivity {

  EasyTabLayout  easyTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        easyTabLayout=(EasyTabLayout)findViewById(R.id.easy);
        easyTabLayout.setStyle(EasyTabLayout.INDICATOR);
        easyTabLayout.setData(DataToolTest.titles(),DataToolTest.fragments(DataToolTest.titles().size()));
    }

    public  void  normal(View v){
        easyTabLayout.setStyle(EasyTabLayout.NORMAL);
    }
    public  void  indicator(View v){
        easyTabLayout.setStyle(EasyTabLayout.INDICATOR);
    }

    public  void light(View v){
        easyTabLayout.setStyle(EasyTabLayout.LIGHT);

    }
}
