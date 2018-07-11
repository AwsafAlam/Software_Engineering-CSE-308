package Accessories;

public class Horn implements Accessory {
    @Override
    public int Price() {
        return 15;
    }

    @Override
    public String Name() {
        return "Horn";
    }
}
