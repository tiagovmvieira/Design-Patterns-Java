package main;

public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public final void boilWater(){

        System.out.println("Boiling Water");
    }

    public final void pourInCup(){

        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments(){

        return true;
    }

}
