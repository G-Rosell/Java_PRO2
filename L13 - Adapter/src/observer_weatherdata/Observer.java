package observer_weatherdata;

public interface Observer {
    void update(float temp, float humidity, float pressure); // push
//    void update(WeatherData weatherData); // pull
}
