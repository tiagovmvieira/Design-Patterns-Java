package main;

public class EnemyShipTestingAbstractFactory {

    public static void main(String[] args){

        EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();

        EnemyShipAbstractFactory theGrunt = makeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShipAbstractFactory theBoss = makeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");

    }
}
