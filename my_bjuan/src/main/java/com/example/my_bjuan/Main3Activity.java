package com.example.my_bjuan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView mLxr;
    private LinearLayout mLxf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();

    }

    private void initView() {
        mLxf = (LinearLayout) findViewById(R.id.line_lxr);
        mLxr = (TextView) findViewById(R.id.lianxiren);
        mLxf.setVisibility(View.GONE);
        mLxr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent);
              /*  FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().add(new MyliaotianFragment(),"liantian").commit();
*/

            }
        });

    }
}
