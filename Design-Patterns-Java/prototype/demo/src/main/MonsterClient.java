package main;

public class MonsterClient {

    public static void main(String[] args) {
        Dragon dragon = new Dragon("Sammy", true);
        Drakon drakon = new Drakon("Sandy", 3, true);

        // ... later ...
        Monster clonedDragon = operation(dragon);
        Monster clonedDrakon = operation(drakon);
    }

    public static Monster operation(Monster p) {
        // This code doesn't know or care what the concrete type of p is
        Monster pCopy = null;

        pCopy = p.copy();
        System.out.println("Operating with pCopy!");

        return pCopy;
    }

}

