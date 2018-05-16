package com.builderpattern;
import com.builderpattern.DrinkItems.Coke;
import com.builderpattern.DrinkItems.MountainDew;
import com.builderpattern.DrinkItems.SevenUp;
import com.builderpattern.MainItems.cheeseburger;
import com.builderpattern.MainItems.chickenburger;
import com.builderpattern.MainItems.hamburger;
import com.builderpattern.SIdeItems.Choleslaw;
import com.builderpattern.SIdeItems.Fries;
import com.builderpattern.ToyItems.Dinosaur;
import com.builderpattern.ToyItems.YoYo;

public class Children_Meal implements MealBuilder{

    private CompletedOrder completedOrder;

    public Children_Meal() {
        this.completedOrder = new CompletedOrder();
    }


    @Override
    public void mainitem(String mainItem) {
        if (mainItem.equalsIgnoreCase("HAMBURGER")){
            completedOrder.addItem(new hamburger());
        }
        else if(mainItem.equalsIgnoreCase("CHEESEBURGER")){
            completedOrder.addItem(new cheeseburger());
        }
        else if(mainItem.equalsIgnoreCase("CHICKENBURGER")){
            completedOrder.addItem(new chickenburger());
        }
    }

    @Override
    public void sideitem(String sideItem) {
        if (sideItem.equalsIgnoreCase("FRIES")){
            completedOrder.addItem(new Fries());
        }
        else if(sideItem.equalsIgnoreCase("COLESLAW")){
            completedOrder.addItem(new Choleslaw());
        }

    }

    @Override
    public void drinks(String drinks) {
        if (drinks.equalsIgnoreCase("COKE")){
            completedOrder.addItem(new Coke());
        }
        else if(drinks.equalsIgnoreCase("MOUNTAINDEW")){
            completedOrder.addItem(new MountainDew());
        }
        else if(drinks.equalsIgnoreCase("SEVENUP")){
            completedOrder.addItem(new SevenUp());
        }

    }

    @Override
    public void toy(String toy) {
        if (toy.equalsIgnoreCase("DINOSAUR")){
            completedOrder.addItem(new Dinosaur());
        }
        else if(toy.equalsIgnoreCase("YoYo")){
            completedOrder.addItem(new YoYo());
        }
    }

    @Override
    public CompletedOrder GetMeal() {
        return completedOrder;
    }
}
