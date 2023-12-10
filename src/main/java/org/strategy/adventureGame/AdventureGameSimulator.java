package org.strategy.adventureGame;

public class AdventureGameSimulator {

    public static void main(String[] args) {
        Character queen = new Queen();
        Character king = new King();
        Character knight = new Knight();
        Character troll = new Troll();

        queen.fight();
        queen.performUseWeapon();

        king.fight();
        king.performUseWeapon();

        knight.fight();
        knight.performUseWeapon();

        troll.fight();
        troll.performUseWeapon();

        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();
        queen.performUseWeapon();
    }
}