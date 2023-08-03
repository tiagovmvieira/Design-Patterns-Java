package main;

public class Tobacco implements Visitable{

    private double price;

    public Tobacco(double itemPrice){

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
