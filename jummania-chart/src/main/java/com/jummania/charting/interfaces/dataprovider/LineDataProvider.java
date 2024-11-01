package com.jummania.charting.interfaces.dataprovider;

import com.jummania.charting.components.YAxis;
import com.jummania.charting.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
