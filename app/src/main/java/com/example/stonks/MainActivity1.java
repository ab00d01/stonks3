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


public class MainActivity1 extends AppCompatActivity {

    private static final String TAG ="MainActivity1" ;
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

    private TextView groceriesbudget;
    private TextView rentbudget;
    private TextView fuelbudget;
    private TextView electricitybudget;
    private TextView waterbudget;
    private TextView maintenancebudget;
    private TextView entertainmentbudget;
    private TextView educationbudget;
    private TextView travelbudget;

    EditText Salary1;
    EditText Bonuses1;
    EditText Groceries1;
    EditText Rent1;
    EditText Fuel1;
    EditText Electricity1;
    EditText Water1;
    EditText Maintanance1;
    EditText Entertaiment1;
    EditText Education1;
    EditText Travel1;
    EditText othersT;
    EditText othersB;
    EditText othersA;

    EditText budgetGroceries;
    EditText budgetRent;
    EditText budgetFuel;
    EditText budgetElectricity;
    EditText budgetWater;
    EditText budgetMaintenance;
    EditText budgetEntertainment;
    EditText budgetEducation;
    EditText budgetTravel;

    TextView OtherV;
    TextView OtherB;


    String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());


    @SuppressLint("SetTextI18n")
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout1);
        setTitle((CharSequence) "Stonks");
        Log.d(TAG, "onCreate: Starting to create chart ");
        transactions = (Button) findViewById(R.id.button1);



        Add = (Button) findViewById(R.id.Add);
        Addbudget = (Button) findViewById(R.id.Addbudget);
        piechart = (Button) findViewById(R.id.piechart);



        current = (TextView) findViewById(R.id.current);
        Salary = (TextView) findViewById(R.id.Salary);
        Bonuses = (TextView) findViewById(R.id.Bonuses);
        Groceries = (TextView) findViewById(R.id.Groceries);
        Rent = (TextView) findViewById(R.id.Rent);
        Fuel = (TextView) findViewById(R.id.Fuel);
        Electricity = (TextView) findViewById(R.id.Electricity);
        Water = (TextView) findViewById(R.id.Water);
        Maintanance = (TextView) findViewById(R.id.Maintenance);
        Entertaiment = (TextView) findViewById(R.id.Entertainment);
        Education = (TextView) findViewById(R.id.Education);
        Travel = (TextView) findViewById(R.id.Travel);
        OtherV = (TextView) findViewById(R.id.Other);
        OtherB = (TextView) findViewById(R.id.othersbudget);

        groceriesbudget = (TextView) findViewById(R.id.groceriesbudget);
        rentbudget = (TextView) findViewById(R.id.rentbudget);
        fuelbudget = (TextView) findViewById(R.id.fuelbudget);
        electricitybudget = (TextView) findViewById(R.id.electricitybudget);
        waterbudget = (TextView) findViewById(R.id.waterbudget);
        maintenancebudget = (TextView) findViewById(R.id.maintenancebudget);
        entertainmentbudget = (TextView) findViewById(R.id.entertainmentbudget);
        educationbudget = (TextView) findViewById(R.id.educationbudget);
        travelbudget = (TextView) findViewById(R.id.travelbudget);

        Salary1 = (EditText) findViewById(R.id.Salary1);
        Bonuses1 = (EditText) findViewById(R.id.Bonuses1);
        Groceries1 = (EditText) findViewById(R.id.Groceries1);
        Rent1 = (EditText) findViewById(R.id.Rent1);
        Fuel1 = (EditText) findViewById(R.id.Fuel1);
        Electricity1 = (EditText) findViewById(R.id.Electricity1);
        Water1 = (EditText) findViewById(R.id.Water1);
        Maintanance1 = (EditText) findViewById(R.id.Maintenance1);
        Entertaiment1 = (EditText) findViewById(R.id.Entertainment1);
        Education1 = (EditText) findViewById(R.id.Education1);
        Travel1 = (EditText) findViewById(R.id.Travel1);
        othersT = (EditText) findViewById(R.id.others1);
        othersA = (EditText) findViewById(R.id.Others1);
        othersB = (EditText) findViewById(R.id.otherbudget);


        budgetGroceries = (EditText) findViewById(R.id.budgetGroceries);
        budgetRent = (EditText) findViewById(R.id.budgetRent);
        budgetFuel = (EditText) findViewById(R.id.budgetFuel);
        budgetElectricity = (EditText) findViewById(R.id.budgetElectricity);
        budgetWater = (EditText) findViewById(R.id.budgetWater);
        budgetMaintenance = (EditText) findViewById(R.id.budgetMaintenance);
        budgetEntertainment = (EditText) findViewById(R.id.budgetEntertainment);
        budgetEducation = (EditText) findViewById(R.id.budgetEducation);
        budgetTravel = (EditText) findViewById(R.id.budgetTravel);


        myDB = new DatabaseHelper(this);



        int a3 = 0;
        if (Salary.getText().toString().isEmpty()) {

            Salary.setText(Integer.toString(a3));
        }
        if (Bonuses.getText().toString().isEmpty()) {

            Bonuses.setText(Integer.toString(a3));
        }
        if (Groceries.getText().toString().isEmpty()) {

            Groceries.setText(Integer.toString(a3));
        }
        if (Rent.getText().toString().isEmpty()) {

            Rent.setText(Integer.toString(a3));
        }
        if (Fuel.getText().toString().isEmpty()) {

            Fuel.setText(Integer.toString(a3));
        }
        if (Electricity.getText().toString().isEmpty()) {

            Electricity.setText(Integer.toString(a3));
        }
        if (Maintanance.getText().toString().isEmpty()) {

            Maintanance.setText(Integer.toString(a3));
        }
        if (Entertaiment.getText().toString().isEmpty()) {

            Entertaiment.setText(Integer.toString(a3));
        }
        if (Education.getText().toString().isEmpty()) {

            Education.setText(Integer.toString(a3));
        }
        if (Travel.getText().toString().isEmpty()) {

            Travel.setText(Integer.toString(a3));
        }
        if (Water.getText().toString().isEmpty()) {

            Water.setText(Integer.toString(a3));
        }
        if (OtherV.getText().toString().isEmpty()) {

            OtherV.setText(Integer.toString(a3));
        }


            Addbudget.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                        if(budgetWater.getText().toString().isEmpty() && budgetTravel.getText().toString().isEmpty() && budgetRent.getText().toString().isEmpty()
                                && budgetMaintenance.getText().toString().isEmpty() && budgetGroceries.getText().toString().isEmpty() && budgetFuel.getText().toString().isEmpty()
                                && budgetEntertainment.getText().toString().isEmpty() && budgetEducation.getText().toString().isEmpty()
                                && budgetElectricity.getText().toString().isEmpty() && othersB.getText().toString().isEmpty()) {
                            Toast.makeText(MainActivity1.this, "You must input a budget first!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            if(budgetGroceries.getText().toString().length() != 0) {
                                groceriesbudget.setText(budgetGroceries.getText().toString());
                                budgetGroceries.setText("");
                            }
                            if(budgetRent.getText().toString().length() != 0) {
                                rentbudget.setText(budgetRent.getText().toString());
                                budgetRent.setText("");
                            }
                            if(budgetFuel.getText().toString().length() != 0) {
                                fuelbudget.setText(budgetFuel.getText().toString());
                                budgetFuel.setText("");
                            }
                            if(budgetElectricity.getText().toString().length() != 0) {
                                electricitybudget.setText(budgetElectricity.getText().toString());
                                budgetElectricity.setText("");
                            }
                            if(budgetWater.getText().toString().length() != 0) {
                                waterbudget.setText(budgetWater.getText().toString());
                                budgetWater.setText("");
                            }
                            if(budgetMaintenance.getText().toString().length() != 0) {
                                maintenancebudget.setText(budgetMaintenance.getText().toString());
                                budgetMaintenance.setText("");
                            }
                            if(budgetEducation.getText().toString().length() != 0) {
                                educationbudget.setText(budgetEducation.getText().toString());
                                budgetEducation.setText("");
                            }
                            if(budgetEntertainment.getText().toString().length() != 0) {
                                entertainmentbudget.setText(budgetEntertainment.getText().toString());
                                budgetEntertainment.setText("");
                            }
                            if(budgetTravel.getText().toString().length() != 0) {
                                travelbudget.setText(budgetTravel.getText().toString());
                                budgetTravel.setText("");
                            }
                            if(othersB.getText().toString().length() != 0) {
                                OtherB.setText(othersB.getText().toString());
                                othersB.setText("");
                            }
                        }
                }
            });

                Add.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View v) {
                        if (Salary1.getText().toString().length() != 0) {
                            String newEntry = Salary1.getText().toString();
                            AddData(currentDateTimeString+"             Salary                          +" +newEntry);
                            Integer q1 = Integer.parseInt(Salary1.getText().toString());
                            Integer q2 = Integer.parseInt(Salary.getText().toString());

                            Integer add_sal = q1 + q2;
                            Salary1.setText("");
                            Salary.setText(add_sal.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());

                        } else if (Bonuses1.getText().toString().length() != 0) {
                            String newEntry = Bonuses1.getText().toString();
                            AddData(currentDateTimeString+"             Bonuses                          +" +newEntry);
                            Integer q1 = Integer.parseInt(Bonuses.getText().toString());
                            Integer q2 = Integer.parseInt(Bonuses1.getText().toString());
                            Integer add_bon = q1 + q2;
                            Bonuses1.setText("");
                            Bonuses.setText(add_bon.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());
                        } else if (Rent1.getText().toString().length() != 0) {
                            String newEntry = Rent1.getText().toString();
                            AddData(currentDateTimeString+"             Rent                          -" +newEntry);
                            Integer q1 = Integer.parseInt(Rent1.getText().toString());
                            Integer q2 = Integer.parseInt(Rent.getText().toString());
                            Integer add_rent = q1 + q2;
                            Rent1.setText("");

                            Rent.setText(add_rent.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());
                            if(rentbudget.getText().toString().length()!=0){
                                Integer x12 = Integer.parseInt((rentbudget.getText().toString()));
                                if(x12<x3){
                                    Toast.makeText(MainActivity1.this, "You have exceeded your rent budget!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        } else if (Groceries1.getText().toString().length() != 0) {

                            String newEntry = Groceries1.getText().toString();
                            AddData(currentDateTimeString+"             Groceries                          -" +newEntry);
                            Integer q1 = Integer.parseInt(Groceries1.getText().toString());
                            Integer q2 = Integer.parseInt(Groceries.getText().toString());
                            Integer add_groc = q1 + q2;
                            Groceries1.setText("");
                            Groceries.setText(add_groc.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());
                            if(groceriesbudget.getText().toString().length()!=0){
                                Integer x12 = Integer.parseInt((groceriesbudget.getText().toString()));
                                if(x12<x4){
                                    Toast.makeText(MainActivity1.this, "You have exceeded your groceries budget!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        } else if (Fuel1.getText().toString().length() != 0) {
                            String newEntry = Fuel1.getText().toString();
                            AddData(currentDateTimeString+"             Fuel                          -" +newEntry);
                            Integer q1 = Integer.parseInt(Fuel1.getText().toString());
                            Integer q2 = Integer.parseInt(Fuel.getText().toString());
                            Integer add_fuel = q1 + q2;
                            Fuel1.setText("");
                            Fuel.setText(add_fuel.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());
                            if(fuelbudget.getText().toString().length()!=0){
                                Integer x12 = Integer.parseInt((fuelbudget.getText().toString()));
                                if(x12<x9){
                                    Toast.makeText(MainActivity1.this, "You have exceeded your fuel budget!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        } else if (Electricity1.getText().toString().length() != 0) {
                            String newEntry = Electricity1.getText().toString();
                            AddData(currentDateTimeString+"             Electricity                          -" +newEntry);
                            Integer q1 = Integer.parseInt(Electricity1.getText().toString());
                            Integer q2 = Integer.parseInt(Electricity.getText().toString());
                            Integer add_elec = q1 + q2;
                            Electricity1.setText("");
                            Electricity.setText(add_elec.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());
                            if(electricitybudget.getText().toString().length()!=0){
                                Integer x12 = Integer.parseInt((electricitybudget.getText().toString()));
                                if(x12<x7){
                                    Toast.makeText(MainActivity1.this, "You have exceeded your electricity budget!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        } else if (Water1.getText().toString().length() != 0) {
                            String newEntry = Water1.getText().toString();
                            AddData(currentDateTimeString+"             Water                          -" +newEntry);
                            Integer q1 = Integer.parseInt(Water1.getText().toString());
                            Integer q2 = Integer.parseInt(Water.getText().toString());
                            Integer add_wat = q1 + q2;
                            Water1.setText("");
                            Water.setText(add_wat.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());
                            if(waterbudget.getText().toString().length()!=0){
                                Integer x12 = Integer.parseInt((waterbudget.getText().toString()));
                                if(x12<x8){
                                    Toast.makeText(MainActivity1.this, "You have exceeded your water budget!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        } else if (Maintanance1.getText().toString().length() != 0) {
                            String newEntry = Maintanance1.getText().toString();
                            AddData(currentDateTimeString+"             Maintanance1                          -" +newEntry);
                            Integer q1 = Integer.parseInt(Maintanance1.getText().toString());
                            Integer q2 = Integer.parseInt(Maintanance.getText().toString());
                            Integer add_main = q1 + q2;
                            Maintanance1.setText("");
                            Maintanance.setText(add_main.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());
                            if(maintenancebudget.getText().toString().length()!=0){
                                Integer x12 = Integer.parseInt((maintenancebudget.getText().toString()));
                                if(x12<x10){
                                    Toast.makeText(MainActivity1.this, "You have exceeded your maintenance budget!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        } else if (Entertaiment1.getText().toString().length() != 0) {
                            String newEntry = Entertaiment1.getText().toString();
                            AddData(currentDateTimeString+"             Entertaiment                          -" +newEntry);
                            Integer q1 = Integer.parseInt(Entertaiment1.getText().toString());
                            Integer q2 = Integer.parseInt(Entertaiment.getText().toString());
                            Integer add_ent = q1 + q2;
                            Entertaiment1.setText("");
                            Entertaiment.setText(add_ent.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());
                            if(entertainmentbudget.getText().toString().length()!=0){
                                Integer x12 = Integer.parseInt((entertainmentbudget.getText().toString()));
                                if(x12<x6){
                                    Toast.makeText(MainActivity1.this, "You have exceeded your entertainment budget!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        } else if (Education1.getText().toString().length() != 0) {
                            String newEntry = Education1.getText().toString();
                            AddData(currentDateTimeString+"             Education                          -" +newEntry);
                            Integer q1 = Integer.parseInt(Education1.getText().toString());
                            Integer q2 = Integer.parseInt(Education.getText().toString());
                            Integer add_ed = q1 + q2;
                            Education1.setText("");
                            Education.setText(add_ed.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());
                            if(educationbudget.getText().toString().length()!=0){
                                Integer x12 = Integer.parseInt((educationbudget.getText().toString()));
                                if(x12<x5){
                                    Toast.makeText(MainActivity1.this, "You have exceeded your education budget!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        } else if (Travel1.getText().toString().length() != 0) {
                            String newEntry = Travel1.getText().toString();
                            AddData(currentDateTimeString+"             Travel                          -" +newEntry);
                            Integer q1 = Integer.parseInt(Travel1.getText().toString());
                            Integer q2 = Integer.parseInt(Travel.getText().toString());
                            Integer add_tra = q1 + q2;
                            Travel1.setText("");
                            Travel.setText(add_tra.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());
                            if(travelbudget.getText().toString().length()!=0){
                                Integer x12 = Integer.parseInt((travelbudget.getText().toString()));
                                if(x12<x11){
                                    Toast.makeText(MainActivity1.this, "You have exceeded your travel budget!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        }
                        else if (othersA.getText().toString().length() != 0) {
                            String newEntry = othersA.getText().toString();
                            if (othersT.getText().toString().isEmpty()){
                                AddData(currentDateTimeString+"             Others                          -" +newEntry);
                            }
                            else{
                                String othr = othersT.getText().toString();
                                AddData(currentDateTimeString+"             "+othr+"                          -" +newEntry);
                                othersT.setText("");
                            }
                            Integer q1 = Integer.parseInt(othersA.getText().toString());
                            Integer q2 = Integer.parseInt(OtherV.getText().toString());
                            Integer add_tra = q1 + q2;
                            othersA.setText("");
                            OtherV.setText(add_tra.toString());
                            Integer x1 = Integer.parseInt((Salary.getText().toString()));
                            Integer x2 = Integer.parseInt((Bonuses.getText().toString()));
                            Integer x3 = Integer.parseInt((Rent.getText().toString()));
                            Integer x4 = Integer.parseInt((Groceries.getText().toString()));
                            Integer x5 = Integer.parseInt((Education.getText().toString()));
                            Integer x6 = Integer.parseInt((Entertaiment.getText().toString()));
                            Integer x7 = Integer.parseInt((Electricity.getText().toString()));
                            Integer x8 = Integer.parseInt((Water.getText().toString()));
                            Integer x9 = Integer.parseInt((Fuel.getText().toString()));
                            Integer x10 = Integer.parseInt((Maintanance.getText().toString()));
                            Integer x11 = Integer.parseInt((Travel.getText().toString()));
                            Integer x13 = Integer.parseInt((OtherV.getText().toString()));

                            Integer x_total = x1 + x2 - x3 - x4 - x5 - x6 - x7 - x8 - x9 - x10 - x11 - x13;
                            current.setText(x_total.toString());
                            if(othersB.getText().toString().length()!=0){
                                Integer x12 = Integer.parseInt((OtherB.getText().toString()));
                                if(x12<x13){
                                    Toast.makeText(MainActivity1.this, "You have exceeded your 'others' budget!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        }else {
                            Toast.makeText(MainActivity1.this, "You must input and income or outcome first!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

        transactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity1.this, ViewListContents.class);
                startActivity(intent);
            }
        });
        piechart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity1.this, Pie_chart.class);
                intent.putExtra("Groceries", Integer.parseInt((Groceries.getText().toString())));
                intent.putExtra("Rent", Integer.parseInt((Rent.getText().toString())));
                intent.putExtra("Fuel", Integer.parseInt((Fuel.getText().toString())));
                intent.putExtra("Electricity", Integer.parseInt((Electricity.getText().toString())));
                intent.putExtra("Water", Integer.parseInt((Water.getText().toString())));
                intent.putExtra("Education", Integer.parseInt((Education.getText().toString())));
                intent.putExtra("Entertaiment", Integer.parseInt((Entertaiment.getText().toString())));
                intent.putExtra("Travel", Integer.parseInt((Travel.getText().toString())));
                intent.putExtra("Maintanance", Integer.parseInt((Maintanance.getText().toString())));
                intent.putExtra("Other", Integer.parseInt((OtherV.getText().toString())));
                startActivity(intent);
            }
        });
    }

    @Override
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
        int a21 = sh.getInt("other", 0);
        int a11 = sh.getInt("current", 0);
        int a12 = sh.getInt("groceriesb", 0);
        int a13 = sh.getInt("rentb", 0);
        int a14 = sh.getInt("fuelb", 0);
        int a15 = sh.getInt("electricityb", 0);
        int a16= sh.getInt("waterb", 0);
        int a17 = sh.getInt("entertainmentb", 0);
        int a18 = sh.getInt("maintenanceb", 0);
        int a19 = sh.getInt("travelb", 0);
        int a20 = sh.getInt("educationb", 0);
        int a22 = sh.getInt("otherb", 0);

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
        current.setText(String.valueOf(a11));
        groceriesbudget.setText(String.valueOf(a12));
        rentbudget.setText(String.valueOf(a13));
        fuelbudget.setText(String.valueOf(a14));
        electricitybudget.setText(String.valueOf(a15));
        waterbudget.setText(String.valueOf(a16));
        entertainmentbudget.setText(String.valueOf(a17));
        maintenancebudget.setText(String.valueOf(a18));
        travelbudget.setText(String.valueOf(a19));
        educationbudget.setText(String.valueOf(a20));
        OtherV.setText(String.valueOf(a21));
        OtherB.setText(String.valueOf(a22));

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
        myEdit.putInt("current", Integer.parseInt(current.getText().toString()));
        myEdit.putInt("groceriesb", Integer.parseInt(groceriesbudget.getText().toString()));
        myEdit.putInt("rentb", Integer.parseInt(rentbudget.getText().toString()));
        myEdit.putInt("fuelb", Integer.parseInt(fuelbudget.getText().toString()));
        myEdit.putInt("electricityb", Integer.parseInt(electricitybudget.getText().toString()));
        myEdit.putInt("waterb", Integer.parseInt(waterbudget.getText().toString()));
        myEdit.putInt("entertainmentb", Integer.parseInt(entertainmentbudget.getText().toString()));
        myEdit.putInt("maintenanceb", Integer.parseInt(maintenancebudget.getText().toString()));
        myEdit.putInt("travelb", Integer.parseInt(travelbudget.getText().toString()));
        myEdit.putInt("educationb", Integer.parseInt(educationbudget.getText().toString()));
        myEdit.putInt("other", Integer.parseInt(OtherV.getText().toString()));
        myEdit.putInt("otherb", Integer.parseInt(OtherB.getText().toString()));
        myEdit.apply();
    }

    public void AddData(String newEntry) {

        boolean insertData = myDB.addData(newEntry);

        if (insertData) {
        } else {
            Toast.makeText(this, "Something went wrong :(.", Toast.LENGTH_SHORT).show();
        }
    }


}

