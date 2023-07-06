package main;

public class CaliforniaStoreAbstractFactory extends PizzaStoreAbstractFactory{

    @Override
    public PizzaAbstractFactoryPattern createPizza(String type) {

        PizzaAbstractFactoryPattern pizza;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("California Style Cheese Pizza");

                return pizza;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("California Style Clam Pizza");

                return pizza;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("California Style Pepperoni Pizza");

                return pizza;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("California Style Veggie Pizza");

                return pizza;
            default:
                return null;
        }

    }

}
