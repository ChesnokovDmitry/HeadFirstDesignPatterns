package org.strategy.adventureGame.behavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Удар топором");
    }
}