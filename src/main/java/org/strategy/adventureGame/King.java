package org.strategy.adventureGame;

public class King extends Character {

    public King() {
        weapon = new BowAndArrowBehavior();
    }

    public void fight() {
        System.out.println("Король достал оружие");
    }
}