package observer_weatherdata;

public class WeatherStationWithHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();

		weatherData.addObserver(statisticsDisplay);
		weatherData.addObserver(currentDisplay);
		weatherData.addObserver(forecastDisplay);
		weatherData.addObserver(heatIndexDisplay);

		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println();
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println();
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
