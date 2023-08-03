package main;

public class Dragon extends Monster{

    public Dragon(String name, boolean hasWings){
        super(name);
        this.hasWings = hasWings;
        this.canBreatheFire = true;
    }

    @Override
    public Monster copy() {

        Dragon dragonObject = null;

        try {
            dragonObject = (Dragon) super.clone();
        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }

        return dragonObject;
    }

}
