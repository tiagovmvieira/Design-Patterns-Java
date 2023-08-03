package main;

public class Drakon extends Monster{

    public Drakon(String name, int numHeads, boolean canBreatheFire){

        super(name);
        this.numHeads = numHeads;
        this.canBreatheFire = canBreatheFire;
    }

    public void spitPoison(){

        System.out.println(this.name + " spits poison");
    }

    @Override
    public Monster copy() {

        Drakon drakonObject = null;

        try {
            drakonObject = (Drakon) super.clone();
        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }

        return drakonObject;
    }

}
