import java.util.ArrayList;

public class ConcreteSubject implements Subject {


    private ArrayList<Observer> observers;
    private String  message;


    @Override
    public void subscribe(Observer newObserver) {
        for (Observer o:observers) {
            if(o.StudentID() == newObserver.StudentID()){
                System.out.println("Student "+ newObserver.StudentID() + " Already exists\n" +
                                   "Request for subscription rejected ... \n" +
                                    "-------------------------------------\n" );
                return;
            }
        }

        observers.add(newObserver);
        System.out.println(" Added .. ");
    }

    @Override
    public void unsubscribe(int stdID) {
        for (Observer o:observers) {
            if(o.StudentID() == stdID){
                System.out.println("Student "+ stdID + " Unsubscribed" );
                observers.remove(o);
                return;
            }
        }
        System.out.println("Student "+stdID+" is not present in the subscriber list");

    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers) {
            o.update(message);
        }
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

}
