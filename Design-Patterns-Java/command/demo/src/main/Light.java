package main;

public class Light {

    String location;
    int level;

    public Light(String location){

        this.location = location;
    }

    public void on(){

        System.out.println("Light is On");
    }

    public void off(){

        System.out.println("Light is Off");
    }
}