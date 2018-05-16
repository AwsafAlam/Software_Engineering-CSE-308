public class SmartWatch implements Item {

    public static int WatchCount = 2;


    @Override
    public String Name() {
        return "Smart Watch";
    }

    @Override
    public int Price() {
        return 500;
    }
}
