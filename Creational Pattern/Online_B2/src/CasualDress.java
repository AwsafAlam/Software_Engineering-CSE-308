public class CasualDress extends DressList implements Item {

    public static int CasualCOunt = 3;

    @Override
    public String Name() {
        return "Casual Set (T-Shirt , Jeans)";
    }

    @Override
    public int Price() {
        return 100+300;
    }
}
