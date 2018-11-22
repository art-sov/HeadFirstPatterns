package art.chapter02.view;

import art.chapter02.DisplayElement;
import art.chapter02.Observer;
import art.chapter02.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer{

    private float temp;
    private float humidity;
    private float pressure;
    private Subject wheatherData;

    public CurrentConditionsDisplay(Subject wheatherData) {
        this.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current parameters:\n" + "temperature: " + temp + " degrees" +
        "\nhumidity: " + humidity + " %" +
        "\npressure: " + pressure);

        System.out.println("\n");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
