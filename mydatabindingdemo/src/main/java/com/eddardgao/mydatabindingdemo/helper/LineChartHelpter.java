package com.eddardgao.mydatabindingdemo.helper;

import android.databinding.BindingAdapter;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.LineData;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/27
 * @describe ::
 * @Version ::
 */
public class LineChartHelpter {


    @BindingAdapter({"xVals","yValus"})
    public static void linechartData(LineChart lineChart, XAxis xAxis , LineData data){

    }

}
