package weatherObserver.ObservePattern.DisplayPkg;

import weatherObserver.ObservePattern.DisplayElement;
import weatherObserver.ObservePattern.ObserverPkg.Observer;
import weatherObserver.ObservePattern.SubjectPkg.Subject;
import weatherObserver.ObservePattern.SubjectPkg.WeatherData;


public class StatisticDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObservers(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
