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

import static java.text.DateFormat.getDateTimeInstance;


public class main extends AppCompatActivity {

    private static final String TAG = "main";
    DatabaseHelper myDB;


    Button transactions;
    Button Add;
    Button Addbudget;
    Button piechart;


    private TextView current;
    private TextView Salary;
    private TextView Bonuses;
    private TextView Groceries;
    private TextView Rent;
    private TextView Fuel;
    private TextView Electricity;
    private TextView Water;
    private TextView Maintanance;
    private TextView Entertaiment;
    private TextView Education;
    private TextView Travel;
    private TextView Others;
    String currentDateTimeString = getDateTimeInstance().format(new Date());
    @SuppressLint("SetTextI18n")
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        setTitle((CharSequence) "Stonks");
        Log.d(TAG, "onCreate: Starting to create chart ");
        transactions = (Button) findViewById(R.id.transaction);


        Add = (Button) findViewById(R.id.Add);
        Addbudget = (Button) findViewById(R.id.Addbudget);
        piechart = (Button) findViewById(R.id.piechart1);


        current = (TextView) findViewById(R.id.Current);
        Salary = (TextView) findViewById(R.id.salaryy);
        Bonuses = (TextView) findViewById(R.id.bonuss);
        Groceries = (TextView) findViewById(R.id.grocc);
        Rent = (TextView) findViewById(R.id.rentt);
        Fuel = (TextView) findViewById(R.id.fuell);
        Electricity = (TextView) findViewById(R.id.elecc);
        Water = (TextView) findViewById(R.id.waterr);
        Maintanance = (TextView) findViewById(R.id.maintt);
        Entertaiment = (TextView) findViewById(R.id.enterr);
        Education = (TextView) findViewById(R.id.eduu);
        Travel = (TextView) findViewById(R.id.travell);
        Others = (TextView) findViewById(R.id.Others);

//        int Salarya = getIntent().getExtras().getInt("Salary");
//        int Bonusa = getIntent().getExtras().getInt("Bonuses");
//        int Groceriesa = getIntent().getExtras().getInt("Groceries");
//        int Renta = getIntent().getExtras().getInt("Rent");
//        int Fuela = getIntent().getExtras().getInt("Fuel");
//        int Electricitya = getIntent().getExtras().getInt("Electricity");
//        int Watera = getIntent().getExtras().getInt("Water");
//        int Educationa = getIntent().getExtras().getInt("Education");
//        int Entertainmenta = getIntent().getExtras().getInt("Entertaiment");
//        int Travela = getIntent().getExtras().getInt("Travel");
//        int Maintenancea = getIntent().getExtras().getInt("Maintanance");
//        int Othersa = getIntent().getExtras().getInt("Others");
//
//        int Groceriesb = getIntent().getExtras().getInt("Groceriesb");
//        int Rentb = getIntent().getExtras().getInt("Rentb");
//        int Fuelb = getIntent().getExtras().getInt("Fuelb");
//        int Electricityb = getIntent().getExtras().getInt("Electricityb");
//        int Waterb = getIntent().getExtras().getInt("Waterb");
//        int Educationb = getIntent().getExtras().getInt("Educationb");
//        int Entertainmentb = getIntent().getExtras().getInt("Entertaimentb");
//        int Travelb = getIntent().getExtras().getInt("Travelb");
//        int Maintenanceb = getIntent().getExtras().getInt("Maintananceb");
//        int Othersb = getIntent().getExtras().getInt("Othersb");
//
//
//        if (Integer.toString(Salarya).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Salary.getText().toString());
//            Integer q2 = Salarya;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Salary                          +" +newEntry);
//            Salary.setText(addd.toString());
//        }
//        if (Integer.toString(Bonusa).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Bonuses.getText().toString());
//            Integer q2 = Bonusa;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Bonus                          +" +newEntry);
//            Bonuses.setText(addd.toString());
//        }
//        if (Integer.toString(Groceriesa).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Groceries.getText().toString());
//            Integer q2 = Groceriesa;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Groceries                          -" +newEntry);
//            Groceries.setText(addd.toString());
//            if(Integer.toString(Groceriesb).isEmpty()){}
//            else{if(addd<Groceriesb){
//                Toast.makeText(main.this, "You have exceeded your groceries budget!", Toast.LENGTH_SHORT).show();
//            }
//        }}
//
//        if (Integer.toString(Renta).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Rent.getText().toString());
//            Integer q2 = Renta;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Rent                          -" +newEntry);
//            Rent.setText(addd.toString());
//            if(Integer.toString(Rentb).isEmpty()){}
//            else{if(addd<Rentb){
//                Toast.makeText(main.this, "You have exceeded your rent budget!", Toast.LENGTH_SHORT).show();
//            }
//            }
//        }
//        if (Integer.toString(Fuela).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Fuel.getText().toString());
//            Integer q2 = Fuela;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Fuel                          -" +newEntry);
//            Fuel.setText(addd.toString());
//            if(Integer.toString(Fuelb).isEmpty()){}
//            else{if(addd<Fuelb){
//                Toast.makeText(main.this, "You have exceeded your fuel budget!", Toast.LENGTH_SHORT).show();
//            }
//            }
//        }
//        if (Integer.toString(Electricitya).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Electricity.getText().toString());
//            Integer q2 = Electricitya;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Electricity                          -" +newEntry);
//            Electricity.setText(addd.toString());
//            if(Integer.toString(Electricityb).isEmpty()){}
//            else{if(addd<Electricityb){
//                Toast.makeText(main.this, "You have exceeded electricity ent budget!", Toast.LENGTH_SHORT).show();
//            }
//            }
//        }
//        if (Integer.toString(Watera).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Water.getText().toString());
//            Integer q2 = Watera;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Water                          -" +newEntry);
//            Water.setText(addd.toString());
//            if(Integer.toString(Waterb).isEmpty()){}
//            else{if(addd<Waterb){
//                Toast.makeText(main.this, "You have exceeded your water budget!", Toast.LENGTH_SHORT).show();
//            }
//            }
//        }
//        if (Integer.toString(Educationa).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Education.getText().toString());
//            Integer q2 = Educationa;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Education                          -" +newEntry);
//            Education.setText(addd.toString());
//            if(Integer.toString(Educationb).isEmpty()){}
//            else{if(addd<Educationb){
//                Toast.makeText(main.this, "You have exceeded your education budget!", Toast.LENGTH_SHORT).show();
//            }
//            }
//        }
//        if (Integer.toString(Entertainmenta).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Entertaiment.getText().toString());
//            Integer q2 = Entertainmenta;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Entertainment                          -" +newEntry);
//            Entertaiment.setText(addd.toString());
//            if(Integer.toString(Entertainmentb).isEmpty()){}
//            else{if(addd<Entertainmentb){
//                Toast.makeText(main.this, "You have exceeded your entertainment budget!", Toast.LENGTH_SHORT).show();
//            }
//            }
//        }
//        if (Integer.toString(Travela).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Travel.getText().toString());
//            Integer q2 = Travela;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Travel                          -" +newEntry);
//            Travel.setText(addd.toString());
//            if(Integer.toString(Travelb).isEmpty()){}
//            else{if(addd<Travelb){
//                Toast.makeText(main.this, "You have exceeded your travel budget!", Toast.LENGTH_SHORT).show();
//            }
//            }
//        }
//        if (Integer.toString(Maintenancea).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Maintanance.getText().toString());
//            Integer q2 = Maintenancea;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Maintanance                          -" +newEntry);
//            Maintanance.setText(addd.toString());
//            if(Integer.toString(Maintenanceb).isEmpty()){}
//            else{if(addd<Maintenanceb){
//                Toast.makeText(main.this, "You have exceeded your maintenance budget!", Toast.LENGTH_SHORT).show();
//            }
//            }
//        }
//        if (Integer.toString(Othersa).isEmpty()){
//
//        }
//        else{
//            Integer q1 = Integer.parseInt(Others.getText().toString());
//            Integer q2 = Othersa;
//            Integer addd = q1 + q2;
//            String newEntry = Integer.toString(q2);
//            AddData(currentDateTimeString+"             Others                          -" +newEntry);
//            Others.setText(addd.toString());
//            if(Integer.toString(Othersb).isEmpty()){}
//            else{if(addd<Othersb){
//                Toast.makeText(main.this, "You have exceeded your 'others' budget!", Toast.LENGTH_SHORT).show();
//            }
//            }
//        }
//
        Add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, add.class);
                startActivity(intent);

            }
        });
        Addbudget.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, budget.class);
                startActivity(intent);

            }
        });
        piechart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, Pie_chart.class);
                startActivity(intent);

            }
        });
        transactions.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, ViewListContents.class);
                startActivity(intent);

            }
        });
        piechart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, Pie_chart.class);
                intent.putExtra("Groceriesp", Integer.parseInt((Groceries.getText().toString())));
                intent.putExtra("Rentp", Integer.parseInt((Rent.getText().toString())));
                intent.putExtra("Fuelp", Integer.parseInt((Fuel.getText().toString())));
                intent.putExtra("Electricityp", Integer.parseInt((Electricity.getText().toString())));
                intent.putExtra("Waterp", Integer.parseInt((Water.getText().toString())));
                intent.putExtra("Educationp", Integer.parseInt((Education.getText().toString())));
                intent.putExtra("Entertaimentp", Integer.parseInt((Entertaiment.getText().toString())));
                intent.putExtra("Travelp", Integer.parseInt((Travel.getText().toString())));
                intent.putExtra("Maintanancep", Integer.parseInt((Maintanance.getText().toString())));
                startActivity(intent);
            }
        });
