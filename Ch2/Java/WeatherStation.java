package Ch2.Java;
import java.util.ArrayList;

import ObservePattern.DisplayPkg.CurrentConditionDisplay;
import ObservePattern.DisplayPkg.ForecastDisplay;
import ObservePattern.DisplayPkg.StatisticDisplay;
import ObservePattern.SubjectPkg.Subject;
import ObservePattern.SubjectPkg.WeatherData;

public class WeatherStation{
    public static void main(String[] string){
        WeatherData curData = new WeatherData();   
        CurrentConditionDisplay c = new CurrentConditionDisplay(curData);
        StatisticDisplay s = new StatisticDisplay(curData);

        curData.setMeasurements(32,65,30.4f);
        curData.setMeasurements(30, 92, 20.4f);

        WeatherData forecastData = new WeatherData();
        ForecastDisplay f = new ForecastDisplay(forecastData);
        forecastData.setMeasurements(27,74,45f);
        
        curData.setMeasurements(34, 55, 32.9f);
    }
}