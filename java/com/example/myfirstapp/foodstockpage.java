package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class foodstockpage extends AppCompatActivity {
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodstockpage);
        GlobalClass global = (GlobalClass) getApplicationContext();

        TextView MilkStock = (TextView) findViewById(R.id.MilkStockQuantity);
        TextView CoffeeBeansStock = (TextView) findViewById(R.id.CoffeeBeansStockQuantity);
        TextView CaramelSauceStock = (TextView) findViewById(R.id.CaramelSauceStockQuantity);
        TextView TeaBagStock = (TextView) findViewById(R.id.TeaBagStockQuantity);
        MilkStock.setText((int)global.getStockMilk()+"");
        CoffeeBeansStock.setText((int)global.getStockBeans()+"");
        CaramelSauceStock.setText((int)global.getStockCaramel()+"");
        TeaBagStock.setText((int)global.getStockTea()+"");

        ImageButton StockHome = (ImageButton) findViewById(R.id.NewItemHome);
        StockHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(foodstockpage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button AddItem = (Button) findViewById(R.id.AddItem);
        AddItem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                Intent intent = new Intent(foodstockpage.this, addItem.class);
                startActivity(intent);
            }
        });

    }
}