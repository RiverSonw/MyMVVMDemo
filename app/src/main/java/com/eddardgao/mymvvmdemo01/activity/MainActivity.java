package com.eddardgao.mymvvmdemo01.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.databinding.ActivityMainBinding;
import com.eddardgao.mymvvmdemo01.handler.OnMainClickHandler;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.setHandler(new OnMainClickHandler());


    }



}
