package main;

public class TurnTVDown implements CommandEletronic {

    EletronicDevice theDevice;

    public TurnTVDown(EletronicDevice newDevice){

        this.theDevice = newDevice;
    }

    @Override
    public void execute() {

        theDevice.volumeDown();
    }

    @Override
    public void undo() {

        theDevice.volumeUp();
    }

}
