package org.strategy.adventureGame.person;

import org.strategy.adventureGame.behavior.SwordBehavior;
import org.strategy.adventureGame.person.Character;

public class Knight extends Character {

    public Knight() {
        weapon = new SwordBehavior();
    }

    public void fight() {
        System.out.println("Рыцарь достал оружие");
    }
}