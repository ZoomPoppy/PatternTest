package WeatherDisplay;

import java.util.Observable;

/**
 * Created by zz on 2015/4/19.
 */
public class WeatherData extends Observable {
   // private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){}
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void  setMeasurements(float temperature,float humidity,float pressure){
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
