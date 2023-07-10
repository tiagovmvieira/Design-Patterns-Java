package main;

public class TurnTVOff implements CommandEletronic {

    EletronicDevice theDevice;

    public TurnTVOff(EletronicDevice newDevice){

        this.theDevice = newDevice;
    }

    @Override
    public void execute() {

        theDevice.off();
    }

    @Override
    public void undo() {

        theDevice.on();
    }

}
