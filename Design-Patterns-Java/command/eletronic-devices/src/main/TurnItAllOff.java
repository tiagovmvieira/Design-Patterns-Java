package main;

import java.util.List;

public class TurnItAllOff implements CommandEletronic {

    List<EletronicDevice> theDevices;

    public TurnItAllOff(List<EletronicDevice> newDevices){

        this.theDevices = newDevices;
    }

    @Override
    public void execute() {

        for(EletronicDevice device : theDevices){
            device.off();
        }
    }

    @Override
    public void undo() {

        for(EletronicDevice device : theDevices){
            device.on();
        }
    }


}
