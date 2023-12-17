package org.observer;

public interface Subject {

    /**
     * @param o - регистрируемый наблюдатель
     */
    void registerObserver(Observer o);

    /**
     * @param o - исключаемый наблюдатель
     */
    void removeObserver(Observer o);

    /**
     * Для оповещения наблюдателей об изменении состояния субъекта
     */
    void notifyObservers();

    float getTemperature();

    float getHumidity();

    float getPressure();
}
