package main;

public class ATMMachine {

    ATMState atmState;
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {

        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasPin(this);
        this.atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if(cashInMachine < 0){
            atmState = atmOutOfMoney;
        }

    }

    public void setATMState(ATMState theState){

        this.atmState = theState;
    }

    public void setCashInMachine(int newCashInMachine){

        cashInMachine = newCashInMachine;
    }

    public void insertCard(){

        atmState.insertCard();
    }

    public void ejectCard(){

        atmState.ejectCard();
    }

    public void insertPin(int ThePin){

        atmState.insertPin(ThePin);
    }

    public void requestCash(int theAmount){

        atmState.requestCash(theAmount);
    }

    public ATMState getYesCardState() { return hasCard; }
    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasPin() { return hasCorrectPin; }
    public ATMState getNoCashState() { return atmOutOfMoney; }
}

