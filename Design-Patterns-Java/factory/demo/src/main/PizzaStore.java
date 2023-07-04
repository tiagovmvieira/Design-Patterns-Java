package main;

public abstract class PizzaStore {

    public final PizzaFactoryPattern orderPizza(String type){

        PizzaFactoryPattern pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    public abstract PizzaFactoryPattern createPizza(String type);

}
