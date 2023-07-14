package main;

public class HomeTheaterTestDrive {

    public static void main(String[] args){

        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        Projector projector = new Projector("Projector", player);
        Screen screen = new Screen("Theater Screen");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        System.out.println();
        homeTheater.endMovie();

    }

}
