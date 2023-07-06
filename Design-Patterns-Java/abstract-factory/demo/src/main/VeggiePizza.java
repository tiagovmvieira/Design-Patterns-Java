package main;

public class VeggiePizza extends PizzaAbstractFactoryPattern {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory){

        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();

        System.out.print("Preparing " + name + "..." + " Dough -> " + dough +
                ", Sauce -> " + sauce + ", Cheese -> "+ cheese + ", Veggies -> ");

        for (int i = 0; i < veggies.length; i++) {
            System.out.print(veggies[i]);
            if (i != veggies.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

    }

}
