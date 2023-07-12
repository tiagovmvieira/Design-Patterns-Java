package main;

public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner(String description, Amplifier amplifier){

        this.description = description;
        this.amplifier = amplifier;
    }

    public void on(){

        System.out.println(description + " on");
    }

    public void off(){

        System.out.println(description + " off");
    }

    public void setFrequency(double frequency){

        System.out.println(description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public void setAM(){

        System.out.println(description + " setting AM mode");
    }

    public void setFM(){

        System.out.println(description + " setting FM mode");
    }

    public String toString(){

        return description;
    }
}
