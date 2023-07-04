package main;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType){

        EnemyShip newShip = null;

        switch (newShipType) {
            case "U":
                return new UFOEnemyShip();
            case "R":
                return new RocketEnemyShip();
            case "B":
                return new BigUFOEnemyShip();
            default:
                return null;
        }

    }

}
