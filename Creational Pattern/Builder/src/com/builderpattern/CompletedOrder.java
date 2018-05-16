package com.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class CompletedOrder {

    private List<Item> mealItems = new ArrayList<>();

    public void addItem(Item it){
        mealItems.add(it);
    }

    public void Show(){
        for (Item item: mealItems) {
            System.out.println(item.Name() +" in "+ item.packaging().packName());
        }

    }

}
