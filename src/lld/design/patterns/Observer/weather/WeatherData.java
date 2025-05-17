package lld.design.patterns.Observer.weather;

import lld.design.patterns.Observer.Observer;
import lld.design.patterns.Observer.Subject;

import java.util.List;

public class WeatherData implements Subject {

    List<Observer> observerList;

    public int temperature,humidity;

    WeatherData() {
        this.temperature = 0;
        this.humidity = 0;
    }

    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        this.observerList.add(o);
    }

    @Override
    public void notifyObservers() {

        for(Observer observer: observerList) {
            observer.update();
        }

    }
}
