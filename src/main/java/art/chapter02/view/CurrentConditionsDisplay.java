package art.chapter02.view;

import art.chapter02.weather.WeatherData;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer{

    private float temp;
    private float humidity;
    private float pressure;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        	System.out.println("\n");

        System.out.println("Current parameters:\n" + "temperature: " + temp + " degrees" +
        "\nhumidity: " + humidity + " %" +
        "\npressure: " + pressure);

        System.out.println("");
    }

    @Override
    public void update(Observable obs, Object arg) {
        
        if (obs instanceof WeatherData) {
            WeatherData weatherDate = (WeatherData) obs;
            this.temp = weatherDate.getTemp();
            this.humidity = weatherDate.getHumidity();
            this.pressure = weatherDate.getPressure();
            display();
        }
    }
}
