package com.example.my_bjuan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTv;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                   mTv.setText("欢迎来到八维学院");
                    break;
                case 1:
                    mTv.setText("我在学习Andrioid");
                    break;
                case 2:
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();

    }

    private void initview() {
        mTv = (TextView) findViewById(R.id.text_qidong);
        handler.sendEmptyMessage(0);
        handler.sendEmptyMessageDelayed(1,2000);
        handler.sendEmptyMessageDelayed(2,2000);
    }
}
