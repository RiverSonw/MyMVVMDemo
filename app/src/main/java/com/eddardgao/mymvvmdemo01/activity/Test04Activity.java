package com.eddardgao.mymvvmdemo01.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.bean.LineChartDataBean;
import com.eddardgao.mymvvmdemo01.databinding.ActivityTest04Binding;
import com.eddardgao.mymvvmdemo01.linechartutils.MyMarkerView;
import com.eddardgao.mymvvmdemo01.linechartutils.MyYValueFormatter;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

/**
 *  对第三方控件MPChart 使用Databinding 的方法
 *
 *
 */
public class Test04Activity extends Activity {

    private LineChart lineChart;
    private Description description;
    int[] colors = new int[]{0xff0676bc, 0xffef1f19, 0xffff930f, 0xff22b100};     //颜色
    private ArrayList<String> xVals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTest04Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_test04);

        lineChart = findViewById(R.id.linechart_t04);

        //LineChart 初始化
        initLineChart();

        int num = 20;

        xVals = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            xVals.add("12-10");
        }

        ArrayList<Entry> yVals1 = new ArrayList<>();         //linchart能用barchart的数据格式填充数据吗？？
        ArrayList<Entry> yVals2 = new ArrayList<>();
        ArrayList<Entry> yVals3 = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            float val = (float) (Math.random() * num);     //设置随机数
            yVals1.add(new Entry(i, val));            //设置x,y 坐标
        }

        for (int i = 0; i < num; i++) {
            float val = (float) (Math.random() * num);     //设置随机数
            yVals2.add(new Entry(i, val));            //设置x,y 坐标
        }

        for (int i = 0; i < num; i++) {
            float val = (float) (Math.random() * num);     //设置随机数
            yVals3.add(new Entry(i, val));            //设置x,y 坐标
        }

        LineDataSet barset1 = new LineDataSet(yVals1, "一季度");
        //barset1.setColor(Color.rgb(240, 100, 100));
        barset1.setColor(colors[0]);

        LineDataSet barset2 = new LineDataSet(yVals2, "二季度");
        barset2.setColor(colors[1]);

        LineDataSet barset3 = new LineDataSet(yVals3, "三季度");
        barset3.setColor(colors[2]);

        ArrayList<ILineDataSet> dataSets = new ArrayList<ILineDataSet>();
        dataSets.add(barset1);
        dataSets.add(barset2);
        dataSets.add(barset3);

        LineData data = new LineData(dataSets);

        LineChartDataBean dataBean = new LineChartDataBean(data,xVals);
        binding.setLinedata(dataBean);

    }

    /**
     * 对LineChart 进行初始化操作
     */
    private void initLineChart() {
        description = new Description();
        description.setText("");
        description.setTextAlign(Paint.Align.CENTER);
        description.setTextColor(Color.RED);
        description.setTextSize(10f);

        lineChart.setDescription(description);       // 设置图表描述
        lineChart.setNoDataText("加载数据失败，请重试");
        lineChart.setClipValuesToContent(true);     //设置描述文字不能溢出
        lineChart.setDragEnabled(false);     //图表是否可以拖动
        lineChart.setTouchEnabled(false);
        lineChart.setScaleEnabled(false);


        //lineChart.setExtraLeftOffset(-4f);
        //lineChart.setExtraTopOffset(float);
        //lineChart.setExtraRightOffset(4f);
        //lineChart.setExtraBottomOffset(float);

        //lineChart.setExtraOffsets(0, 0,0, 0);//此种方法可以一次设置上下左右偏移量。根据自己数据哪个地方显示不全，对应调用方法。

        lineChart.setPinchZoom(true);       //设置x轴，y轴可以用两根手指同时缩放，如果设置为假 ，则单独缩放
        lineChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);

        MyMarkerView mv = new MyMarkerView(this, R.layout.markerview);

        // define an offset to change the original position of the marker
        // (optional)
        // mv.setOffsets(-mv.getMeasuredWidth() / 2, -mv.getMeasuredHeight());

        // set the marker to the chart
        lineChart.setMarker(mv);

        Legend le = lineChart.getLegend();
        le.setTextSize(10f);
        le.setFormSize(10f);
        le.setForm(Legend.LegendForm.CIRCLE);
        le.setWordWrapEnabled(true);

        XAxis xl = lineChart.getXAxis();        //设置x轴
        xl.setLabelRotationAngle(-20);
        YAxis yl = lineChart.getAxisLeft();     //设置Y轴
        yl.setValueFormatter(new MyYValueFormatter());

        yl.setDrawGridLines(true);     //是否画线？
        yl.setSpaceTop(30f);
        yl.setAxisMinimum(0f);
        lineChart.getAxisRight().setEnabled(false);     //设置右轴为空

    }

}
