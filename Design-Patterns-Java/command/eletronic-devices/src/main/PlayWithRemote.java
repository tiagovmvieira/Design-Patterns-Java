package main;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

    public static void main(String[] args){

        EletronicDevice newDevice = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        TurnTVOff offCommand = new TurnTVOff(newDevice);
        DeviceButton offPressed = new DeviceButton(offCommand);
        offPressed.press();

        TurnTVUp volUpCommand = new TurnTVUp(newDevice);
        DeviceButton upPressed = new DeviceButton(volUpCommand);
        upPressed.press();
        upPressed.press();
        upPressed.press();

        Television theTV = new Television();
        Radio theRadio = new Radio();

        List<EletronicDevice> allDevices = new ArrayList<EletronicDevice>();
        allDevices.add(theTV);
        allDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();

        turnThemOff.pressUndo();
    }

}
