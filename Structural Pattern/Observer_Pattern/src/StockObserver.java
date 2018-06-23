public class StockObserver implements Observer {

    private double ibmPrice;
    private double googlePrice;

    private static int observerIDTracker = 0;

    private int ObserverID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.ObserverID = ++observerIDTracker;
        System.out.println("New Student "+this.ObserverID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmprice, double googleprice) {
        this.ibmPrice = ibmprice;
        this.googlePrice = googleprice;
        PrintPrices();
    }

    public void PrintPrices(){
        System.out.println(ObserverID+"\nIBM : "+ibmPrice
        +"\ngooglePrice : "+googlePrice);
    }
}
