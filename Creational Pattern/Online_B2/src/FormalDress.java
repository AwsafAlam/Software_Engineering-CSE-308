public class FormalDress extends DressList implements Item {

    public static int FormalCount = 3;

    @Override
    public String Name() {
        return "Formal Set (Stirt , Pant)";
    }

    @Override
    public int Price() {
        return 600+700;
    }
}
