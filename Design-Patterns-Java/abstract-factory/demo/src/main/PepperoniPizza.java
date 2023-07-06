package main;

public class PepperoniPizza extends PizzaAbstractFactoryPattern{

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory){

        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();

        System.out.print("Preparing " + name + "..." + " Dough -> " + dough +
                ", Sauce -> " + sauce + ", Cheese -> "+ cheese + ", Pepperoni -> " + pepperoni
                 + ", Veggies -> ");

        for (int i = 0; i < veggies.length; i++) {
            System.out.print(veggies[i]);
            if (i != veggies.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

    }

}
