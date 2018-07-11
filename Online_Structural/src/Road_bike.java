public class Road_bike implements Bike {
    @Override
    public int price() {
        return 200;
    }

    @Override
    public void buy() {
        System.out.print("Road Bike ||");
    }
}
