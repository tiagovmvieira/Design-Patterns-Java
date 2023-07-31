package main;

public class VacationDirector {
    public static void main(String[] args){

        VacationBuilder outdoorsVacationBuilder = new OutdoorsVacationBuilder();
        Vacation outdoorsVacation = outdoorsVacationBuilder
                .addAccomodation("Two person tent", 2020, 7, 1, 5 ,34)
                .addEvent("Beach")
                .addAccomodation("Two person tent")
                .addEvent("Moutains")
                .getVacation();
        System.out.println(outdoorsVacation);

        VacationBuilder cityVacationBuilder = new CityVacationBuilder();
        Vacation cityVacation = cityVacationBuilder
                .addAccomodation("Grand Facadian", 2020, 8, 1, 5, 0)
                .addAccomodation("Hotel Commander", 2020, 8, 6, 2, 0)
                .addEvent("Cirque du Soleil")
                .getVacation();
        System.out.println(cityVacation);

    }

}
