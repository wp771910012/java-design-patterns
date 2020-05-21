package com.wp.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 天气
 * @Author wangpeng
 * @Date 2019/4/16 9:08
 */
public class Weather {

    private List<WeatherObserver> weatherObservers;

    private WeatherType currentWeather;

    public Weather() {
        weatherObservers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    public void timePasses() {
        WeatherType[] weatherTypes = WeatherType.values();
        currentWeather = weatherTypes[(currentWeather.ordinal() + 1) == weatherTypes.length ? 0 : currentWeather.ordinal() + 1];
        System.out.println("the weather changed to " + currentWeather);
        notifyObservers();
    }

    private void notifyObservers() {
        weatherObservers.forEach(weatherObserver -> {
            weatherObserver.update(currentWeather);
        });
    }
}
