package org.singleton;

public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new ChocolateBoiler();
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            //заполнение нагревателя молочно-шоколадной смесью
        }
    }

    public void drain() {
        if (!isEmpty() && !isBoiled())
            //слить нагретое молоко и шоколад
            empty = true;
    }

    public void boil() {
        if (!isEmpty() && !isBoiled())
            //довести содержимое до кипения
            boiled = true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
