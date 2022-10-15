package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class addItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        GlobalClass global = (GlobalClass) getApplicationContext();

        EditText ItemName = (EditText) findViewById(R.id.ItemName);
        EditText ItemQty = (EditText) findViewById(R.id.ItemQuantity);

        Button AddButton = (Button) findViewById(R.id.AddItemStock);
        AddButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String Item = ItemName.getText().toString();
                int Qty = Integer.parseInt(ItemQty.getText().toString());
                if(Item.toLowerCase(Locale.ROOT).compareTo("milk")==0)
                {
                    global.setStockMilk(Qty);
                }
                if(Item.toLowerCase(Locale.ROOT).compareTo("coffee beans")==0)
                {
                    global.setStockBeans(Qty);
                }
                if(Item.toLowerCase(Locale.ROOT).compareTo("caramel sauce")==0)
                {
                    global.setStockCaramel(Qty);
                }
                if(Item.toLowerCase(Locale.ROOT).compareTo("tea")==0)
                {
                    global.setStockTea(Qty);
                }

                Intent intent = new Intent(addItem.this, foodstockpage.class);
                startActivity(intent);

                ImageButton addHome = (ImageButton) findViewById(R.id.addHome);
                addHome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(addItem.this, MainActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });

    }

}