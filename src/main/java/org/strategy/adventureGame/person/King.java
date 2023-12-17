package org.strategy.adventureGame.person;

import org.strategy.adventureGame.behavior.BowAndArrowBehavior;
import org.strategy.adventureGame.person.Character;

public class King extends Character {

    public King() {
        weapon = new BowAndArrowBehavior();
    }

    public void fight() {
        System.out.println("Король достал оружие");
    }
}