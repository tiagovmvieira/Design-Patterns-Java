package main;

public class TestATMMachine {

    public static void main(String[] args){

        ATMMachine theATMMachine = new ATMMachine();

        theATMMachine.insertCard();

        theATMMachine.ejectCard();

        theATMMachine.insertCard();

        theATMMachine.insertPin(1234);

        theATMMachine.requestCash(2000);

        theATMMachine.insertCard();

        theATMMachine.insertPin(1234);

    }
}
