package weatherObserver.ObservePattern.DisplayPkg;

import weatherObserver.ObservePattern.DisplayElement;
import weatherObserver.ObservePattern.ObserverPkg.Observer;
import weatherObserver.ObservePattern.SubjectPkg.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObservers(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current conditions: " + temperature + " degree / Humidity:" + humidity );
    }    
}
