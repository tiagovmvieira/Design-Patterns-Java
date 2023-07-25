package main;

public class HasPin implements ATMState{

    ATMMachine ATMMachine;

    public HasPin(ATMMachine theATMMachine){

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

        System.out.println("Already Entered PIN");
    }

    @Override
    public void requestCash(int theAmount) {

        if(theAmount > ATMMachine.cashInMachine){

            System.out.println("Don't Have that Cash");
            System.out.println("Card Ejected");
            ATMMachine.setATMState(ATMMachine.getNoCardState());
        } else {

            System.out.println(theAmount + " is provided by the machine");
            ATMMachine.setCashInMachine(ATMMachine.cashInMachine - theAmount);

            System.out.println("Card Ejected");
            ATMMachine.setATMState(ATMMachine.getNoCashState());

            if(ATMMachine.cashInMachine < theAmount){

                ATMMachine.setATMState(ATMMachine.getNoCashState());
            }
        }
    }
}
