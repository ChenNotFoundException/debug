package com.example.cc.myapplication;

import android.app.Activity;

import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.zhaocan.chart4.JieMianActivity;
import com.lljjcoder.city_20170724.CityPickerView;
import com.lljjcoder.city_20170724.bean.CityBean;
import com.lljjcoder.city_20170724.bean.DistrictBean;
import com.lljjcoder.city_20170724.bean.ProvinceBean;
import com.lljjcoder.citylist.CityListSelectActivity;
import com.lljjcoder.citylist.bean.CityInfoBean;


/**
 * Created by CC on 2017/10/30.
 */

public class Personal extends Activity implements View.OnClickListener {

    TextView tv_resultWheel;
    ImageView imageView;
    Button ok;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.
                FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.personal);

        Button goWheel = (Button) findViewById(R.id.goWheel);
        tv_resultWheel = (TextView) findViewById(R.id.tv_resultWheel);
        imageView = (ImageView)findViewById(R.id.imageView);
        ok = (Button)findViewById(R.id.button4);

        ok.setOnClickListener(this);

        goWheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CityPickerView cityPicker = new CityPickerView.Builder(Personal.this).textSize(20)
                        .titleTextColor("#000000")
                        .backgroundPop(0xa0000000)
                        .province("江苏省")
                        .city("南京市")
                        .district("秦淮区")
                        .textColor(Color.parseColor("#000000"))
                        .provinceCyclic(true)
                        .cityCyclic(false)
                        .districtCyclic(false)
                        .visibleItemsCount(7)
                        .itemPadding(10)
                        .build();
                cityPicker.show();
                cityPicker.setOnCityItemClickListener(new CityPickerView.OnCityItemClickListener() {
                    @Override
                    public void onSelected(ProvinceBean province, CityBean city, DistrictBean district) {
                        //返回结果
                        tv_resultWheel.setText(
                                 province.getName() + "  " + city.getName() + "市 " + district.getName());
                        tv_resultWheel.setTextSize(20);
                    }

                    @Override
                    public void onCancel() {

                    }
                });
            }
        });
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Personal.this, JieMianActivity.class);
        startActivity(intent);
        finish();
    }
}