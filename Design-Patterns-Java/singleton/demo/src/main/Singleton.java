package main;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {};

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    public String toString(){

        return "I do exist, and I am unique!";
    }

}
