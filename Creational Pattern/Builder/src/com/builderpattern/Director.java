package com.builderpattern;


public class Director {

    private MealBuilder mealBuilder;
    private Order order;


    public CompletedOrder Construct(MealBuilder builder , Order order){

        this.mealBuilder = builder;
        this.order = order;

        System.out.println("Your order : \n"+order.getMainItem()+" "+order.getSideItem()+" "+order.getDrinks()+" "+order.getToy());
        System.out.println("-----------------------------------");

        if(!order.getMainItem().equalsIgnoreCase("HAMBURGER") &&
           !order.getMainItem().equalsIgnoreCase("CHICKENBURGER") &&
           !order.getMainItem().equalsIgnoreCase("CHEESEBURGER")){
            System.out.println("Main Item not available in Menu");
            return null;
        }
        else if(!order.getSideItem().equalsIgnoreCase("FRIES") &&
                !order.getSideItem().equalsIgnoreCase("COLESLAW")){
            System.out.println("Side Item not available in Menu");
            return null;
        }
        else if(!order.getDrinks().equalsIgnoreCase("COKE") &&
                !order.getDrinks().equalsIgnoreCase("MOUNTAINDEW") &&
                !order.getDrinks().equalsIgnoreCase("SEVENUP")) {
            System.out.println("Drink not available in Menu");
            return null;
        }
        else if(!order.getToy().equalsIgnoreCase("DINOSAUR") &&
                !order.getToy().equalsIgnoreCase("YOYO")){
            System.out.println("Toy not available in Menu");
            return null;
        }

        mealBuilder.mainitem(order.getMainItem());
        mealBuilder.sideitem(order.getSideItem());
        mealBuilder.drinks(order.getDrinks());
        mealBuilder.toy(order.getToy());

        return mealBuilder.GetMeal();
    }



}
