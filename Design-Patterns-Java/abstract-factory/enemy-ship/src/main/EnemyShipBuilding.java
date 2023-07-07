package main;

public abstract class EnemyShipBuilding {

    protected abstract EnemyShipAbstractFactory makeEnemyShip(String typeOfShip);

    public EnemyShipAbstractFactory orderTheShip(String typeOfShip){

        EnemyShipAbstractFactory theEnemyShip = makeEnemyShip(typeOfShip);

        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();

        return theEnemyShip;

    }

}
