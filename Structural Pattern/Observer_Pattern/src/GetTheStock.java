import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    private int startTime;
    private String  stock;
    private double price;

    private Stockgrabber stockGrabber;

    public GetTheStock(int startTime, String stock, double price, Subject stockGrabber) {
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
        this.stockGrabber = (Stockgrabber) stockGrabber;
    }

    @Override
    public void run() {
        for(int i = 0 ; i< 20 ; i++){


            try{
                Thread.sleep(startTime * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            double randNum = (Math.random()* 0.60) - 0.03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format(price + randNum));

            if(stock == "IBM"){
                stockGrabber.setIbmPrice(price);
            }
            else if (stock == "Google"){
                stockGrabber.setIbmPrice(price);
            }
        }
    }
}
