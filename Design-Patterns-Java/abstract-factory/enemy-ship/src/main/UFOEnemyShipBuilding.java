package main;

public class UFOEnemyShipBuilding extends EnemyShipBuilding{

    @Override
    protected EnemyShipAbstractFactory makeEnemyShip(String typeOfShip) {

        EnemyShipAbstractFactory theEnemyShip = null;

        if(typeOfShip.equals("UFO")){
            EnemyShipFactoryAbstractFactory shipPartsFactory = new UFOEnemyShipFactoryAbstractFactory();
            theEnemyShip = new UFOEnemyShipAbstractFactory(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        } else if (typeOfShip.equals("UFO BOSS")){
            EnemyShipFactoryAbstractFactory shipPartsFactory = new UFOBossEnemyShipFactoryAbstractFactory();
            theEnemyShip = new UFOBossEnemyFactoryAbstractFactory(shipPartsFactory);
            theEnemyShip.setName("UFO Boss Ship");

        }

        return theEnemyShip;
    }

}
