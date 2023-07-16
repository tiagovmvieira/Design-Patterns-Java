package main;

public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {

        System.out.println("Stepping the tea");
    }

    @Override
    public void addCondiments() {

        System.out.println("Adding Lemon");
    }

}
