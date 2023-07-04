package main;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    public PizzaFactoryPattern createPizza(String type) {

        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            default:
                return null;
        }

    }

}
