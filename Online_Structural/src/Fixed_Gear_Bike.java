public class Fixed_Gear_Bike implements Bike {
    @Override
    public int price() {
        return 150;
    }

    @Override
    public void buy() {
        System.out.print("Fixed_Gear_Bike || ");
    }
}
