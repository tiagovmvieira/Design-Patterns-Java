package main;

public class CityVacationBuilder extends VacationBuilder{

    public CityVacationBuilder(){

        this.name = "City Vacation Builder";
    }

    @Override
    public VacationBuilder addAccomodation() {

        this.accomodations.add(new Hotel());

        return this;
    }

    @Override
    public VacationBuilder addAccomodation(String name) {

        this.accomodations.add(new Hotel(name));

        return this;
    }

    @Override
    public VacationBuilder addAccomodation(String name, int year, int month, int day, int nights, int location) {

        Reservation reservation = new Reservation();
        reservation.setArrivalDate(year, month, day);
        reservation.setNights(nights);

        Hotel hotel = new Hotel(name);
        hotel.setReservation(reservation);
        hotel.setRoomNumber(location);

        this.accomodations.add(hotel);
        return this;
    }

    @Override
    public VacationBuilder addEvent(String event) {
        this.events.add("See the " + event + " show");
        return this;
    }

}
