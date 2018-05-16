package com.builderpattern;

public class Order {

    private String MainItem;
    private String SideItem;
    private String Drinks;
    private String Toy;

    public String getMainItem() {
        return MainItem;
    }

    public void setMainItem(String mainItem) {
        MainItem = mainItem;
    }

    public String getSideItem() {
        return SideItem;
    }

    public void setSideItem(String sideItem) {
        SideItem = sideItem;
    }

    public String getDrinks() {
        return Drinks;
    }

    public void setDrinks(String drinks) {
        Drinks = drinks;
    }

    public String getToy() {
        return Toy;
    }

    public void setToy(String toy) {
        Toy = toy;
    }
}
