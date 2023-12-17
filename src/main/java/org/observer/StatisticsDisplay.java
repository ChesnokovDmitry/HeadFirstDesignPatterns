package org.observer;

import org.observer.interfaces.DisplayElement;
import org.observer.interfaces.Observer;
import org.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.Collections;

public class StatisticsDisplay implements Observer, DisplayElement {
    private final ArrayList<Float> list;
    private float temperature;
    private float avg;
    private float max;
    private float min;
    private final Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        list = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    public void update() {
        this.temperature = weatherData.getTemperature();
        list.add(temperature);
        max = Collections.max(list);
        min = Collections.min(list);
        avg = (max + min) / 2;
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avg + "/" + max + "/" + min);
    }
}