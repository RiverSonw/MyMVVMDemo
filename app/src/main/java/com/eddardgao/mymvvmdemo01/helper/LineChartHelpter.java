package com.eddardgao.mymvvmdemo01.helper;

import android.databinding.BindingAdapter;
import android.graphics.Color;

import com.eddardgao.mymvvmdemo01.bean.LineChartDataBean;
import com.eddardgao.mymvvmdemo01.linechartutils.CustomerValueFromatter;
import com.eddardgao.mymvvmdemo01.linechartutils.MyXValueFormatter;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.LineData;

import java.util.ArrayList;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/27
 * @describe ::
 * @Version ::
 */
public class LineChartHelpter {


    @BindingAdapter({"loadlinedata"})
    public static void linechartData(LineChart lineChart, LineChartDataBean dataBean){
        LineData data = dataBean.getyValue();
        ArrayList<String> xVals = dataBean.getxVals();

        data.setValueFormatter(new CustomerValueFromatter());
        data.setDrawValues(true);
        data.setValueTextColor(Color.BLACK);
        data.setValueTextSize(13);
        lineChart.setData(data);
        lineChart.animateXY(800, 800);
        lineChart.setVisibleXRangeMaximum(15);

        XAxis xAxis = lineChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);          //只在下方轴显示 X数据
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        //xAxis.setLabelCount(7);             //这是显示的个数
        xAxis.setValueFormatter(new MyXValueFormatter(xVals));


        lineChart.invalidate();             //绘制
    }

}
