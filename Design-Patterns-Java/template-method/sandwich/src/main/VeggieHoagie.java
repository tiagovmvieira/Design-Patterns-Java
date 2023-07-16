package main;

public class VeggieHoagie extends Hoagie{

    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = { "Oil", "Vinegar" };

    @Override
    boolean customerWantsMeat() { return false; }

    @Override
    boolean customerWantsCheese() { return false; }

    @Override
    public void addMeat() { }

    @Override
    public void addCheese() { }

    @Override
    public void addVegetables() {

        System.out.println("Adding the Veggies: ");

        for(String vegetable: veggiesUsed){

            System.out.print(vegetable + " ");
        }

    }

    @Override
    public void addCondiments() {

        System.out.println("Adding the Condiments: ");

        for(String condiment: condimentsUsed){

            System.out.print(condiment + " ");
        }

    }

    public String toString(){

        return "Veggie Hoagie";
    }

}
