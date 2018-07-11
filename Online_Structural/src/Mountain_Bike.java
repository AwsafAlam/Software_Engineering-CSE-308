public class Mountain_Bike implements Bike {
    @Override
    public int price() {
        return 300;
    }

    @Override
    public void buy() {
        System.out.print("Mountain Bike || ");
    }
}
