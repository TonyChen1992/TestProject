package com.osen.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    //输入内容的EditText
    private EditText editText;
    //点击显示的按钮
    private Button btnShow;
    //显示内容的TextView
    private TextView tvContent;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化视图
        initView();
        //设置事件监听
        setListener();
    }

    /**
     * 设置事件监听
     */
    private void setListener() {
        btnShow.setOnClickListener(this);
    }

    /**
     * 初始化视图
     */
    private void initView() {
        editText= (EditText) findViewById(R.id.et1);
        btnShow= (Button) findViewById(R.id.btnShow);
        tvContent= (TextView) findViewById(R.id.tvContent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnShow:
//                Toast.makeText(this,"我点击了按钮",Toast.LENGTH_SHORT).show();
//                Log.i("main","我点击了按钮");
//                Log.e("error","我点击了按钮");
                //获取文本框输入框内容
                str=editText.getText().toString().trim();
                //显示到TextView
                if (str.equals("")||str==""){
                    tvContent.setText("需要填写内容");
                }else{
                    tvContent.setText("这是我刚才输入的内容："+str+"!!!");
                }
                //跳转页面
                Intent intent=new Intent(this,SecondActivity.class);
                intent.putExtra("str",str);
                startActivity(intent);
//                //关闭当前页面
//                finish();
//                Intent intent=new Intent();
//                intent.setAction(Intent.ACTION_CALL);
//                intent.setData(Uri.parse("tel:112"));
//                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
