package observer_weatherdata;

import observer_weatherdata_book.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    // push
    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        this.display();
    }

//    // pull
//    @Override
//    public void update(WeatherData weatherData) {
//        lastPressure = currentPressure;
//        currentPressure = weatherData.getPressure();
//        this.display();
//    }


    @Override
    public void display() {
        System.out.println("*** Forecast *** ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
