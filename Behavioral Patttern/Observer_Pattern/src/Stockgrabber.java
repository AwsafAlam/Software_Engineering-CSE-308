import java.util.ArrayList;

public class Stockgrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double googlePrice;


    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unsubscribe(Observer o) {
        int idx = observers.indexOf(o);
        System.out.println("Observer "+ (idx+1) + " deleted" );
        observers.remove(idx);
    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers) {
            o.update(ibmPrice , googlePrice);
        }
    }

    public double getIbmPrice() {
        return ibmPrice;
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
    }

    public double getGooglePrice() {
        notifyObserver();
        return googlePrice;
    }

    public void setGooglePrice(double googlePrice) {
        notifyObserver();
        this.googlePrice = googlePrice;
    }

    public Stockgrabber() {
        this.observers = new ArrayList<>();
    }

}
