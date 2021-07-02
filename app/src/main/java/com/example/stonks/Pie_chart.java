package com.example.stonks;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class Pie_chart extends AppCompatActivity {

    PieChart pieChart;
    PieData pieData;
    List<PieEntry> pieEntryList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.piechart);
        int Groceries = getIntent().getExtras().getInt("Groceries");
        int Rent = getIntent().getExtras().getInt("Rent");
        int Fuel = getIntent().getExtras().getInt("Fuel");
        int Electricity = getIntent().getExtras().getInt("Electricity");
        int Water = getIntent().getExtras().getInt("Water");
        int Education = getIntent().getExtras().getInt("Education");
        int Entertainment = getIntent().getExtras().getInt("Entertaiment");
        int Travel = getIntent().getExtras().getInt("Travel");
        int Maintenance = getIntent().getExtras().getInt("Maintanance");
        int other = getIntent().getExtras().getInt("Other");
        pieChart = findViewById(R.id.pieChart);
        pieChart.setUsePercentValues(true);
        if(Groceries!=0){
            pieEntryList.add(new PieEntry(Groceries,"Groceries"));
        }
        if(Rent!=0){
            pieEntryList.add(new PieEntry(Rent,"Rent"));
        }
        if(Fuel!=0){
            pieEntryList.add(new PieEntry(Fuel,"Fuel"));
        }
        if(Electricity!=0){
            pieEntryList.add(new PieEntry(Electricity,"Electricity"));
        }
        if(Water!=0){
            pieEntryList.add(new PieEntry(Water,"Water"));
        }
        if(Education!=0){
            pieEntryList.add(new PieEntry(Education,"Education"));
        }
        if(Entertainment!=0){
            pieEntryList.add(new PieEntry(Entertainment,"Entertainment"));
        }
        if(Travel!=0){
            pieEntryList.add(new PieEntry(Travel,"Travel"));
        }
        if(Maintenance!=0){
            pieEntryList.add(new PieEntry(Maintenance,"Maintenance"));
        }
        if(other!=0){
            pieEntryList.add(new PieEntry(other,"other"));
        }
        pieChart.getDescription().setText("Outcomes");
        PieDataSet pieDataSet = new PieDataSet(pieEntryList,"");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieChart.setDrawHoleEnabled(false);
        pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.invalidate();
    }
}