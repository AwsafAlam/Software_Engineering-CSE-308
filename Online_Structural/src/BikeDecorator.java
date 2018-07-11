public class BikeDecorator implements Bike {
    protected Bike decorateBike;
    protected int AccPrice;

    public BikeDecorator(Bike decorateshape) {
        this.decorateBike = decorateshape;
        AccPrice = 0;
    }

    @Override
    public int price() {
        return decorateBike.price();
    }

    @Override
    public void buy() {
        decorateBike.buy();
    }
}
