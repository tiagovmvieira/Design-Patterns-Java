package main;

public abstract class PizzaStoreAbstractFactory {

    public final PizzaAbstractFactoryPattern orderPizza(String type){

        PizzaAbstractFactoryPattern pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    public abstract PizzaAbstractFactoryPattern createPizza(String type);

}
