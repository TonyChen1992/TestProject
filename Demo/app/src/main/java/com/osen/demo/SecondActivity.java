package com.osen.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {

    private TextView tvSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //初始化视图
        initView();
        //设置事件监听
        setListener();
    }

    /**
     * 设置事件监听
     */
    private void setListener() {

    }

    /**
     * 初始化视图
     */
    private void initView() {
        tvSecond= (TextView) findViewById(R.id.tvSecond);
        String str=getIntent().getStringExtra("str");
        tvSecond.setText(str);
    }


}
