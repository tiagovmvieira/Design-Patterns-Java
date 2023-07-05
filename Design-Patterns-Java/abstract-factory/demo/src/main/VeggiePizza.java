package main;

public class VeggiePizza extends PizzaAbstractFactoryPattern {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory){

        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){

        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }

}
