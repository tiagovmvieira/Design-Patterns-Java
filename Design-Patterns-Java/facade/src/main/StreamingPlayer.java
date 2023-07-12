package main;

public class StreamingPlayer {
    String description;
    String movie;
    Amplifier amp;

    public StreamingPlayer(String description, Amplifier amp){

        this.description = description;
        this.amp = amp;
    }

    public void on(){

        System.out.println(description + " on");
    }

    public void play(String movie){
        this.movie = movie;

        System.out.println(description + " playing " + movie);
    }

    public String toString(){

        return description;
    }

    public void stop(){

        System.out.println(description + " stopped" + movie);
    }

    public void off(){

        System.out.println(description + " off");
    }

}
