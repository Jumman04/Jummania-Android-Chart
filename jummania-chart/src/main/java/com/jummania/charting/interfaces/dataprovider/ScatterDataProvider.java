package com.jummania.charting.interfaces.dataprovider;

import com.jummania.charting.data.ScatterData;

public interface ScatterDataProvider extends BarLineScatterCandleBubbleDataProvider {

    ScatterData getScatterData();
}
