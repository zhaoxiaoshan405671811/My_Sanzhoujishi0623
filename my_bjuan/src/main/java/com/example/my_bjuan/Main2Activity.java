package com.example.my_bjuan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private EditText mUsername;
    private EditText mPassword;
    private Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initview();//初始化控件
        setListener();
    }

    private void setListener() {
        //即限定最大输入字符数为10
       // mPassword.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //用getBytes截取数字区间
                if(6<=mUsername.getText().toString().getBytes().length&& mUsername.getText().toString().getBytes().length<=10&&
                        6<=mPassword.getText().toString().getBytes().length&&mPassword.getText().toString().getBytes().length<=10){
                    Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(Main2Activity.this,"用户或密码为空 或者用户 密码长度不在6-10之间",Toast.LENGTH_LONG).show();
                }
           /*     int length = mPassword.getText().toString().length();
                if(!TextUtils.isEmpty(mUsername.getText().toString().trim())&&!TextUtils.isEmpty(mPassword.getText().toString().trim())){
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }else if(TextUtils.isEmpty(mUsername.getText().toString().trim())){
                Toast.makeText(Main2Activity.this,"username 请填写用户名",Toast.LENGTH_LONG).show();
            }else if(TextUtils.isEmpty(mPassword.getText().toString().trim())){
                Toast.makeText(Main2Activity.this,"password 密码不能为空",Toast.LENGTH_LONG).show();
            }else if(length>6&&length<10){
                Toast.makeText(Main2Activity.this,"密码长度在6-10之间",Toast.LENGTH_LONG).show();
            }*/
        }
        });
    }

    private void initview() {
        mUsername = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);
        mLogin = (Button)findViewById(R.id.login);

    }
}
