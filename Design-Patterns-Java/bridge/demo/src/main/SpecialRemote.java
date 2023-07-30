package main;

public class SpecialRemote extends RemoteControlBridge{

    public SpecialRemote(TVFactory tvfactory) {
        super(tvfactory);
    }

    public void up(){

        int channel = this.getChannel();
        this.setChannel(channel + 1);
    }

    public void down(){

        int channel = this.getChannel();
        this.setChannel(channel - 1);
    }

}
