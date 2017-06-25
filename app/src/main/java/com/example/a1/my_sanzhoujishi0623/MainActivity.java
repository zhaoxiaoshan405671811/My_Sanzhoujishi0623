package com.example.a1.my_sanzhoujishi0623;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView mLv;
    private List<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化数据
        initdata();
        //初始化控件
        initview();
        //监听事件
        setListener();
    }

    private void setListener() {
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("cityname",list.get(position));
                startActivity(intent);
            }
        });
    }

    private void initdata() {
        for (int i = 0;i<20;i++) {
            list.add("上海"+i);
        }
    }
    private void initview() {
        mLv = (ListView) findViewById(R.id.listview);
        mLv.setAdapter(new MyAdapter(MainActivity.this,list));
    }


}
