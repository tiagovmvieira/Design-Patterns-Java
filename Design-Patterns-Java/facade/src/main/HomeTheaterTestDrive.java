package main;

public class HomeTheaterTestDrive {

    public static void main(String[] args){

        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();

    }

}
