package main;

public class VisitorImpl implements IVisitor{

    private double finalPrice;

    @Override
    public double visitor(CricketBall cricketBall) {
        finalPrice = cricketBall.getItemPrice();

        if (cricketBall.getBrand() == "MRF"){

            finalPrice = 0.9 * finalPrice;
        } else if (cricketBall.getBrand() == "Britannia"){

            finalPrice = 0.88 * finalPrice;
        } else {

            finalPrice = 0.95 * finalPrice;
        }

        return finalPrice;
    }

    @Override
    public double visitor(CricketBat cricketBat) {
        finalPrice = cricketBat.getItemPrice();

        if (cricketBat.getBrand() == "MRF"){

            finalPrice = 0.85 * finalPrice;
        } else if (cricketBat.getBrand() == "Britannia"){

            finalPrice = 0.70 * finalPrice;
        } else {

            finalPrice = 0.90 * finalPrice;
        }

        return finalPrice;
    }

    @Override
    public double visitor(VolleyBall volleyBall) {
        finalPrice = volleyBall.getItemPrice();

        if (volleyBall.getBrand() == "MRF"){

            finalPrice = 0.85 * finalPrice;
        } else if (volleyBall.getBrand() == "Britannia"){

            finalPrice = 0.70 * finalPrice;
        } else {

            finalPrice = 0.90 * finalPrice;
        }

        return finalPrice;
    }

}
