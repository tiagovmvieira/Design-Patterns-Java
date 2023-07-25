package main;

public class NoCard implements ATMState{

    ATMMachine ATMMachine;

    public NoCard(ATMMachine theATMMachine){

        this.ATMMachine = theATMMachine;
    }

    @Override
    public void insertCard() {

        System.out.println("Please Enter a PIN");
        ATMMachine.setATMState(ATMMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {

        System.out.println("Enter a card first");
    }

    @Override
    public void insertPin(int thePin) {

        System.out.println("Enter a card first");
    }

    @Override
    public void requestCash(int theAmount) {

        System.out.println("Enter a card first");
    }
}
