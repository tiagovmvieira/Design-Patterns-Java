package main;

public class TurnTVOn implements CommandEletronic {

    EletronicDevice theDevice;

    public TurnTVOn(EletronicDevice newDevice){

        this.theDevice = newDevice;
    }

    @Override
    public void execute() {

        theDevice.on();
    }

    @Override
    public void undo() {

        theDevice.off();
    }

}
