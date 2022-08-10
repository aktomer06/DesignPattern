package HeadFirstDesign.ObserverPattern;

public class StatisticsDisplay implements DisplayElement, Observer{
    private float temp;
    private float max;
    private float min;
    private float totalTemp;
    private int numOfData;
    WeatherData weatherData;

    StatisticsDisplay (WeatherData weatherData) {
        this.weatherData = weatherData;
        this.totalTemp = 0;
        this.numOfData = 0;
        this.max = 0;
        this.min = Float.MAX_VALUE;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.totalTemp += temp;
        this.numOfData++;
        this.max = Math.max(max, temp);
        this.min = Math.min(min, temp);
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature : " + totalTemp/numOfData + "/" + max + "/" + min);
    }
}
