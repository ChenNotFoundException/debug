package com.example.zhaocan.chart4;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Pay_UI extends AppCompatActivity {
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay__ui);

        Button button = (Button) findViewById(R.id.weixin);
        Button button2 = (Button) findViewById(R.id.zhifubao);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.hide();
        }
        TextView renshu=(TextView)findViewById(R.id.renshu);
        renshu.setText(String.valueOf(num));
    }
}
