package org.strategy.adventureGame.person;

import org.strategy.adventureGame.behavior.AxeBehavior;
import org.strategy.adventureGame.person.Character;

public class Troll extends Character {

    public Troll() {
        weapon = new AxeBehavior();
    }

    public void fight() {
        System.out.println("Троль достал оружие");
    }
}