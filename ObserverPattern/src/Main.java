public class Main { // Weather station - Main class
    // Here we assume that values entered manually are
    // obtained from the sensors located in the weather station
    // Weather station will communicate using the same SINGLE object
    // which we call as weather object.
    // In observer pattern, object from the concrete implementation is loosely coupled
    // we can see that both concrete implementation dealing with other classes object
    // without inheriting / aggregation.

    public static void main(String[] args) {
        // lets create a weather object
        WeatherData weatherObject = new WeatherData();

        // lets create some display classes and pass weatherObject into it, so that those display know what is data to display.
        // below lines will indirectly register themselves into the observable / Subject - check its constructor
        // first er should register by creating objects for the observer classes
        PhoneDisplay pDisplay = new PhoneDisplay(weatherObject);
        ComputerDisplay cDisplay = new ComputerDisplay(weatherObject);

        weatherObject.setMeasurements(67, 5.7);
        weatherObject.setMeasurements(123, 51.7);
        weatherObject.setMeasurements(23, 1.7);


    }
}
