package main;

import java.util.ArrayList;

public abstract class VacationBuilder {
    String name;
    ArrayList<Accomodation> accomodations = new ArrayList<Accomodation>();
    ArrayList<String> events = new ArrayList<String>();

    public abstract VacationBuilder addAccomodation();
    public abstract VacationBuilder addAccomodation(String name);
    public abstract  VacationBuilder addAccomodation(String name, int year, int month, int day, int nights, int location);
    public abstract VacationBuilder addEvent(String event);

    public Vacation getVacation(){
        Vacation vacation = new Vacation();
        vacation.setName(name);
        vacation.setAccomodations(accomodations);
        vacation.setEvents(events);

        return vacation;
    }

}
