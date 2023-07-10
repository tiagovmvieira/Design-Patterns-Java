package main;

public class TurnTVUp implements CommandEletronic {

    EletronicDevice theDevice;

    public TurnTVUp(EletronicDevice newDevice){

        this.theDevice = newDevice;
    }

    @Override
    public void execute() {

        theDevice.volumeUp();
    }

    @Override
    public void undo() {

        theDevice.volumeDown();
    }

}
