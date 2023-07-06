package main;

public class CheesePizza extends PizzaAbstractFactoryPattern{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){

        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
        veggies = ingredientFactory.createVeggies();

        System.out.println("Preparing " + name + "..." + " Dough -> " + dough +
                            ", Sauce -> " + sauce + ", Cheese -> " + cheese + ", Clam -> " + clam +
                            ", Veggies -> " + veggies[0]);

    }
}
