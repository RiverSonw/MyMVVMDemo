package com.eddardgao.mymvvmdemo01.linechartutils;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.text.DecimalFormat;

/**
 * @author RiverSonw
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author
 * @updateDes ${TODO}
 **/
public class CustomerValueFromatter  implements IValueFormatter {
    private DecimalFormat format;

    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
        return format.format(value);
    }


    public CustomerValueFromatter(){
        format = new DecimalFormat("###,###,###,##0");
    }


}
