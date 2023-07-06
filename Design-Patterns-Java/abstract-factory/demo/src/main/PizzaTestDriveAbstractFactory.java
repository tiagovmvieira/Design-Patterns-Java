package main;

public class PizzaTestDriveAbstractFactory {

    public static void main(String[] args){

        PizzaStoreAbstractFactory nyStore = new NYPizzaStoreAbstractFactory();
        PizzaStoreAbstractFactory chicagoStore = new ChicagoStoreAbstractFactory();
        PizzaStoreAbstractFactory californiaStore = new CaliforniaStoreAbstractFactory();

        PizzaAbstractFactoryPattern pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("cheese");
        System.out.println("Mike ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("cheese");
        System.out.println("Mike ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("clam");
        System.out.println("Mike ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("pepperoni");
        System.out.println("Mike ordered a " + pizza.getName() + "\n");

    }
}
