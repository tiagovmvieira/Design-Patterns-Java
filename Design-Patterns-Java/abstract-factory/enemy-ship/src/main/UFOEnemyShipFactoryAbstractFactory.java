package main;

public class UFOEnemyShipFactoryAbstractFactory implements EnemyShipFactoryAbstractFactory {

    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }
}
