package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        GlobalClass global = (GlobalClass) getApplicationContext();

        TextView CappSold = (TextView) findViewById(R.id.CappuccinoSales);
        TextView LatteSold = (TextView) findViewById(R.id.LatteSales);
        TextView AmericanoSold = (TextView) findViewById(R.id.AmericanoSales);
        TextView CaramelSold = (TextView) findViewById(R.id.CaramelSales);
        TextView TeaSold = (TextView) findViewById(R.id.TeaSales);
        TextView Revenue = (TextView) findViewById(R.id.Revenue);
        TextView GrossProfit = (TextView) findViewById(R.id.GrossProfit);

        CappSold.setText((int)global.getCappuccinoSold()+"");
        LatteSold.setText((int)global.getLatteSold()+"");
        AmericanoSold.setText((int)global.getAmericanoSold()+"");
        CaramelSold.setText((int)global.getCaramelSold()+"");
        TeaSold.setText((int)global.getTeaSold()+"");

        int revenue=
                global.getCappuccinoSold()*25000+
                global.getLatteSold()*20000+
                global.getAmericanoSold()*18000+
                global.getCaramelSold()*35000+
                global.getTeaSold()*15000;
        int grossprofit=
                revenue-(
                        global.getCappuccinoSold()*10000+
                        global.getLatteSold()*10000+
                        global.getAmericanoSold()*5000+
                        global.getCaramelSold()*15000+
                        global.getTeaSold()*3000
                        );

        Revenue.setText((int)revenue+"");
        GrossProfit.setText((int)grossprofit+"");

        ImageButton StatHome = (ImageButton) findViewById(R.id.StatHome);
        StatHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(statistics.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}