package main;

public class Light {

    String location;
    int level;

    public Light(String location){

        this.location = location;
    }

    public void on(){

        System.out.println(location + " light is on");
    }

    public void off(){

        System.out.println(location + " light is off");
    }
}