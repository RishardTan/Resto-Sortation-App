package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Receipt extends AppCompatActivity{
    static currOrder currSales;

    public static void receipt(currOrder order)
    {
        currSales=order;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);
        GlobalClass global = (GlobalClass) getApplicationContext();
        int contain=0;
        int order[]={currSales.currCapp,currSales.currLatte,currSales.currAmericano,currSales.currCaramel,currSales.currTea};
        TextView text2 = (TextView) findViewById(R.id.text12);
        TextView subtotal = (TextView) findViewById(R.id.subtotal);
        TextView total = (TextView) findViewById(R.id.ReceiptTotal);

        StringBuilder ans = new StringBuilder();
        StringBuilder sub = new StringBuilder();
        for(int i=0; i<5; i++)
        {
            if(order[i]!=0)
            {
                if(i==0)
                {
                    ans.append("Cappuccino  "+order[i]+"\n");
                    sub.append("Rp. "+order[i]*25000+"\n");
                    contain=contain+order[i]*25000;
                }
                if(i==1)
                {
                    ans.append("Latte  "+order[i]+"\n");
                    sub.append("Rp. "+order[i]*20000+"\n");
                    contain=contain+order[i]*20000;
                }
                if(i==2)
                {
                    ans.append("Americano  "+order[i]+"\n");
                    sub.append("Rp. "+order[i]*18000+"\n");
                    contain=contain+order[i]*18000;
                }
                if(i==3)
                {
                    ans.append("Caramel Macchiato  "+order[i]+"\n");
                    sub.append("Rp. "+order[i]*35000+"\n");
                    contain=contain+order[i]*35000;
                }
                if(i==4)
                {
                    ans.append("Tea  "+order[i]+"\n");
                    sub.append("Rp. "+order[i]*15000+"\n");
                    contain=contain+order[i]*15000;
                }
            }
        }
        text2.setText(ans);
        subtotal.setText(sub);
        total.setText((int)contain+"");

        Button PrintButton = (Button) findViewById(R.id.PrintButton);
        PrintButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Receipt.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}