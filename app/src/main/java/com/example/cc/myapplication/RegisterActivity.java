package com.example.cc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by CC on 2017/10/27.
 */

public class RegisterActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.
                FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.register);
        init();
    }

    private TextView login;
    private Button sendcode;
    private Button next;
    private MyCount mc;


    private void init() {
        login = (TextView)findViewById(R.id.denglu);
        sendcode = (Button)findViewById(R.id.sendcode);
        next = (Button)findViewById(R.id.next);

        mc = new MyCount(60000,1000);

        sendcode.setOnClickListener(this);
        login.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.denglu:
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
              //  finish();
                break;

            case R.id.sendcode:
                Toast.makeText(RegisterActivity.this,"已发送！",Toast.LENGTH_SHORT);
                mc.start();
                break;

            case R.id.next:
                Intent intent1 = new Intent(RegisterActivity.this,Setcode.class);
                startActivity(intent1);
                finish();
                break;
    }
}

    class MyCount extends CountDownTimer{
        public MyCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            long second = millisUntilFinished/1000;
            sendcode.setText(second + "秒后可以重新获取验证码");


        }

        @Override
        public void onFinish() {
            sendcode.setText("获取验证码");
        }
    }


}
