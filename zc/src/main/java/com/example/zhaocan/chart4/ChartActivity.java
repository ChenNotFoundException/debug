package com.example.zhaocan.chart4;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;

import java.util.ArrayList;
import java.util.List;

public class ChartActivity extends AppCompatActivity {
    private DynamicLineChartManager dynamicLineChartManager;
    private List<Integer> list = new ArrayList<>(); //数据集合
    private List<String> names = new ArrayList<>(); //折线名字集合
    private List<Integer> colour = new ArrayList<>();//折线颜色集合

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionbar=getSupportActionBar();
        if(actionbar!=null){
            actionbar.hide();
        }
        setContentView(R.layout.activity_dynamic_linechart);


        LineChart mChart = (LineChart) findViewById(R.id.dynamic_chart);
        //折线名字
        names.add("专注");
        names.add("放松" );

        //折线颜色
        colour.add(Color.CYAN);
        colour.add(Color.GREEN);

        dynamicLineChartManager = new DynamicLineChartManager(mChart, names, colour);


        dynamicLineChartManager.setYAxis(100, 0, 10);
        dynamicLineChartManager.setDescription("time");

        //死循环添加数据
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {



                            list.add((int) (Math.random() * 50) + 10);
                            list.add((int) (Math.random() * 80) + 10);
                            list.add((int) (Math.random() * 100));
                            dynamicLineChartManager.addEntry(list);


                            list.clear();
                        }
                    });
                }
            }
        }).start();
    }

}