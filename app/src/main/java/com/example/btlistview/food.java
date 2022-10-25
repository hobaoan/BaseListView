package com.example.btlistview;

public class food {
    private String nameFood;
    private String numbFood;
    private String numbSales;
    private int hinh;


    public food(String nameFood, String numbFood, String numbSales, int hinh) {
        this.nameFood = nameFood;
        this.numbFood = numbFood;
        this.numbSales = numbSales;
        this.hinh = hinh;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getNumbFood() {
        return numbFood;
    }

    public void setNumbFood(String numbFood) {
        this.numbFood = numbFood;
    }

    public String getNumbSales() {
        return numbSales;
    }

    public void setNumbSales(String numbSales) {
        this.numbSales = numbSales;
    }
    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

}
