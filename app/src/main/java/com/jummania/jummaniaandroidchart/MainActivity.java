package com.jummania.jummaniaandroidchart;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.color.MaterialColors;
import com.jummania.charting.charts.PieChart;
import com.jummania.charting.data.PieData;
import com.jummania.charting.data.PieDataSet;
import com.jummania.charting.data.PieEntry;
import com.jummania.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupPieChart(100, 50, 60);
    }

    private void setupPieChart(int singleStory, int partStory, int book) {
        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry((float) singleStory, "একক রচনা " + singleStory + " টি"));
        if (partStory > 0) {
            entries.add(new PieEntry((float) partStory, "ধারাবাহিক রচনা " + partStory + " টি"));
        }
        if (book > 0) {
            entries.add(new PieEntry((float) book, "বই " + book + " টি"));
        }

        PieDataSet dataSet = new PieDataSet(entries, "");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS); // Customize colors as desired

        PieData data = new PieData(dataSet);
        data.setDrawValues(false); // Show values on the chart
        data.setValueTextSize(14f);

        int textColor = getColor(android.R.attr.textColorPrimary, Color.BLACK);
        data.setValueTextColor(textColor);

        PieChart pieChart = findViewById(R.id.pieChart);

        pieChart.setData(data);
        pieChart.getDescription().setEnabled(true);
        pieChart.getDescription().setText("মোট প্রকাশিত রচনা = " + singleStory + " + " + partStory + " + " + book + " = " + (singleStory + partStory + book) + " টি");
        pieChart.setCenterText("Story Counts");
        pieChart.setEntryLabelColor(textColor);
        pieChart.setCenterTextColor(textColor);
        pieChart.setEntryLabelTextSize(12f);
        pieChart.animateY(1000); // Animate the chart loading
        pieChart.invalidate(); // Refresh the chart

    }

    public int getColor(int colorAttributeResId, int defaultValue) {
        return MaterialColors.getColor(this, colorAttributeResId, defaultValue);
    }

}