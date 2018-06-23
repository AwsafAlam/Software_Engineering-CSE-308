package Drinks;

public class MountainDew implements SoftDrinks {

    public static int getPrice() {
        return Price;
    }

    private static int Price = 32;


    @Override
    public String Name() {
        return "Mountain Dew";
    }

    @Override
    public int Price() {
        return Price;
    }

}
