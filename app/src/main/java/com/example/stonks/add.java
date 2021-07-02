package com.example.stonks;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class add extends AppCompatActivity {
    EditText Salary;
    EditText Bonuses;
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

    Button back;
    Button add;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        Salary = (EditText) findViewById(R.id.salaryy_add);
        Bonuses = (EditText) findViewById(R.id.bonuss_add);
        Groceries = (EditText) findViewById(R.id.grocc_add);
        Rent = (EditText) findViewById(R.id.rentt_add);
        Fuel = (EditText) findViewById(R.id.fuell_add);
        Electricity = (EditText) findViewById(R.id.elecc_add);
        Water = (EditText) findViewById(R.id.waterr_add);
        Maintanance = (EditText) findViewById(R.id.maintt_add);
        Entertaiment = (EditText) findViewById(R.id.enterr_add);
        Education = (EditText) findViewById(R.id.eduu_add);
        Travel = (EditText) findViewById(R.id.travell_add);
        Others = (EditText) findViewById(R.id.Others_add);

        back = (Button) findViewById(R.id.back);
        add = (Button) findViewById(R.id.addd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(add.this, main2.class);
                intent.putExtra("Salary", Integer.parseInt((Salary.getText().toString())));
                intent.putExtra("Bonuses", Integer.parseInt((Bonuses.getText().toString())));
                intent.putExtra("Groceries", Integer.parseInt((Groceries.getText().toString())));
                intent.putExtra("Rent", Integer.parseInt((Rent.getText().toString())));
                intent.putExtra("Fuel", Integer.parseInt((Fuel.getText().toString())));
                intent.putExtra("Electricity", Integer.parseInt((Electricity.getText().toString())));
                intent.putExtra("Water", Integer.parseInt((Water.getText().toString())));
                intent.putExtra("Education", Integer.parseInt((Education.getText().toString())));
                intent.putExtra("Entertaiment", Integer.parseInt((Entertaiment.getText().toString())));
                intent.putExtra("Travel", Integer.parseInt((Travel.getText().toString())));
                intent.putExtra("Maintanance", Integer.parseInt((Maintanance.getText().toString())));
                intent.putExtra("Others", Integer.parseInt((Others.getText().toString())));
                Salary.setText("");
                Bonuses.setText("");
                Groceries.setText("");
                Rent.setText("");
                Fuel.setText("");
                Electricity.setText("");
                Water.setText("");
                Education.setText("");
                Entertaiment.setText("");
                Travel.setText("");
                Maintanance.setText("");
                Others.setText("");
                startActivity(intent);

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(add.this, main.class);
                startActivity(intent);

            }
        });
    }
    protected void onResume() {
        super.onResume();

        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        int a = sh.getInt("salary", 0);
        int a1 = sh.getInt("bonus", 0);
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


        Salary.setText(String.valueOf(a));
        Bonuses.setText(String.valueOf(a1));
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

        myEdit.putInt("salary", Integer.parseInt(Salary.getText().toString()));
        myEdit.putInt("bonus", Integer.parseInt(Bonuses.getText().toString()));
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
