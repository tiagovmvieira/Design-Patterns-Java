package main;

public class TestSingleton {

    public static void main(String[] args){

        Singleton singleInstance = Singleton.getInstance();
        System.out.println(singleInstance);


    }
}
