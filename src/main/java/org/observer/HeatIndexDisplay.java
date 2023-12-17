package org.observer;

import org.observer.interfaces.DisplayElement;
import org.observer.interfaces.Observer;
import org.observer.interfaces.Subject;

/**
 * Выводит прогноз погоды по показаниям барометра
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float heatIndex;
    private final Subject weatherData;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        heatIndex = 16.923F + 1.85212F * (float) Math.pow(10, -1)
                * temperature + 5.37941F
                * humidity - 1.00254F * (float) Math.pow(10, -1)
                * temperature
                * humidity + 9.41695F * (float) Math.pow(10, -3)
                * (float) Math.pow(temperature, 2) + 7.28898F * (float) Math.pow(10, -3)
                * (float) Math.pow(humidity, -2) + 3.45373F * (float) Math.pow(10, -4)
                * (float) Math.pow(temperature, 2)
                * humidity - 8.14971F * (float) Math.pow(10, -4)
                * temperature
                * (float) Math.pow(humidity, 2) + 1.02102F * (float) Math.pow(10, -5)
                * (float) Math.pow(temperature, 2)
                * (float) Math.pow(humidity, 2) - 3.8646F * (float) Math.pow(10, -5)
                * (float) Math.pow(temperature, 3) + 2.91583F * (float) Math.pow(10, -5)
                * (float) Math.pow(humidity, 3) + 1.42721F * (float) Math.pow(10, -6)
                * (float) Math.pow(temperature, 3)
                * humidity + 1.97483F * (float) Math.pow(10, -7)
                * temperature
                * (float) Math.pow(humidity, 3) - 2.18429F * (float) Math.pow(10, -8)
                * (float) Math.pow(temperature, 3)
                * (float) Math.pow(humidity, 2) + 8.43296F * (float) Math.pow(10, -10)
                * (float) Math.pow(temperature, 2)
                * (float) Math.pow(humidity, 3) - 4.81975F * (float) Math.pow(10, -11)
                * (float) Math.pow(temperature, 3)
                * (float) Math.pow(humidity, 3);
        display();
    }

    public void display() {
        System.out.println("Head index is " + heatIndex);
    }
}