package com.github.git_leon.observerpattern.weatherstation;

import com.github.git_leon.observerpattern.utils.observer.Update;

/**
 * @author leon on 5/9/18.
 */
public class WeatherDataUpdate implements Update {
    private final WeatherData formerWeatherData;
    private Float newHumidity;
    private Float newPressure;
    private Float newTemperature;

    public WeatherDataUpdate(WeatherData formerWeatherData) {
        this.formerWeatherData = formerWeatherData;
    }

    public void setHumidity(Float newHumidity) {
        this.newHumidity = newHumidity;
    }

    public void setPressure(Float newPressure) {
        this.newPressure = newPressure;
    }

    public void setNewTemperature(Float newTemperature) {
        this.newTemperature = newTemperature;
    }

    @Override
    public void execute() {
        formerWeatherData.setHumidity(newHumidity);
        formerWeatherData.setPressure(newPressure);
        formerWeatherData.setTemperature(newTemperature);
    }
}
