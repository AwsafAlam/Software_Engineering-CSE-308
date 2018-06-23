public interface Subject {
    public void register(Observer o);
    public void unsubscribe(Observer o);
    public void notifyObserver();
}
