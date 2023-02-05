package org.example.factoryPattern;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;

        if(newShipType.equals("U")) {
            return new UFOEnemyShip();
        } else  {
            return new RocketEnemyShip();
        }

    }
}
