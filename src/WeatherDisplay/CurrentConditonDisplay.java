package WeatherDisplay;

import WeatherInterface.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zz on 2015/4/19.
 */
public class CurrentConditonDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    Observable observable;

    public CurrentConditonDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("current conditions: " + temperature + "F degreess and "
        + humidity +" % huidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
