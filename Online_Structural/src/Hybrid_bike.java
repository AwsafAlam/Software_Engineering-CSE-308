public class Hybrid_bike implements Bike {
    @Override
    public int price() {
        return 250;
    }

    @Override
    public void buy() {
        System.out.print("Hybrid Bike || ");
    }
}
