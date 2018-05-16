package com.builderpattern;

import java.util.Scanner;

public class EmployeeExecute {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Meal order");
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu : ( Order Children's Meal)\n " +
                            "----\n\n" +
                "Main Item :\n" +
                "------------\n" +
                "1. HamBurger\n" +
                "2. Chicken Burger\n" +
                "3. Cheese Burger\n\n" +
                "Side Item : \n" +
                "------------\n" +
                "1. Fries\n" +
                "2. Choleslaw\n\n" +
                "Drinks : \n" +
                "--------\n" +
                "1. Coke\n" +
                "2. Mountain Dew\n" +
                "3. SevenUp\n\n" +
                "Toys : \n" +
                "-------\n" +
                "1. Dinosaur\n" +
                "3. Yoyo\n" +
                "---------------------------\n" +
                "Please order the items of your choosing from the Menu(Main - Side - Drinks - Toy)\n");

        String Mainitem = sc.nextLine();
        String Sideitem = sc.nextLine();
        String Drinks = sc.nextLine();
        String Toy = sc.nextLine();

        Mainitem = Mainitem.replaceAll("\\s","");
        Sideitem = Sideitem.replaceAll("\\s","");
        Drinks = Drinks.replaceAll("\\s","");
        Toy = Toy.replaceAll("\\s","");


        Director director = new Director();

        Order order = new Order();

        order.setMainItem(Mainitem);
        order.setSideItem(Sideitem);
        order.setDrinks(Drinks);
        order.setToy(Toy);

        MealBuilder children_meal = new Children_Meal();

        CompletedOrder meal = director.Construct(children_meal , order);
        if (meal!= null) {
            meal.Show();
        }

        System.out.println("-----------------------------\n");

    }
}
