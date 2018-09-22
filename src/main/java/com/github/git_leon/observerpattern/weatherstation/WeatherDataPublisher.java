package com.github.git_leon.observerpattern.weatherstation;

import com.github.git_leon.observerpattern.utils.observer.Observable;
import com.github.git_leon.observerpattern.utils.observer.Publisher;

/**
 * @author leon on 5/8/18.
 */
public class WeatherDataPublisher extends Publisher {
    private final WeatherData weatherData;

    public WeatherDataPublisher(Observable observable, WeatherData weatherData) {
        super(observable);
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        this.update(() -> {
            // TODO - Implement logic
        });
    }
}
