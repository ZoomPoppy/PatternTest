package WeatherDisplay;

/**
 * Created by zz on 2015/4/19.
 */
public class WeatherStation  {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditonDisplay currentConditonDisplay =
                new CurrentConditonDisplay(weatherData);

        weatherData.setMeasurements(80,49,49.8f);



    }
}
