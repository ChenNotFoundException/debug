package com.example.zhaocan.chart4;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class XunLianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_xun_lian);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.hide();
        }

        Button button1=(Button)findViewById(R.id.Button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(XunLianActivity.this,"111",Toast.LENGTH_SHORT).show();
            }
        });
        Button button2=(Button)findViewById(R.id.Button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(XunLianActivity.this,"222",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
