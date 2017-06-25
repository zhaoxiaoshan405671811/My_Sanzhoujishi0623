package com.example.my_bjuan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    private LinearLayout mLxr;
    private LinearLayout mLt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       TextView tv = (TextView) findViewById(R.id.textlt);
        mLxr = (LinearLayout) findViewById(R.id.line_lxr);
        mLt = (LinearLayout) findViewById(R.id.line_Lt);
        tv.setText("联系人");
        mLt.setVisibility(View.GONE);
        //mLxr.setVisibility(View.INVISIBLE);//显示

    }
}
