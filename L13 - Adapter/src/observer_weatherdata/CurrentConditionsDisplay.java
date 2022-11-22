package observer_weatherdata;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

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
//        this.temperature = weatherData.getTemperature();
//        this.humidity = weatherData.getHumidity();
//        this.display();
//    }

    @Override
    public void display() {
        System.out.println("*** Current conditions ***");
        System.out.println(temperature + "F degrees and " + humidity + "% humidity");
    }
}
