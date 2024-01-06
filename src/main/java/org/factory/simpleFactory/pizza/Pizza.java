package org.factory.simpleFactory.pizza;

public interface Pizza {

    default void prepare() {
        System.out.println("Prepare");
    }

    default void bake() {
        System.out.println("Bake");
    }

    default void cut() {
        System.out.println("Cut");
    }

    default void box() {
        System.out.println("Box");
    }
}
