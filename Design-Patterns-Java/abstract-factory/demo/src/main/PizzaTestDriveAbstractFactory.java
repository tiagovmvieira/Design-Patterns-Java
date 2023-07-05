package main;

public class PizzaTestDriveAbstractFactory {

    public static void main(String[] args){

        PizzaStoreAbstractFactory nyStore = new NYPizzaStoreAbstractFactory();
        PizzaStoreAbstractFactory chicagoStore = new ChicagoStoreAbstractFactory();

        PizzaAbstractFactoryPattern pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
