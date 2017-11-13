package com.example.cc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhaocan.chart4.JieMianActivity;

/**
 * Created by CC on 2017/10/27.
 * 登录界面
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.
                FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login);

       initView();
    }

    private TextView login_text;
    private TextView reg_text;
    private TextView shoujihao;
    private TextView mima;
    private TextView forget;
    private Button loginButton;
    private ImageButton Wechat;
    private ImageButton QQ;

    private void initView() {
        login_text = (TextView)findViewById(R.id.denglu);
        reg_text = (TextView)findViewById(R.id.zhuce);
        shoujihao = (TextView)findViewById(R.id.shoujihao);
        mima = (TextView)findViewById(R.id.mima);
        forget = (TextView)findViewById(R.id.forget);
        loginButton = (Button)findViewById(R.id.loginButton);
        Wechat = (ImageButton)findViewById(R.id.imageButtonWechat);
        QQ = (ImageButton)findViewById(R.id.imageButtonQQ);

        login_text.setOnClickListener(this);
        reg_text.setOnClickListener(this);
        forget.setOnClickListener(this);
        loginButton.setOnClickListener(this);
        Wechat.setOnClickListener(this);
        QQ.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.denglu:
                Toast.makeText(LoginActivity.this,"登录界面",Toast.LENGTH_SHORT).show();
                break;
            case R.id.zhuce:
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
             //   finish();
                break;
            case R.id.forget:
                Toast.makeText(LoginActivity.this,"忘记密码",Toast.LENGTH_SHORT).show();
                break;
            case R.id.loginButton:
               // Toast.makeText(LoginActivity.this,"登录中",Toast.LENGTH_SHORT).show();
                Intent zhuye = new Intent(LoginActivity.this, JieMianActivity.class);
                startActivity(zhuye);
                break;
            case R.id.imageButtonWechat:
                Toast.makeText(LoginActivity.this,"微信登录",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButtonQQ:
                Toast.makeText(LoginActivity.this,"QQ登录",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    }


