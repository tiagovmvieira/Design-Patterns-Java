package main;

public class ChicagoStoreAbstractFactory extends PizzaStoreAbstractFactory{

    @Override
    public PizzaAbstractFactoryPattern createPizza(String type) {

        PizzaAbstractFactoryPattern pizza;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");

                return pizza;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");

                return pizza;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");

                return pizza;

            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");

                return pizza;
            default:
                return null;
        }

    }

}
