package main;

public class Necessity implements Visitable{

    private double price;

    public Necessity(double itemPrice){

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
