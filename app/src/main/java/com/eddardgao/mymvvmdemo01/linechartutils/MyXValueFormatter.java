package com.eddardgao.mymvvmdemo01.linechartutils;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.util.List;

/**
 * @author EddardGao
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${DATA}
 */
public class MyXValueFormatter  implements IAxisValueFormatter {
    private List<String> mValues;

    public MyXValueFormatter(List<String> values){
        this.mValues = values;
    }


    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        return mValues.get((int)value%mValues.size());
    }
}
