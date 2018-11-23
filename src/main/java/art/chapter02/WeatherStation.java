package art.chapter02;

import art.chapter02.view.CurrentConditionsDisplay;
import art.chapter02.view.ForecastDisplay;
import art.chapter02.view.HeatIndexDisplay;
import art.chapter02.view.StatisticsDisplay;
import art.chapter02.weather.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        //HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.14f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
