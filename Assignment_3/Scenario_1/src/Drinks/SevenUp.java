package Drinks;

public class SevenUp implements SoftDrinks {


    public static int getPrice() {
        return Price;
    }

    private static int Price = 35;

    @Override
    public String Name() {
        return "SevenUp";
    }

    @Override
    public int Price() {
        return Price;
    }

}
