/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.chapter02.view;

import java.util.Observer;
import art.chapter02.weather.WeatherData;
import java.util.Observable;

/**
 *
 * @author artem
 */
public class ForecastDisplay implements DisplayElement, Observer {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void update(Observable observable, Object args) {
        
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
        
            currentPressure = weatherData.getPressure();
            display();
        }
    }
       
    @Override
    public void display() {
	System.out.println("\n");
        System.out.print("Forecast: ");
        
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
	} else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
  
