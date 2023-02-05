package org.example.factoryPattern;

public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public String getName() {
        return name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public String followHeroShip() {
        return this.getName();
    }

    public double enemyShipShoots() {
         return this.getAmtDamage();
    }

}
