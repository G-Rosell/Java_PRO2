package observer_weatherdata;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    // push
    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;
        if (temp > maxTemp) maxTemp = temp;
        if (temp < minTemp) minTemp = temp;
        this.display();
    }

//    // push
//    @Override
//    public void update(WeatherData weatherData) {
//        float temp = weatherData.getTemperature();
//        tempSum += temp;
//        numReadings++;
//        if (temp > maxTemp) maxTemp = temp;
//        if (temp < minTemp) minTemp = temp;
//        this.display();
//    }

    @Override
    public void display() {
        System.out.println("*** Statistics ***");
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
