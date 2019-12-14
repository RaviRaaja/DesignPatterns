public class PhoneDisplay implements Observer {
    // public PhoneDisplay(WeatherData weatherData) --> Phonediplay need know know about the
    // weather data class directly. we can use interface to show method signatures alone.

    int temperature;
    double pressure;
    Subject weatherData;

    public PhoneDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void update(int temp, double pressure) {
        this.temperature = temp;
        this.pressure = pressure;
        display();
    }

    private void display(){
        System.out.println("Phone Displays Temperature & Pressure are " + this.temperature + " " +  this.pressure);
    }
}
