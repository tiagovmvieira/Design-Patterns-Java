package main;

public abstract class TVBridge {

    public abstract void on();
    public abstract void off();
    public abstract void tuneChannel(int channel);
    public abstract int getChannel();

}
