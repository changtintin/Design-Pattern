package weatherObserver.ObservePattern.DisplayPkg;

import weatherObserver.ObservePattern.DisplayElement;
import weatherObserver.ObservePattern.ObserverPkg.*;
import weatherObserver.ObservePattern.SubjectPkg.*;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObservers(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Tomorrow Weather : " + temperature + " degree / Humidity:" + humidity );
    }    
}
