package observation;

public class WeatherMain {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        StatisticstDisplay statisticstDisplay = new StatisticstDisplay(weatherData);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,85,90);
    }
}
