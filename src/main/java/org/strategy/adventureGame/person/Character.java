package org.strategy.adventureGame.person;

import org.strategy.adventureGame.behavior.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public abstract void fight();

    public void performUseWeapon() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}