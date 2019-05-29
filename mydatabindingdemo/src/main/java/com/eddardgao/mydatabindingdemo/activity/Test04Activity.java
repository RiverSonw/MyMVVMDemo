package com.eddardgao.mydatabindingdemo.activity;

import android.app.Activity;
import android.os.Bundle;

import com.eddardgao.mydatabindingdemo.R;

public class Test04Activity extends Activity {

    int[] colors = new int[]{0xff0676bc, 0xffef1f19, 0xffff930f, 0xff22b100};     //颜色


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test04);



    }


}
