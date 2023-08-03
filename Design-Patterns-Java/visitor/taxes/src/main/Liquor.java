package main;

public class Liquor implements Visitable{

    private double price;

    public Liquor(double itemPrice){

        price = itemPrice;
    }

    public double getPrice(){

        return price;
    }

    @Override
    public double accept(Visitor visitor) {

        return visitor.visit(this);
    }

}
