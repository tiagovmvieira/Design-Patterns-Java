package main;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler();
        }

        return uniqueInstance;
    }

    public void fill(){
        if (isEmpty()) {
            empty = false;
            boiled = false;

            System.out.println("Filling the boiler with a milk/chocolate mixture");
        }

    }

    public void drain(){
        if (!isEmpty() && isBoiled()) {
            System.out.println("Draining the boiled milk and chocolate");

            empty = true;
        }

    }

    public void boil(){
        if (!isEmpty() & !isBoiled()) {
            System.out.println("Bringing the contents to a boil");

            boiled = true;
        }
    }

    public boolean isEmpty(){

        return empty;
    }

    public boolean isBoiled(){

        return boiled;
    }

    public String toString(){

        return "I do exist and I am unique!";
    }

}
