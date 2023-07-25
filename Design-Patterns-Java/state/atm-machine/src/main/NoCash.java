package main;

public class NoCash implements ATMState{

    ATMMachine ATMMachine;

    public NoCash(ATMMachine theATMMachine){

        this.ATMMachine = theATMMachine;
    }

    @Override
    public void insertCard() {

        System.out.println("We Don't Have Money!");
    }

    @Override
    public void ejectCard() {

        System.out.println("We Don't Have Money! You didn't enter a card");
    }

    @Override
    public void insertPin(int thePin) {

        System.out.println("We Don't Have Money!");
    }

    @Override
    public void requestCash(int theAmount) {

        System.out.println("We Don't Have Money!");
    }

}
