package main;

public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count = 0;

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0){
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State theState){

        this.state = theState;
    }

    public void releaseBall(){

        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0){
            count--;
        }
    }

    public int getCount(){

        return count;
    }

    public void refill(int count){
        this.count = count;
        System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
        state.refill();
    }

    public State getState(){
        return state;
    }

    public State getSoldOutState(){

        return soldOutState;
    }

    public State getNoQuarterState(){

        return noQuarterState;
    }

    public State getHasQuarterState(){

        return hasQuarterState;
    }

    public State getSoldState(){

        return soldState;
    }

    public State getWinnerState(){

        return winnerState;
    }

    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1){
            result.append("s");
        }
        result.append("\nMachine is " + state + "\n");
        return result.toString();
    }

}
