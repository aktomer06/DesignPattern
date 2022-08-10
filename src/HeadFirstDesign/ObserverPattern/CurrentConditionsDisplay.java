package HeadFirstDesign.ObserverPattern;

public class CurrentConditionsDisplay implements DisplayElement, Observer{
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay (WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "F degree and " + humidity + "% humidity");
    }
}
