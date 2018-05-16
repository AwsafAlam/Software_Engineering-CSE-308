public class Wallet implements Item {

    public static int WalletCount = 2;


    @Override
    public String Name() {
        return "Wallet";
    }

    @Override
    public int Price() {
        return 200;
    }
}
