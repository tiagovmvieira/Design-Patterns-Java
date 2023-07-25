package main;

public interface ATMState {

    public void insertCard();
    public void ejectCard();
    public void insertPin(int thePin);
    public void requestCash(int theAmount);

}
