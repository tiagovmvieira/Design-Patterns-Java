package main;

public class ChicagoStyleCheesePizza extends PizzaFactoryPattern {


    public ChicagoStyleCheesePizza(){

        name = "Chicago Style Deep Dish Chesse Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");

    }

    public void cut(){

        System.out.println("Cutting the pizza into square slices");

    }

}
