package main;

import java.text.DecimalFormat;
public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private SubjectStockMarket stockGrabber;

    public GetTheStock(SubjectStockMarket stockGrabber, int newStartTime, String newStock,
                       double newPrice){

        this.stockGrabber = stockGrabber;

        startTime = newStartTime;
        stock = newStock;
        price = newPrice;

    }

    @Override
    public void run() {

        for(int i = 1; i <= 20; i++){

            try{

                Thread.sleep(startTime * 1000);
            }
            catch(InterruptedException e){}

            double randNum = (Math.random() * (.06)) - 0.03;

            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.valueOf(df.format(price + randNum));

            if (stock == "IBM"){

                // Cast, cause Subject interface has not setIBMPrice
                ((StockGrabber)stockGrabber).setIBMPrice(price);
            }

            if (stock == "AAPL"){

                // Cast, cause Subject interface has not setAAPLPrice
                ((StockGrabber)stockGrabber).setAAPLPrice(price);
            }

            if (stock == "GOOG"){

                // Cast, cause Subject interface has not setGOOGPrice
                ((StockGrabber)stockGrabber).setIBMPrice(price);
            }

            System.out.println(stock + ": " + df.format((price + randNum)) +
                    " " + df.format(randNum));

            System.out.println();
        }
    }
}
