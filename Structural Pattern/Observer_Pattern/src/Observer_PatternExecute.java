public class Observer_PatternExecute {
    public static void main(String[] args) {
        System.out.println("Hello");
        Stockgrabber stockgrabber = new Stockgrabber();

        StockObserver ob1 = new StockObserver(stockgrabber);

        stockgrabber.setIbmPrice(198.26);
        stockgrabber.setGooglePrice(100.3);

        StockObserver ob2 = new StockObserver(stockgrabber);

        stockgrabber.setIbmPrice(298.26);
        stockgrabber.setGooglePrice(30.3);

        stockgrabber.unsubscribe(ob1);

        Runnable getIBM = new GetTheStock(2, "IBM" , 197.00 , stockgrabber);
        Runnable getGoogle = new GetTheStock(2, "Google" , 197.00 , stockgrabber);

        new Thread(getIBM).start();
        new Thread(getGoogle).start();

    }
}
