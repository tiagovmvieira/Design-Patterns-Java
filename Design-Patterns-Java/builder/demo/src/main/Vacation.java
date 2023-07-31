package main;

import java.util.ArrayList;

public class Vacation {
    String name;
    ArrayList<Accomodation> accomodations = new ArrayList<Accomodation>();
    ArrayList<String> events = new ArrayList<String>();

    public void setName(String name){

        this.name = name;
    }

    public void setAccomodations(ArrayList<Accomodation> accomodations){

        this.accomodations = accomodations;
    }

    public void setEvents(ArrayList<String> events){

        this.events = events;
    }

    public String toString(){

        StringBuffer display = new StringBuffer();
        display.append("---- " + this.name + " ----\n");
        for (Accomodation a: accomodations){
            display.append(a);
        }
        for (String e: events){
            display.append(e + "\n");
        }
        return display.toString();
    }

}
