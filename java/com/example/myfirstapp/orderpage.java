package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModel;


public class orderpage extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderpage);
        GlobalClass global = (GlobalClass) getApplicationContext();

        //hitung max cappuccino
        int maxCapp=(Math.min(global.getStockBeans()*1000/20,global.getStockMilk()*1000/250));
        global.setQty1(maxCapp);
        //hitung max latte
        int maxLatte=maxCapp;
        global.setQty2(maxLatte);
        //hitung max quantity americano
        int maxAmericano=(global.getStockBeans()*1000)/20;
        global.setQty3(maxAmericano);
        //hitung max caramel macchiato
        int maxCaramel=(Math.min(global.getStockBeans()*1000/20,global.getStockCaramel()));
        global.setQty4(maxCaramel);
        //hitung max quantity tea
        int maxTea=(global.getStockTea());
        global.setQty5(maxTea);

        ImageButton OrderHome = (ImageButton) findViewById(R.id.OrderHome);
        OrderHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(orderpage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button FinalizeButton = (Button) findViewById(R.id.FinalizeButton);
        FinalizeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                EditText qty1 = (EditText) findViewById(R.id.qty1);
                EditText qty2 = (EditText) findViewById(R.id.qty2);
                EditText qty3 = (EditText) findViewById(R.id.qty3);
                EditText qty4 = (EditText) findViewById(R.id.qty4);
                EditText qty5 = (EditText) findViewById(R.id.qty5);

                int num1 = Integer.parseInt(qty1.getText().toString());
                int num2 = Integer.parseInt(qty2.getText().toString());
                int num3 = Integer.parseInt(qty3.getText().toString());
                int num4 = Integer.parseInt(qty4.getText().toString());
                int num5 = Integer.parseInt(qty5.getText().toString());

                int currBeans=global.getStockBeans();
                int currMilk=global.getStockMilk();
                int currCaramel=global.getStockCaramel();
                int currTea= global.getStockTea();
                //capp input
                global.setStockBeans(currBeans-(num1*20)/1000);
                global.setStockMilk(currMilk-((num1)*250/1000));
                //latte input
                global.setStockBeans(currBeans-(num2*20)/1000);
                global.setStockMilk(currMilk-((num2)*250/1000));
                //americano input
                global.setStockBeans(currBeans-(num3*20)/1000);
                //caramel input
                global.setStockBeans(currBeans-(num4*20)/1000);
                global.setStockCaramel(currCaramel-num4);
                //tea input
                global.setStockTea(currTea-num5);

                //hitung max cappuccino
                int maxCapp=(Math.min(global.getStockBeans()*1000/20,global.getStockMilk()*1000/250));
                global.setQty1(maxCapp);
                //hitung max latte
                int maxLatte=maxCapp;
                global.setQty2(maxLatte);
                //hitung max quantity americano
                int maxAmericano=(global.getStockBeans()*1000)/20;
                global.setQty3(maxAmericano);
                //hitung max caramel macchiato
                int maxCaramel=(Math.min(global.getStockBeans()*1000/20,global.getStockCaramel()));
                global.setQty4(maxCaramel);
                //hitung max quantity tea
                int maxTea=(global.getStockTea());
                global.setQty5(maxTea);

                int CappSold=global.getCappuccinoSold();
                int LatteSold=global.getLatteSold();
                int AmericanoSold=global.getAmericanoSold();
                int CaramelSold=global.getCaramelSold();
                int TeaSold=global.getTeaSold();
                global.setCappuccinoSold(CappSold+num1);
                global.setLatteSold(LatteSold+num2);
                global.setAmericanoSold(AmericanoSold+num3);
                global.setCaramelSold(CaramelSold+num4);
                global.setTeaSold(TeaSold+num5);

                currOrder currSales = new currOrder(num1,num2,num3,num4,num5);
                Receipt.receipt(currSales);

                Intent intent = new Intent(orderpage.this, Receipt.class);
                startActivity(intent);
            }
        });
    }


}