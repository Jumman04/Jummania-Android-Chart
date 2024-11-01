package com.jummania.charting.interfaces.dataprovider;

import com.jummania.charting.components.YAxis.AxisDependency;
import com.jummania.charting.data.BarLineScatterCandleBubbleData;
import com.jummania.charting.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    boolean isInverted(AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
