package main;

public class NYPizzaStoreAbstractFactory extends PizzaStoreAbstractFactory{

    @Override
    public PizzaAbstractFactoryPattern createPizza(String type) {

        PizzaAbstractFactoryPattern pizza;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");

                return pizza;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");

                return pizza;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");

                return pizza;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");

                return pizza;
            default:
                return null;
        }

    }

}
