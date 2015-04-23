package WeatherDisplay;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zz on 2015/4/19.
 */
public class StatisticsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Observable weatherData;

    public StatisticsDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }



    @Override
    public void update(Observable o, Object arg) {

    }
}
