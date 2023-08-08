package main;

// This is the class that has some data that we need to save for state restoration
public class OriginatorCareTaker2 {

    // Instance variables that don't need to be restored
    private int stateLessVar1, stateLessVar2;

    // Instance variables that need to be restored
    private String stateDependentVar1, stateDependentVar2;

    public void setStateLessVar1(int stateLessVar1){

        this.stateLessVar1 = stateLessVar1;
    }

    public void setStateLessVar2(int stateLessVar2){

        this.stateLessVar2 = stateLessVar2;
    }

    public void setStateDependentVar1(String stateDependentVar1){

        this.stateDependentVar1 = stateDependentVar1;
    }

    public void setStateDependentVar2(String stateDependentVar2){

        this.stateDependentVar2 = stateDependentVar2;
    }

    public Memento getState(){

        return new Memento(this.stateDependentVar1, this.stateDependentVar2);
    }

    // Should always be of type Object
    public void restoreState(Object object){

        Memento memento = (Memento) object; // cast to memento
        this.stateDependentVar1 = memento.stateDependentVar1;
        this.stateDependentVar2 = memento.stateDependentVar2;
    }

    public String toString(){
        return "Originator {" +
                "stateLessVar1=" + stateLessVar1 +
                ", stateLessVar2=" + stateLessVar2 +
                ", stateDependencyVar1='" + stateDependentVar1 + '\'' +
                ", stateDependentVar2='" + stateDependentVar2 + '\'' +
                '}';
    }

    private class Memento{
        // Contains only those variables from Originator class
        // which needs to be restored
        String stateDependentVar1, stateDependentVar2;

        public Memento(String stateDependentVar1, String stateDependentVar2){
            this.stateDependentVar1 = stateDependentVar1;
            this.stateDependentVar2 = stateDependentVar2;
        }

    }

}
