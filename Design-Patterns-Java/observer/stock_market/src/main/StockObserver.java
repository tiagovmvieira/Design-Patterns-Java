package main;

public class StockObserver implements ObserverStockMarket {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private SubjectStockMarket stockGrabber;

    public StockObserver(SubjectStockMarket stockMarket){

        this.stockGrabber = stockMarket;
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer" + this.observerID);

        stockGrabber.register(this);

    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    public void printThePrices(){

        System.out.println(observerID + "\nIBM: " + ibmPrice +
                "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
    }

}
