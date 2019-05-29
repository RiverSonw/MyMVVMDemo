package com.eddardgao.mydatabindingdemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.eddardgao.mydatabindingdemo.R;
import com.eddardgao.mydatabindingdemo.databinding.ActivityMainBinding;
import com.eddardgao.mydatabindingdemo.handler.OnClickHandler;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        binding.setClicklistener(this);
        binding.setHandler(new OnClickHandler());
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.bt_test01:
                Toast.makeText(MainActivity.this, "触发了Button1的点击事件", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, Test01Activity.class);
                startActivity(intent);
                break;
            case R.id.bt_test03:
                intent = new Intent(MainActivity.this,Test03Activity.class);
                startActivity(intent);
                break;
            case R.id.bt_test04:
                //intent = new Intent(MainActivity.this,Test04Activity.class);
                //startActivity(intent);
                break;
            case R.id.bt_test05:
                intent = new Intent(MainActivity.this,Test05Activity.class);
                startActivity(intent);
                break;
        }
    }



}
