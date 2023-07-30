package main;

public class Sony extends TVBridge{
    int station = 0;

    @Override
    public void on() {
        System.out.println("Turning on the Sony TV");
    }

    @Override
    public void off() {
        System.out.println("Turning off the Sony TV");
    }

    @Override
    public void tuneChannel(int channel) {
        this.station = channel;
        System.out.println("Set the Sony TV station to " + this.station);
    }

    @Override
    public int getChannel() {
        return station;
    }

}
