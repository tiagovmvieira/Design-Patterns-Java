package main;

public class BridgeTestDrive {
    public static void main(String[] args){

        TVFactory tvFactory = new TVFactory();
        SpecialRemote remoteSony = new SpecialRemote(tvFactory);
        System.out.println("Connect your remote to the TV");
        remoteSony.setTV("Sony");
        remoteSony.on();
        remoteSony.up();
        remoteSony.down();
        remoteSony.off();

        System.out.println();

        GenericRemote remoteLG = new GenericRemote(tvFactory);
        System.out.println("Connect your remote to the TV");
        remoteLG.setTV("LG");
        remoteLG.on();
        remoteLG.nextChannel();
        remoteLG.prevChannel();
        remoteLG.off();

    }

}
