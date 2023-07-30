package main;

public class DVDDevice extends EntertainmentDevice {

    public DVDDevice(int newDeviceState, int newMaxSetting){

        this.deviceState = newDeviceState;
        this.maxSetting = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {

        System.out.println("DVD Skips to Chapter");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {

        System.out.println("DVD Skips to Next Chapter");
        deviceState++;
    }

}
