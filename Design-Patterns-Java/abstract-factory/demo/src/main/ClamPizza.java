package main;

public class ClamPizza extends PizzaAbstractFactoryPattern{

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){

        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }


    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClam();

        System.out.println("Preparing " + name + "..." + " Dough -> " + dough +
                            ", Sauce -> " + sauce + ", Cheese -> " + cheese + ", Clam -> " + clam);

    }
}
