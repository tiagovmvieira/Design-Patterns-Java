package main;

import java.util.ArrayList;

public class VisitorTestDrive {

    public static void main(String[] args){
        CricketBat britanniaCricketBat = new CricketBat(100, "Britannia");
        CricketBall britanniaCricketBall = new CricketBall(80, "Britannia");
        VolleyBall mrfVolleyBall = new VolleyBall(200, "MRF");

        ArrayList<IShoppingElement> products = new ArrayList<>();
        products.add(britanniaCricketBat);
        products.add(britanniaCricketBall);
        products.add(mrfVolleyBall);

        ArrayList<Double> discountedPrices = getDiscountedPrices(products);
        for(int i = 0; i < discountedPrices.size(); i++){

            System.out.println("Discounted price for " + products.get(i) + " is " + discountedPrices.get(i));
        }

    }

    public static ArrayList<Double> getDiscountedPrices(ArrayList<IShoppingElement> products){
        ArrayList<Double> discountedPrices = new ArrayList<>();

        IVisitor visitor = new VisitorImpl();

        for(int i = 0; i < products.size(); i++){

            double discountedPrice = products.get(i).accept(visitor);
            discountedPrices.add(discountedPrice);
        }

        return discountedPrices;
    }

}
