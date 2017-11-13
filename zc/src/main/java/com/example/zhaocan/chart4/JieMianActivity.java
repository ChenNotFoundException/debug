package com.example.zhaocan.chart4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import evan.wang.WoActivity;

public class JieMianActivity extends AppCompatActivity implements Button.OnClickListener,ViewPager.OnPageChangeListener{
    private Button button;
    private int day;
    private  int a;



    // 底部菜单4个Linearlayout
    private LinearLayout zhuye;
    private LinearLayout tiaozhan;
    private LinearLayout bisai;
    private LinearLayout kecheng;
    private LinearLayout wo;

    // 底部菜单4个ImageView
    private ImageView iv_zhuye;
    private ImageView iv_tiaozhan;
    private ImageView iv_bisai;
    private ImageView iv_kecheng;
    private ImageView iv_wo;

    // 底部菜单4个菜单标题
    private TextView tv_zhuye;
    private TextView tv_tiaozhan;
    private TextView tv_bisai;
    private TextView tv_kecheng;
    private TextView tv_wo;
    // 中间内容区域
    private NoScrollViewPager viewPager;
    private ViewPager viewPager1;

    // ViewPager适配器ContentAdapter
    private ContentAdapter adapter;

    private List<View> views;
    private TextView title;
    String[] titles = new String[]{"主页","挑战","比赛","课程","我" };






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_text);
        // 初始化控件
        initView();
        // 初始化底部按钮事件
        initEvent();

        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.hide();
        }

    }


    private void initEvent() {
        // 设置按钮监听
        zhuye.setOnClickListener(this);
        tiaozhan.setOnClickListener(this);
        bisai.setOnClickListener(this);
        kecheng.setOnClickListener(this);
        wo.setOnClickListener(this);


        //设置ViewPager滑动监听
        viewPager.setOnPageChangeListener(this);
    }


    private void initView() {

        // 底部菜单4个Linearlayout
        title = (TextView) findViewById(R.id.title);
        this.zhuye = (LinearLayout) findViewById(R.id.zhuye);
        this.tiaozhan = (LinearLayout) findViewById(R.id.tiaozhan);
        this.bisai = (LinearLayout) findViewById(R.id.bisai);
        this.kecheng = (LinearLayout) findViewById(R.id.kecheng);
        this.wo = (LinearLayout) findViewById(R.id.wo);

        // 底部菜单4个ImageView
        this.iv_zhuye = (ImageView) findViewById(R.id.iv_zhuye);
        this.iv_tiaozhan = (ImageView) findViewById(R.id.iv_tiaozhan);
        this.iv_bisai = (ImageView) findViewById(R.id.iv_bisai);
        this.iv_kecheng = (ImageView) findViewById(R.id.iv_kecheng);
        this.iv_wo = (ImageView) findViewById(R.id.iv_wo);

        // 底部菜单4个菜单标题
        this.tv_zhuye = (TextView) findViewById(R.id.tv_zhuye);
        this.tv_tiaozhan = (TextView) findViewById(R.id.tv_tiaozhan);
        this.tv_bisai = (TextView) findViewById(R.id.tv_bisai);
        this.tv_kecheng = (TextView) findViewById(R.id.tv_kecheng);
        this.tv_wo = (TextView) findViewById(R.id.tv_wo);

        // 中间内容区域ViewPager

        this.viewPager = (NoScrollViewPager) findViewById(R.id.vp_content);
        viewPager.setNoScroll(true);

        // 适配器
        View page_01 = View.inflate(JieMianActivity.this, R.layout.page_01, null);
        View page_02 = View.inflate(JieMianActivity.this, R.layout.page_02, null);
        View page_03 = View.inflate(JieMianActivity.this, R.layout.page_03, null);
        View page_04 = View.inflate(JieMianActivity.this, R.layout.page_04, null);
        View page_05 = View.inflate(JieMianActivity.this, R.layout.page_05, null);

        TextView lblTitle=(TextView)page_04.findViewById(R.id.lblTitle);
        lblTitle.setText(String.valueOf(day));
        final int yue=Day. getInstance().getName();
        Button button4=(Button)page_01.findViewById(R.id.Button_1) ;
        Button button5=(Button)page_01.findViewById(R.id.Button_2) ;
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(JieMianActivity.this,JianCeActivity.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(JieMianActivity.this,XunLianActivity.class);
                startActivity(intent);
            }
        });
        ImageView iv1=(ImageView)page_04.findViewById(R.id.iv1);
        ImageView iv2=(ImageView)page_04.findViewById(R.id.iv2);
        ImageView iv3=(ImageView)page_04.findViewById(R.id.iv3);
        ImageView iv4=(ImageView)page_04.findViewById(R.id.iv4);
        ImageView iv5=(ImageView)page_04.findViewById(R.id.iv5);
        ImageView iv6=(ImageView)page_04.findViewById(R.id.iv6);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JieMianActivity.this,"111",Toast.LENGTH_SHORT).show();
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JieMianActivity.this,"222",Toast.LENGTH_SHORT).show();
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JieMianActivity.this,"333",Toast.LENGTH_SHORT).show();
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JieMianActivity.this,"444",Toast.LENGTH_SHORT).show();
            }
        });
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JieMianActivity.this,"555",Toast.LENGTH_SHORT).show();
            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(JieMianActivity.this,"666",Toast.LENGTH_SHORT).show();
            }
        });





        Button button=(Button)page_04.findViewById(R.id.Button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                day++;
                TextView lblTitle=(TextView)findViewById(R.id.lblTitle);
                lblTitle.setText(String.valueOf(day));
            }
        });
        Button button3=(Button)page_05.findViewById(R.id.button2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(JieMianActivity.this,Pay_UI.class);
                startActivity(intent);
            }
        });


        views = new ArrayList<View>();
        views.add(page_01);
        views.add(page_02);
        views.add(page_03);
        views.add(page_04);
        views.add(page_05);

        this.adapter = new ContentAdapter(views);
        viewPager.setAdapter(adapter);

    }
    @Override
    public void onClick(View v) {
        // 在每次点击后将所有的底部按钮(ImageView,TextView)颜色改为灰色，然后根据点击着色


            restartBotton();

            // ImageView和TetxView置为绿色，页面随之跳转
            int i = v.getId();
            if (i == R.id.zhuye) {
                iv_zhuye.setImageResource(R.drawable.star1);
                tv_zhuye.setTextColor(0xff1B940A);
                viewPager.setCurrentItem(0);

            } else if (i == R.id.tiaozhan) {
                iv_tiaozhan.setImageResource(R.drawable.star1);
                tv_tiaozhan.setTextColor(0xff1B940A);
                viewPager.setCurrentItem(1);

            } else if (i == R.id.bisai) {
                iv_bisai.setImageResource(R.drawable.star1);
                tv_bisai.setTextColor(0xff1B940A);
                viewPager.setCurrentItem(2);

            } else if (i == R.id.kecheng) {
                iv_kecheng.setImageResource(R.drawable.star1);
                tv_kecheng.setTextColor(0xff1B940A);
                viewPager.setCurrentItem(3);

            } else if (i == R.id.wo) {
                iv_wo.setImageResource(R.drawable.star1);
                tv_wo.setTextColor(0xff1B940A);
               // viewPager.setCurrentItem(4);
                Intent intent = new Intent(JieMianActivity.this,WoActivity.class);
                startActivity(intent);

            }

    }
    private void restartBotton() {
        // ImageView置为灰色
        iv_zhuye.setImageResource(R.drawable.star);
        iv_tiaozhan.setImageResource(R.drawable.star);
        iv_bisai.setImageResource(R.drawable.star);
        iv_kecheng.setImageResource(R.drawable.star);
        iv_wo.setImageResource(R.drawable.star);
        // TextView置为白色
        tv_zhuye.setTextColor(0xFF000000);
        tv_tiaozhan.setTextColor(0xFF000000);
        tv_bisai.setTextColor(0xFF000000);
        tv_kecheng.setTextColor(0xFF000000);
        tv_wo.setTextColor(0xFF000000);
    }

    @Override
    public void onPageScrollStateChanged(int arg0) {

    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {

    }

    @Override
    public void onPageSelected(int arg0) {
        restartBotton();
        title.setText(titles[arg0]);
        //当前view被选择的时候,改变底部菜单图片，文字颜色
        switch (arg0) {
            case 0:
                iv_zhuye.setImageResource(R.drawable.star1);
                tv_zhuye.setTextColor(0xff1B940A);
                break;
            case 1:
                iv_tiaozhan.setImageResource(R.drawable.star1);
                tv_tiaozhan.setTextColor(0xff1B940A);
                break;
            case 2:
                iv_bisai.setImageResource(R.drawable.star1);
                tv_bisai.setTextColor(0xff1B940A);
                break;
            case 3:
                iv_kecheng.setImageResource(R.drawable.star1);
                tv_kecheng.setTextColor(0xff1B940A);
                break;
            case 4:
                iv_wo.setImageResource(R.drawable.star1);
                tv_wo.setTextColor(0xff1B940A);
                break;

            default:
                break;
        }

    }



}






