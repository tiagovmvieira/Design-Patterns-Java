package main;

public class Amplifier {
    String description;
    StreamingPlayer player;
    Tuner tuner;

    public Amplifier(String description){

        this.description = description;
    }

    public void on(){

        System.out.println(description + " on");
    }

    public void setStreamingPlayer(StreamingPlayer player){

        System.out.println(description +  " setting Streaming player to " + player);
        this.player = player;
    }

    public void setStereoSound(){

        System.out.println(description + " stereo mode on");
    }

    public void setSurroundSound(){

        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int volumeLevel){

        System.out.println("Amplifier setting volume to " + volumeLevel);
    }

    public void setTuner(Tuner tuner){

        System.out.println(description + " setting tuner to " + tuner);
        this.tuner = tuner;
    }

    public void off(){

        System.out.println(description + " off");
    }

    public String toString(){

        return description;
    }

}
