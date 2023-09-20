package Ch2.Java;
import ObservePattern.DisplayPkg.CurrentConditionDisplay;
import ObservePattern.SubjectPkg.WeatherData;

public class WeatherStation{
    public static void main(String[] string){
        WeatherData data = new WeatherData();
       
        CurrentConditionDisplay c = new CurrentConditionDisplay(data);
        // StatisticDisplay statistic = new StatisticDisplay(data); 
        data.setMeasurements(80,65,30.4f);
        data.setMeasurements(70,92,20.4f);
        data.setMeasurements(87,74,45f);
    }
}