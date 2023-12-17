package org.strategy.adventureGame.person;

import org.strategy.adventureGame.behavior.KnifeBehavior;
import org.strategy.adventureGame.person.Character;

public class Queen extends Character {

    public Queen() {
        weapon = new KnifeBehavior();
    }

    public void fight() {
        System.out.println("Королева достала оружие");
    }
}