package main;

public class GenericRemote extends RemoteControlBridge{

    public GenericRemote(TVFactory tvfactory) {
        super(tvfactory);
    }

    public void nextChannel(){

        int channel = this.getChannel();
        this.setChannel(channel + 1);
    }

    public void prevChannel(){

        int channel = this.getChannel();
        this.setChannel(channel - 1);
    }

}
