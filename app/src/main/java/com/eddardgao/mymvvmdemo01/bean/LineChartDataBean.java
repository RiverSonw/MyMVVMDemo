package com.eddardgao.mymvvmdemo01.bean;

import com.github.mikephil.charting.data.LineData;

import java.util.ArrayList;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/27
 * @describe ::
 * @Version ::
 */
public class LineChartDataBean {

    private LineData yValue ;

    private ArrayList<String> xVals;

    public LineChartDataBean(LineData yValue,ArrayList<String> xVals){
        this.yValue = yValue;
        this.xVals = xVals;

    }


    public LineData getyValue() {
        return yValue;
    }

    public void setyValue(LineData yValue) {
        this.yValue = yValue;
    }

    public ArrayList<String> getxVals() {
        return xVals;
    }

    public void setxVals(ArrayList<String> xVals) {
        this.xVals = xVals;
    }


}
