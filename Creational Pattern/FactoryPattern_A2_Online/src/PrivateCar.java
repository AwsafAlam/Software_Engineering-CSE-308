public class PrivateCar implements Vehicle {
    @Override
    public void showPrice() {
        System.out.println("Please pay $"+650+" to confirm your ride");

    }

    @Override
    public boolean matchPrice(int amount) {
        return false;
    }
}
