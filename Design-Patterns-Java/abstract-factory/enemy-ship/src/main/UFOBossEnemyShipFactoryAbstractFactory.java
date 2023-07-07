package main;

public class UFOBossEnemyShipFactoryAbstractFactory implements EnemyShipFactoryAbstractFactory{

    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addESEngine() {
        return null;
    }
}
