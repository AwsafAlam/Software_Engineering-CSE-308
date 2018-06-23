package Drinks;

public class CocaCola implements SoftDrinks {

    public static int getPrice() {
        return Price;
    }

    private static int Price = 30;

    @Override
    public String Name() {
       return "Coca-Cola";
    }

    @Override
    public int Price() {
        return Price;
    }

}