//    }
//    protected void onResume() {
//        super.onResume();
//
//        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
//        int a = sh.getInt("salary", 0);
//        int a1 = sh.getInt("bonus", 0);
//        int a2 = sh.getInt("groceries", 0);
//        int a3 = sh.getInt("rent", 0);
//        int a4 = sh.getInt("fuel", 0);
//        int a5 = sh.getInt("electricity", 0);
//        int a6= sh.getInt("water", 0);
//        int a7 = sh.getInt("entertainment", 0);
//        int a8 = sh.getInt("maintenance", 0);
//        int a9 = sh.getInt("travel", 0);
//        int a10 = sh.getInt("education", 0);
//        int a11 = sh.getInt("current", 0);
//        int a12 = sh.getInt("others", 0);
//
//
//        Salary.setText(String.valueOf(a));
//        Bonuses.setText(String.valueOf(a1));
//        Groceries.setText(String.valueOf(a2));
//        Rent.setText(String.valueOf(a3));
//        Fuel.setText(String.valueOf(a4));
//        Electricity.setText(String.valueOf(a5));
//        Water.setText(String.valueOf(a6));
//        Entertaiment.setText(String.valueOf(a7));
//        Maintanance.setText(String.valueOf(a8));
//        Travel.setText(String.valueOf(a9));
//        Education.setText(String.valueOf(a10));
//        current.setText(String.valueOf(a11));
//        Others.setText(String.valueOf(a12));
//
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
//        SharedPreferences.Editor myEdit = sharedPreferences.edit();
//
//        myEdit.putInt("salary", Integer.parseInt(Salary.getText().toString()));
//        myEdit.putInt("bonus", Integer.parseInt(Bonuses.getText().toString()));
//        myEdit.putInt("groceries", Integer.parseInt(Groceries.getText().toString()));
//        myEdit.putInt("rent", Integer.parseInt(Rent.getText().toString()));
//        myEdit.putInt("fuel", Integer.parseInt(Fuel.getText().toString()));
//        myEdit.putInt("electricity", Integer.parseInt(Electricity.getText().toString()));
//        myEdit.putInt("water", Integer.parseInt(Water.getText().toString()));
//        myEdit.putInt("entertainment", Integer.parseInt(Entertaiment.getText().toString()));
//        myEdit.putInt("maintenance", Integer.parseInt(Maintanance.getText().toString()));
//        myEdit.putInt("travel", Integer.parseInt(Travel.getText().toString()));
//        myEdit.putInt("education", Integer.parseInt(Education.getText().toString()));
//        myEdit.putInt("current", Integer.parseInt(current.getText().toString()));
//        myEdit.putInt("others", Integer.parseInt(Others.getText().toString()));
//
//        myEdit.apply();
//    }
//    public void AddData(String newEntry) {
//
//        boolean insertData = myDB.addData(newEntry);
//
//        if (insertData) {
//            Toast.makeText(this, "Data Successfully Inserted!", Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(this, "Something went wrong :(.", Toast.LENGTH_LONG).show();
//        }
    }
}