package ObservePattern.SubjectPkg;
import java.util.ArrayList;

import ObservePattern.ObserverPkg.Observer;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void registerObservers(Observer obr){
        observers.add(obr);    
    }

    public void removeObservers(Observer obr){
        int id = observers.indexOf(obr);
        if(id >= 1){
            observers.remove(id);
        }
    }

    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer obr = (Observer)observers.get(i);
            obr.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature(){
        return this.temperature;
    }

    public float getHumidity(){
        return this.humidity;
    }

    public float getPressure(){
        return this.pressure;
    }
}
