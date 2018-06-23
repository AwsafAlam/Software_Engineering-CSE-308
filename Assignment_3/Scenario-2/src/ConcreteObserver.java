public class ConcreteObserver implements Observer {

    private static int observerIDTracker = 0;

    private int ObserverID;

    private Subject subscriber;

    public ConcreteObserver(Subject sub) {
        this.subscriber = sub;
        this.ObserverID = ++observerIDTracker;
        System.out.print("New Student "+this.ObserverID);
        sub.subscribe(this);
    }

    public ConcreteObserver(Subject sub , int prevStdID) {
        this.subscriber = sub;
        if(prevStdID > observerIDTracker){
            System.out.println("Student has never subscribed before. assigning New ID :\n");
            this.ObserverID = ++observerIDTracker;
        }
        else {
            this.ObserverID = prevStdID;
        }
        System.out.println("Student "+this.ObserverID+" requesting subscription ...");
        sub.subscribe(this);
    }

    @Override
    public void update(String message) {
        System.out.println("[Student "+ObserverID+" ] : "+message);
    }

    @Override
    public int StudentID() {
        return ObserverID;
    }


}
