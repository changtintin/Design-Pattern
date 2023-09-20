package ObservePattern.DisplayPkg;

import ObservePattern.DisplayElement;
import ObservePattern.ObserverPkg.Observer;
import ObservePattern.SubjectPkg.Subject;

public class StatisticDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;


    public  StatisticDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObservers(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current conditions: " + temperature + "degree \n Humidity:" + humidity );
    }    
}
