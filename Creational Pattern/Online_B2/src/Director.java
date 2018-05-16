public class Director {

    private DressBuilder dbuilder;


    public DressList Construct(DressBuilder dressBuilder , int type , int wallet , int watch) {

        dbuilder = dressBuilder;

        if(type == 1 || type == 2)
        {
            dbuilder.addDress(type);
        }
        else {
            System.out.println("Invalid Type");
        }
        dbuilder.addWallet(wallet);
        dbuilder.addSmartWatch(watch);

        return dbuilder.getDress();

    }
}
