package main;

public class AirTrafficTestDrive {

    public static void main(String[] args){

        MediatorAirTraffic mediatorAirTraffic = new MediatorAirTraffic();
        UserImpl airbus380 = new UserImpl(mediatorAirTraffic, "AirbusA380");
        UserImpl boeing777 = new UserImpl(mediatorAirTraffic, "Boeing777");
        UserImpl embraer170 = new UserImpl(mediatorAirTraffic, "embraer170");

        mediatorAirTraffic.addUser(airbus380);
        mediatorAirTraffic.addUser(boeing777);
        mediatorAirTraffic.addUser(embraer170);

        airbus380.sendMessage("Landing! Over");
    }

}
