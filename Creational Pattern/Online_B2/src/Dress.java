public class Dress implements DressBuilder {

    private DressList list;
    private boolean CanBuy;

    public Dress(){
        this.list = new DressList();
        CanBuy = true;
    }

    @Override
    public void addDress(int type) {
        if(type == 1 && FormalDress.FormalCount!=0){
            list.add(new FormalDress());
            FormalDress.FormalCount--;
        }
        else if(type == 2 && CasualDress.CasualCOunt != 0){
            list.add(new CasualDress());
            CasualDress.CasualCOunt--;
        }
        else if(type == 1 && FormalDress.FormalCount==0){
            CanBuy = false;
            System.out.println("Out of items");
        }
        else if(type == 2 && CasualDress.CasualCOunt==0){
            CanBuy = false;
            System.out.println("Out of items");
        }

    }

    @Override
    public void addWallet(int wallet) {
        if(wallet == 1 && Wallet.WalletCount!= 0 && CanBuy) {

            list.add(new Wallet());
            Wallet.WalletCount--;
        }
    }

    @Override
    public void addSmartWatch(int watch) {
        if(watch == 1 && SmartWatch.WatchCount!=0 && CanBuy) {
            list.add(new SmartWatch());
            SmartWatch.WatchCount--;
        }
    }

    @Override
    public DressList getDress() {
        return list;
    }
}
