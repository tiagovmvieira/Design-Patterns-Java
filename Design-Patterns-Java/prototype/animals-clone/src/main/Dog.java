package main;

public class Dog implements Animal {

    public Dog(){

        System.out.println("Dog is Made");
    }

    @Override
    public Animal makeCopy() {

        System.out.println("Dog Clone is Being Made");

        Dog dogObject = null;

        try {
            dogObject = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }

        return dogObject;
    }

    public String toString(){

        return "Spark is my Hero, aufauf";
    }

}
