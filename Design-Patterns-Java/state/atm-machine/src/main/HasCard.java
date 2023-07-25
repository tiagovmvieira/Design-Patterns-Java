package main;

public class HasCard implements ATMState{

    ATMMachine ATMMachine;

    public HasCard(ATMMachine theATMMachine){

        this.ATMMachine = theATMMachine;
    }

    @Override
    public void insertCard() {

        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {

        System.out.println("Card Ejected");
        ATMMachine.setATMState(ATMMachine.getNoCardState());
    }

    @Override
    public void insertPin(int thePin) {

        if(thePin == 1234){

            System.out.println("Correct PIN");
            ATMMachine.correctPinEntered = true;
            ATMMachine.setATMState(ATMMachine.getHasPin());
        } else {

            System.out.println("Wrong PIN");
            ATMMachine.correctPinEntered = false;
            System.out.println("Card Ejected");
            ATMMachine.setATMState(ATMMachine.getNoCardState());
        }

    }

    @Override
    public void requestCash(int theAmount) {

        System.out.println("Enter PIN First");
    }
}
