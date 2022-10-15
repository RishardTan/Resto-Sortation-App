package com.example.myfirstapp;

import android.app.Application;

import androidx.lifecycle.ViewModel;

public class GlobalClass extends Application {

    private int MaxQuantity1,MaxQuantity2,MaxQuantity3,MaxQuantity4,MaxQuantity5;
    private int revenue,profit,CappuccinoSold,LatteSold,CaramelSold,AmericanoSold,TeaSold;
    private int StockMilk, StockBeans, StockCaramel, StockTea;
    private int currCapp,currLatte,currCaramel,currAmericano,currTea;

    public int getCurrCapp(){ return currCapp;}
    public int getCurrLatte(){ return currLatte;}
    public int getCurrAmericano(){ return currAmericano;}
    public int getCurrCaramel(){ return currCaramel;}
    public int getCurrTea(){ return currTea;}
    public void setCurrCapp(int currCapp){this.currCapp=currCapp;}
    public void setCurrLatte(int currLatte){this.currLatte=currLatte;}
    public void setCurrAmericano(int currAmericano){this.currAmericano=currAmericano;}
    public void setCurrCaramel(int currCaramel){this.currCaramel=currCaramel;}
    public void setCurrTea(int currTea){this.currTea=currTea;}

    public int getStockMilk() { return StockMilk; }
    public int getStockBeans() { return StockBeans; }
    public int getStockCaramel() { return StockCaramel; }
    public int getStockTea() { return StockTea; }
    public void setStockMilk(int n) { this.StockMilk=n; }
    public void setStockBeans(int n) { this.StockBeans=n; }
    public void setStockCaramel(int n) { this.StockCaramel=n; }
    public void setStockTea(int n) { this.StockTea=n; }

    public int getQty1()
    {
        return MaxQuantity1;
    }
    public int getQty2()
    {
        return MaxQuantity2;
    }
    public int getQty3()
    {
        return MaxQuantity3;
    }
    public int getQty4() { return MaxQuantity4; }
    public int getQty5()
    {
        return MaxQuantity5;
    }
    public void setQty1(int n)
    {
        this.MaxQuantity1=n;
    }
    public void setQty2(int n)
    {
        this.MaxQuantity2=n;
    }
    public void setQty3(int n)
    {
        this.MaxQuantity3=n;
    }
    public void setQty4(int n)
    {
        this.MaxQuantity4=n;
    }
    public void setQty5(int n)
    {
        this.MaxQuantity5=n;
    }

    public int getCappuccinoSold()
    {
        return CappuccinoSold;
    }
    public int getLatteSold()
    {
        return LatteSold;
    }
    public int getAmericanoSold()
    {
        return AmericanoSold;
    }
    public int getCaramelSold() { return CaramelSold; }
    public int getTeaSold()
    {
        return TeaSold;
    }
    public void setCappuccinoSold(int n)
    {
        this.CappuccinoSold=n;
    }
    public void setLatteSold(int n)
    {
        this.LatteSold=n;
    }
    public void setCaramelSold(int n)
    {
        this.CaramelSold=n;
    }
    public void setAmericanoSold(int n)
    {
        this.AmericanoSold=n;
    }
    public void setTeaSold(int n)
    {
        this.TeaSold=n;
    }

}
