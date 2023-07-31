package main;

public class Tent extends Accomodation{
    int siteNumber;

    public Tent(){

        this.name = "Tent";
    }

    public Tent(String name){

        this.name = name;
    }

    public void setSiteNumber(int n){

        this.siteNumber = n;
    }

    public int getSiteNumber(){

        return this.siteNumber;
    }

    @Override
    public String getLocation() {
        if (siteNumber == 0){
            return "";
        } else {
            return "Site number " + getSiteNumber();
        }
    }

}
