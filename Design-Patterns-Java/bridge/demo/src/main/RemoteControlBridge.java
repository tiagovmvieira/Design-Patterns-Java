package main;

public abstract class RemoteControlBridge {

    TVBridge tv;
    TVFactory tvfactory;
    public RemoteControlBridge(TVFactory tvfactory){

        this.tvfactory = tvfactory;
    }

    public void on(){

        this.tv.on();
    }

    public void off(){

        this.tv.off();
    }

    public void setChannel(int channel){

        tv.tuneChannel(channel);
    }

    public int getChannel(){

        return tv.getChannel();
    }

    public void setTV(String type){

        try {
            tv = tvfactory.getTV(type);
        } catch (Exception e){
            System.out.println(e);
        }

    }

}
