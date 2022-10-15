package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        GlobalClass global = (GlobalClass) getApplicationContext();

        setContentView(R.layout.activity_main);
        Button OrderButton = (Button) findViewById(R.id.OrderButton);
        OrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newOrder();
            }
        });

        Button FoodStockButton = (Button) findViewById(R.id.FoodStockButton);
        FoodStockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FoodStock();
            }
        });

        Button StatisticsButton = (Button) findViewById(R.id.StatisticsButton);
        StatisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Statistics();
            }
        });

        Button Menu = (Button) findViewById(R.id.MenuButton);
        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Menu();
            }
        });

        TextView Alert = (TextView) findViewById(R.id.Alert);
        TextView NoAlert = (TextView) findViewById(R.id.NoAlerts);
        if(global.getStockTea()<5||global.getStockCaramel()<5||global.getStockMilk()<5||global.getStockBeans()<5)
        {
            Alert.setText("Low Inventory, Check Ingredient Stocks");
        }
        else
        {
            NoAlert.setText("No Alerts, You Are All Good!");
        }

    }
    public void Statistics()
    {
        Intent intent = new Intent(MainActivity.this, statistics.class);
        startActivity(intent);
    }
    public void newOrder()
    {
        Intent intent = new Intent(MainActivity.this, orderpage.class);
        startActivity(intent);
    }
    public void FoodStock()
    {
        Intent intent = new Intent(MainActivity.this, foodstockpage.class);
        startActivity(intent);
    }
    public void Menu()
    {
        Intent intent = new Intent(MainActivity.this, Menu.class);
        startActivity(intent);
    }
}