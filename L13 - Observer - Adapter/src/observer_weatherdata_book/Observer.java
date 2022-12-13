package observer_weatherdata_book;

public interface Observer {
    void update(float temp, float humidity, float pressure); // push
//    void update(WeatherData weatherData); // pull
//    void update(); // pull generalized
}
