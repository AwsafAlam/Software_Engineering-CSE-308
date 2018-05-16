package com.builderpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Meal implements Item {

    @Override
    public abstract String Name();

    @Override
    public Packaging packaging() {
        return new Bag();
    }

//    private List<Order> items = new ArrayList<Order>();
//
//    public void Add(Order mealitem){
//        items.add(mealitem);
//    }
//
//    public void Show(){
//        System.out.println("Products ordered are: \n");
//        for (Order item:items)
//        {
//            System.out.println("Item ----------- ");
//            System.out.println(item.getMainItem());
//            System.out.println(item.getSideItem());
//            System.out.println(item.getDrinks());
//            System.out.println(item.getToy());
//
//        }
//    }

}
