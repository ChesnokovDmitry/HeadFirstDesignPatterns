package org.strategy.adventureGame;

public class Queen extends Character {

    public Queen() {
        weapon = new KnifeBehavior();
    }

    public void fight() {
        System.out.println("Королева достала оружие");
    }
}