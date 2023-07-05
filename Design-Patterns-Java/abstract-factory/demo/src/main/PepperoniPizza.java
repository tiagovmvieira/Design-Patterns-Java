package main;

public class PepperoniPizza extends PizzaAbstractFactoryPattern{

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory){

        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){

        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();

    }

}
