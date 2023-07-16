package main;

public abstract class Hoagie{

    boolean afterFirstCondiment = false;


    public final void makeSandwich(){

        cutBun();

        if(customerWantsMeat()){

            addMeat();

            afterFirstCondiment = true;
        }

        if(customerWantsCheese()){

            if(afterFirstCondiment){

                System.out.println("\n");
            }

            addCheese();
            afterFirstCondiment = true;
        }

        if(customerWantsVegetables()){

            if(afterFirstCondiment){

                System.out.println("\n");
            }

            addVegetables();
            afterFirstCondiment = true;
        }

        if(customerWantsCondiments()){

            if(afterFirstCondiment){

                System.out.println("\n");
            }

            addCondiments();
            afterFirstCondiment = true;
        }

        wrapTheHoagie();
    }

    public void cutBun(){

        System.out.println("The Hoagie " + this.toString() + " is Cut");
    }

    public abstract void addMeat();
    public abstract void addCheese();
    public abstract void addVegetables();
    public abstract void addCondiments();

    boolean customerWantsMeat(){ return true; }
    boolean customerWantsCheese(){ return true; }
    boolean customerWantsVegetables(){ return true; }
    boolean customerWantsCondiments(){ return true; }

    public void wrapTheHoagie(){

        System.out.println("\nWrap the Hoagie");
    }

    public String toString(){

        return "Hoagie";
    }

}
