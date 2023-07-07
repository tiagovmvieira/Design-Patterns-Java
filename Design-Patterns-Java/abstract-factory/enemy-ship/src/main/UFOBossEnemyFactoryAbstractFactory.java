package main;

public class UFOBossEnemyFactoryAbstractFactory extends EnemyShipAbstractFactory{

    EnemyShipFactoryAbstractFactory shipFactory;

    public UFOBossEnemyFactoryAbstractFactory(EnemyShipFactoryAbstractFactory shipFactory){

        this.shipFactory = shipFactory;
    }

    @Override
    public void makeShip() {

        System.out.println("Making enemy ship " + getName());

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();

    }

}
