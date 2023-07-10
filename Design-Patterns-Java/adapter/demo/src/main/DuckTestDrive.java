package main;

public class DuckTestDrive {

    public static void main(String[] args){

        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);
    }

    private static void testDuck(Duck duck){

        duck.quack();
        duck.fly();
    }

    private static void testTurkey(Turkey turkey){

        turkey.gobble();
        turkey.fly();
    }


}
