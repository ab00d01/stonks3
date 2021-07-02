package com.example.stonks;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

import android.database.sqlite.SQLiteOpenHelper;
import androidx.appcompat.app.AppCompatActivity;


import java.util.Date;


public class budget extends AppCompatActivity {

    DatabaseHelper myDB;
    Button Addbudget;
    Button back;
    EditText Groceries;
    EditText Rent;
    EditText Fuel;
    EditText Electricity;
    EditText Water;
    EditText Maintanance;
    EditText Entertaiment;
    EditText Education;
    EditText Travel;
    EditText Others;
    @SuppressLint("SetTextI18n")
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.budget);
        setTitle((CharSequence) "Stonks");


        Addbudget = (Button) findViewById(R.id.addb);
        back = (Button) findViewById(R.id.Back2);


        Groceries = (EditText) findViewById(R.id.grocc_budg);
        Rent = (EditText) findViewById(R.id.rentt_budg);
        Fuel = (EditText) findViewById(R.id.fuell_budg);
        Electricity = (EditText) findViewById(R.id.elecc_budg);
        Water = (EditText) findViewById(R.id.waterr_budg);
        Maintanance = (EditText) findViewById(R.id.maintt_budg);
        Entertaiment = (EditText) findViewById(R.id.enterr_budg);
        Education = (EditText) findViewById(R.id.eduu_budg);
        Travel = (EditText) findViewById(R.id.travell_budg);
        Others = (EditText) findViewById(R.id.Others_budg);

        Addbudget.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(budget.this, main.class);

                intent.putExtra("Groceriesb", Integer.parseInt((Groceries.getText().toString())));
                intent.putExtra("Rentb", Integer.parseInt((Rent.getText().toString())));
                intent.putExtra("Fuelb", Integer.parseInt((Fuel.getText().toString())));
                intent.putExtra("Electricityb", Integer.parseInt((Electricity.getText().toString())));
                intent.putExtra("Waterb", Integer.parseInt((Water.getText().toString())));
                intent.putExtra("Educationb", Integer.parseInt((Education.getText().toString())));
                intent.putExtra("Entertaimentb", Integer.parseInt((Entertaiment.getText().toString())));
                intent.putExtra("Travelb", Integer.parseInt((Travel.getText().toString())));
                intent.putExtra("Maintananceb", Integer.parseInt((Maintanance.getText().toString())));
                intent.putExtra("Othersb", Integer.parseInt((Others.getText().toString())));
                startActivity(intent);

            }
        });
        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(budget.this, main.class);
                startActivity(intent);

            }
        });
    }

    protected void onResume() {
        super.onResume();

        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        int a2 = sh.getInt("groceries", 0);
        int a3 = sh.getInt("rent", 0);
        int a4 = sh.getInt("fuel", 0);
        int a5 = sh.getInt("electricity", 0);
        int a6= sh.getInt("water", 0);
        int a7 = sh.getInt("entertainment", 0);
        int a8 = sh.getInt("maintenance", 0);
        int a9 = sh.getInt("travel", 0);
        int a10 = sh.getInt("education", 0);
        int a11 = sh.getInt("others", 0);



        Groceries.setText(String.valueOf(a2));
        Rent.setText(String.valueOf(a3));
        Fuel.setText(String.valueOf(a4));
        Electricity.setText(String.valueOf(a5));
        Water.setText(String.valueOf(a6));
        Entertaiment.setText(String.valueOf(a7));
        Maintanance.setText(String.valueOf(a8));
        Travel.setText(String.valueOf(a9));
        Education.setText(String.valueOf(a10));
        Others.setText(String.valueOf(a11));
    }

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        myEdit.putInt("groceries", Integer.parseInt(Groceries.getText().toString()));
        myEdit.putInt("rent", Integer.parseInt(Rent.getText().toString()));
        myEdit.putInt("fuel", Integer.parseInt(Fuel.getText().toString()));
        myEdit.putInt("electricity", Integer.parseInt(Electricity.getText().toString()));
        myEdit.putInt("water", Integer.parseInt(Water.getText().toString()));
        myEdit.putInt("entertainment", Integer.parseInt(Entertaiment.getText().toString()));
        myEdit.putInt("maintenance", Integer.parseInt(Maintanance.getText().toString()));
        myEdit.putInt("travel", Integer.parseInt(Travel.getText().toString()));
        myEdit.putInt("education", Integer.parseInt(Education.getText().toString()));
        myEdit.putInt("others", Integer.parseInt(Others.getText().toString()));
        myEdit.apply();
    }
}