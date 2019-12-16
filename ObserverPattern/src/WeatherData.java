import java.util.ArrayList;

public class WeatherData implements Subject {
    // In this class apart from the information of the climate params
    // we also have the methods to register the users , deregister the users
    // also to notify the users if new data comes.
    ArrayList<Observer> observerArr;
    int temperature;
    double pressure;

    WeatherData() {
        this.observerArr = new ArrayList<>();
    }
    @Override
    public void register(Observer o) {
        this.observerArr.add(o);
    }

    @Override
    public void unregister(Observer o) {
        this.observerArr.remove(observerArr.indexOf(o));
    }

    @Override
    public void notifyAllDisplays() {
        // basic looping
        // for (int t=0; t<observerArr.size(); t++){
        //    Observer cd = observerArr.get(t);
        //    cd.update(temperature,pressure);
        // }
        for (Observer customDisplay: observerArr) {
            customDisplay.update(temperature, pressure);
        }
    }

    public void setMeasurements(int temperature, double pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyAllDisplays();
    }



}
