package com.example.stonks;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import static com.example.stonks.R.id.bottomNavigationView;

public class New extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.try1);
        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.dashboard:
                                Intent intent = new Intent(New.this, Pie_chart.class);
                                startActivity(intent);
                                return true;
                            case R.id.insight:

                                return true;
                            case R.id.add:
                                Intent intent1 = new Intent(New.this, ViewListContents.class);
                                startActivity(intent1);
                                return true;
                        }
                        return false;
                    }
                };
    }
}
