package com.jummania.charting.interfaces.dataprovider;

import com.jummania.charting.data.BubbleData;

public interface BubbleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BubbleData getBubbleData();
}
