package com.jummania.charting.interfaces.dataprovider;

import com.jummania.charting.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
