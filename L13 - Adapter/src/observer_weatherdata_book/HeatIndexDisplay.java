package observer_weatherdata_book;

public class HeatIndexDisplay implements Observer, DisplayElement {
    float heatIndex = 0.0f;
    private final WeatherData weatherData; // only needed for pull generalized

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // push
    @Override
    public void update(float temp, float humidity, float pressure) {
        heatIndex = this.computeHeatIndex(temp, humidity);
        this.display();
    }

//    // pull
//    @Override
//    public void update(WeatherData weatherData) {
//        float temp = weatherData.getTemperature();
//        float humidity = weatherData.getHumidity();
//        heatIndex = this.computeHeatIndex(temp, humidity);
//        this.display();
//    }

//    // pull generalized
//    @Override
//    public void update() {
//        float temp = weatherData.getTemperature();
//        float humidity = weatherData.getHumidity();
//        heatIndex = this.computeHeatIndex(temp, humidity);
//        this.display();
//    }

    private float computeHeatIndex(float t, float rh) {
        return (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }

    @Override
    public void display() {
        System.out.println("*** Heat Index ***");
        System.out.println("Heat index is " + heatIndex);
    }
}
