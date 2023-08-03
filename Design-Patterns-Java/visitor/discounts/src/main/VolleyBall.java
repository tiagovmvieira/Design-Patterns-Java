package main;

public class VolleyBall implements IShoppingElement{

    private double itemPrice;
    private String brand;

    public VolleyBall(double itemPrice, String brand){

        this.itemPrice = itemPrice;
        this.brand = brand;
    }

    public double getItemPrice() { return itemPrice; }
    public String getBrand() { return brand; }

    @Override
    public double accept(IVisitor visitor) {

        return visitor.visitor(this);
    }

    public String toString(){

        return "Volley Ball";
    }

}
