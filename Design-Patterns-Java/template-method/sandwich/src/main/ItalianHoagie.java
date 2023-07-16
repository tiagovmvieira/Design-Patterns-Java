package main;

public class ItalianHoagie extends Hoagie {

    String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = { "Provolone" };
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = { "Oil", "Vinegar" };

    @Override
    public void addMeat() {

        System.out.println("Adding the Meat: ");

        for(String meat: meatUsed){

            System.out.print(meat + " ");
        }

    }

    @Override
    public void addCheese() {

        System.out.println("Adding the Cheese: ");

        for(String cheese: cheeseUsed){

            System.out.print(cheese + " ");
        }

    }

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

        return "Italian Hoagie";
    }

}
