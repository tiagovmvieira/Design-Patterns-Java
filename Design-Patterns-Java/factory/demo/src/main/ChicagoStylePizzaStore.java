package main;

public class ChicagoStylePizzaStore extends PizzaStore{


    @Override
    public PizzaFactoryPattern createPizza(String type) {

        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                return null;
        }

    }
}
