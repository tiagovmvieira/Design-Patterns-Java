package main;

public abstract class EnemyShipAbstractFactory {

    private String name;

    ESWeapon weapon;
    ESEngine engine;

    public String getName() { return name; }
    public void setName(String newName){ this.name = newName; }

    public abstract void makeShip();

    public void followHeroShip(){

        System.out.println(getName() + " is following the heo at " + engine);
    }

    public void displayEnemyShip(){

        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots(){

        System.out.println(getName() + " attacks and does " + weapon);
    }

    public String toString(){

        String infoOnShip = "The " + name + " has a top speed of " + engine +
                " and an attack power of "+ weapon;

        return infoOnShip;
    }

}
