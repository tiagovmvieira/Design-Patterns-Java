package main;

public class UFOEnemyShipAbstractFactory extends EnemyShipAbstractFactory{

    EnemyShipFactoryAbstractFactory shipFactory;

    public UFOEnemyShipAbstractFactory(EnemyShipFactoryAbstractFactory shipFactory){

        this.shipFactory = shipFactory;
    }

    @Override
    public void makeShip() {
        System.out.println("Making enemy ship " + getName());

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();

    }
}
