package main;

public class DeviceButton {

    CommandEletronic theCommand;

    public DeviceButton(CommandEletronic newCommand){

        this.theCommand = newCommand;
    }

    public void press(){

        theCommand.execute();
    }

    public void pressUndo(){

        theCommand.undo();
    }

}
