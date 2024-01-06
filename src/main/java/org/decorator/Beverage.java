package org.decorator;

public abstract class Beverage {
    public enum Size { SMALL, AVERAGE, BIG };
    protected Size size = Size.SMALL;
    protected String description = "Unknown Beverage";

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
