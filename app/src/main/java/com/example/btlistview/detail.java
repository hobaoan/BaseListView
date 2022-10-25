package com.example.btlistview;

public class detail {
    private String nameFoodDT;
    private String priceSale;
    private String price;
    private String star;
    private int hinhDT;

    public detail(String nameFoodDT, String priceSale, String price, String star, int hinhDT) {
        this.nameFoodDT = nameFoodDT;
        this.priceSale = priceSale;
        this.price = price;
        this.star = star;
        this.hinhDT = hinhDT;
    }

    public String getNameFoodDT() {
        return nameFoodDT;
    }

    public void setNameFoodDT(String nameFoodDT) {
        this.nameFoodDT = nameFoodDT;
    }

    public String getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(String priceSale) {
        this.priceSale = priceSale;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public int getHinhDT() {
        return hinhDT;
    }

    public void setHinhDT(int hinhDT) {
        this.hinhDT = hinhDT;
    }
}
