package main;

public class CareTaker2 {
    private Object savedState;

    public void saveState(OriginatorCareTaker2 originator){

        this.savedState = originator.getState();
    }

    public void restoreState(OriginatorCareTaker2 originator){

        originator.restoreState(savedState);
    }

}
