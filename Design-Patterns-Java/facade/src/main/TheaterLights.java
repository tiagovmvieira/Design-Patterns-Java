package main;

public class TheaterLights {
    String description;

    public TheaterLights(String description){

        this.description = description;
    }

    public void dim(int dimension){

        System.out.println(description + " dimming to " + dimension + "%");
    }

    public void on(){

        System.out.println(description + " on");
    }

    public void off(){

        System.out.println(description + " off");
    }

    public String toString(){

        return description;
    }

}
