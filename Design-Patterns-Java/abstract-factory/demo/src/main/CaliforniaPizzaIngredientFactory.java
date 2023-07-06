package main;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Veggies[] createVeggies() {

        // fixed-length, reason why it is an array
        Veggies veggies[] = {
                new Tomato(),
                new Eggplant(),
                new Mushrooms(),
                new BlackOlives()
        };

        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
