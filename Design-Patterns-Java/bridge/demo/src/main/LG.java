package main;

public class LG extends TVBridge{

    int channel = 1;

    @Override
    public void on() {

        System.out.println("Turning on the LG TV");
    }

    @Override
    public void off() {

        System.out.println("Turning off the LG TV");
    }

    @Override
    public void tuneChannel(int channel) {
        this.channel = channel;
        System.out.println("Set the LG TV Channel to " + getChannel());

    }

    @Override
    public int getChannel() {
        return channel;
    }
}
