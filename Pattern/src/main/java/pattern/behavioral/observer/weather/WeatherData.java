package pattern.behavioral.observer.weather;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class WeatherData extends Observable implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private boolean changed = false;
    Observer obs;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        int i = observers.indexOf(ob);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers(Object arg) {
        Object[] arrLocal;
        arrLocal = observers.toArray();
        for (int i = arrLocal.length - 1; i >= 0; i--)
            ((java.util.Observer) arrLocal[i]).update(this, arg);
    }

    public void measurementsChanged() {
        notifyObservers(observers.toArray());
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}