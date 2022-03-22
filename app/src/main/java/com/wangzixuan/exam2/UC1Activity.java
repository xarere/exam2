package com.wangzixuan.exam2;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import static android.view.View.LAYOUT_DIRECTION_LTR;

public class UC1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc1);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        final LinearLayout parentView = new LinearLayout(this);
        parentView.setLayoutParams(lp);//设置布局参数
        parentView.setGravity(Gravity.CENTER);// 设置子View的Linearlayout// 为垂直方向布局

        parentView.setOrientation(LinearLayout.HORIZONTAL);// 设置子View的Linearlayout// 为垂直方向布局
        //定义子View中两个元素的布局
        ViewGroup.LayoutParams vlp = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        ViewGroup.LayoutParams vlp2 = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        Button btn1 = new Button(this);
        btn1.setLayoutParams(vlp);//设置TextView的布局
        btn1.setText("水平布局");
        Button btn2 = new Button(this);
        btn2.setLayoutParams(vlp);//设置TextView的布局
        btn2.setText("垂直布局");
        Button btn3 = new Button(this);
        btn3.setLayoutParams(vlp);//设置TextView的布局
        btn3.setText("靠左对齐");
        Button btn4 = new Button(this);
        btn4.setLayoutParams(vlp2);//设置TextView的布局
        btn4.setText("返回");
        parentView.addView(btn1);//btn1 添加到子View 中
        parentView.addView(btn2);//btn2 添加到子View 中
        parentView.addView(btn3);//btn3 添加到子View 中
        parentView.addView(btn4);//btn4 添加到子View 中
        setContentView(parentView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parentView.setOrientation(LinearLayout.HORIZONTAL);// 设置子View的Linearlayout 为水平方向布局

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parentView.setOrientation(LinearLayout.VERTICAL);// 设置子View的Linearlayout 为垂直方向布局

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parentView.setLayoutDirection(LAYOUT_DIRECTION_LTR);// 设置View的Linearlayout为靠左方向布局
                parentView.setGravity(Gravity.LEFT);// 设置子View的Linearlayout// 为垂直方向布局

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });
    }




}
