package main;

public class MainClass {

    public static void main(String[] args){
        OriginatorCareTaker2 originator = new OriginatorCareTaker2();
        originator.setStateDependentVar1("State Dependent Variable 1");
        originator.setStateDependentVar2("State Dependent Variable 2");
        originator.setStateLessVar1(100);
        originator.setStateLessVar2(200);

        CareTaker2 caretaker = new CareTaker2();
        caretaker.saveState(originator);

        System.out.println(originator);

        originator.setStateDependentVar1("State Dependent Variable 1 changed");

        System.out.println("Changed value " + originator);
        caretaker.restoreState(originator);

        System.out.println("Restored value " + originator);

    }

}
