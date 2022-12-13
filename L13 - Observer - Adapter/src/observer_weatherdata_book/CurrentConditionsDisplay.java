package observer_weatherdata_book;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData; // only needed for pull generalized

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // push
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }

//    // pull
//    @Override
//    public void update(WeatherData weatherData) {
//        temperature = weatherData.getTemperature();
//        humidity = weatherData.getHumidity();
//        this.display();
//    }

//    // pull generalized
//    @Override
//    public void update() {
//        temperature = weatherData.getTemperature();
//        humidity = weatherData.getHumidity();
//        this.display();
//    }

    @Override
    public void display() {
        System.out.println("*** Current conditions ***");
        System.out.println(temperature + "F degrees and " + humidity + "% humidity");
    }
}
