public class ComputerDisplay implements Observer {
    int temperature;
    double pressure;
    Subject weatherData;

    public ComputerDisplay(Subject weatherData) {
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
        System.out.println("Computer Displays Temperature & Pressure are " + this.temperature + " " +  this.pressure);
    }
}
