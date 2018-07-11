package Accessories;

public class Basket implements Accessory {
    @Override
    public int Price() {
        return 25;
    }

    @Override
    public String Name() {
        return "Basket";
    }
}
