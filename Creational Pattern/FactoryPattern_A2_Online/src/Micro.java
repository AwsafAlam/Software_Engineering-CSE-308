public class Micro implements Vehicle {
    @Override
    public void showPrice() {
        System.out.println("Please pay $"+1000+" to confirm your ride");
    }

    @Override
    public boolean matchPrice(int amount) {

        return true;
    }
}
