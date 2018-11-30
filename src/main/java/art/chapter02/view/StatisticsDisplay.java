/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.chapter02.view;

import art.chapter02.weather.WeatherData;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author artem
 */
public class StatisticsDisplay implements DisplayElement, Observer{

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) +
                "/" + maxTemp + "/" + minTemp);
    }   

    @Override
    public void update(Observable observable, Object arg) {
        
        if (observable instanceof WeatherData){
            WeatherData weatherdata = (WeatherData) observable;
            float temp = weatherdata.getTemp();
            tempSum += temp;

            numReadings++;

            if (temp > maxTemp){
                maxTemp = temp;
            }

            if (temp < minTemp){
                minTemp = temp;
            }    
        }
              
        display();
    }
}
