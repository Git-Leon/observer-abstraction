package com.github.git_leon.observerpattern.weatherstation;

import com.github.git_leon.observerpattern.utils.observer.Observer;
import com.github.git_leon.observerpattern.utils.observer.Publisher;
import com.github.git_leon.observerpattern.utils.observer.Subject;
import com.github.git_leon.observerpattern.utils.observer.Update;

/**
 * @author leon on 5/9/18.
 */
public class WeatherDataSubject<
        SomeUpdate extends Update,
        SomeObserver extends Observer<SomeUpdate>,
        SomePublisher extends Publisher<SomeUpdate, SomeObserver>>
        extends Subject<SomeUpdate, SomeObserver> {
    private final WeatherData weatherData;

    public WeatherDataSubject(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public Float getTemperature() {
        return weatherData.getTemperature();
    }

    public void setTemperature(Float temperature) {
        weatherData.setTemperature(temperature);
    }

    public Float getHumidity() {
        return weatherData.getHumidity();
    }

    public void setHumidity(Float humidity) {
        weatherData.setHumidity(humidity);
    }

    public Float getPressure() {
        return weatherData.getPressure();
    }

    public void setPressure(Float pressure) {
        weatherData.setPressure(pressure);
    }

    @Override
    public void notifyObserver(SomeObserver observer) {

    }
}
