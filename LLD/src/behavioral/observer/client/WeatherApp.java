package behavioral.observer.client;

import behavioral.observer.concreteObserver.PhoneDisplay;
import behavioral.observer.concreteObserver.TVDisplay;
import behavioral.observer.concreteSubject.WeatherStation;
import behavioral.observer.observerInterface.Observer;

//  => In “WeatherApp", a “WeatherStation" is created.
//  => Two observers (“PhoneDisplay" and “TVDisplay") are registered with the weather station using “addObserver".
//  => The “setWeather" method simulates a weather change to “Sunny,” triggering the “update" method in both observers.
//  => The output shows how both concrete observers display the updated weather information.

public class WeatherApp {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        // Simulating weather change
        weatherStation.setWeather("Sunny");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        weatherStation.setWeather("Raining");
    }
}
