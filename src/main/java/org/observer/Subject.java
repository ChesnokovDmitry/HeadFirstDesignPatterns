package org.observer;

public interface Subject {

    /**
     * @param o - регистрируемый наблюдатель
     */
    public void registerObserver(Observer o);

    /**
     * @param o - исключаемый наблюдатель
     */
    public void removeObserver(Observer o);

    /**
     * Для оповещения наблюдателей об изменении состояния субъекта
     */
    public void notifyObservers();
}
