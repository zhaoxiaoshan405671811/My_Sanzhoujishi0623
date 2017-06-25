package com.example.a1.my_sanzhoujishi0623;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private TextView mTv;
    private List<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //初始化事件
        initview();
    }

    private void initview() {
        mTv = (TextView) findViewById(R.id.textname);
        mTv.setText(getIntent().getStringExtra("cityname"));
    }
}
