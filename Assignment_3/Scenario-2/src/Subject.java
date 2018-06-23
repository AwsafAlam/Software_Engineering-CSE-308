public interface Subject {
    public void subscribe(Observer o);
    public void unsubscribe(int studentID);
    public void notifyObserver();

}
