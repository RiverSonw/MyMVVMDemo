package com.eddardgao.mymvvmdemo01.linechartutils;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.text.DecimalFormat;

/**
 * @author RiverSonw
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author
 * @updateDes ${TODO}
 **/
public class MyYValueFormatter  implements IAxisValueFormatter {
    private DecimalFormat format;

    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        return format.format(value);
    }


    public MyYValueFormatter(){
        format= new DecimalFormat("###,###,###,##0");
        //format= new DecimalFormat("###,##0");
    }
}
