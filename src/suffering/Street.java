package suffering;

import java.util.ArrayList;
import java.util.List;
import suffering.TrafficLight.Color;

public class Street {
    private final City city;
    private final String name;
    private final int interStart;
    private final int interEnd;
    private final int travelTime;
    private final TrafficLight lightStart;
    private final TrafficLight lightEnd;

    private List<Car> cars;


    public Street(City city, String name, int interStart, int interEnd, int travelTime) {
        this.city = city;
        this.name = name;
        this.interStart = interStart;
        this.interEnd = interEnd;
        this.travelTime = travelTime;
        this.lightStart = new TrafficLight(Color.RED, this, false);
        this.lightEnd = new TrafficLight(Color.RED, this, true);
        cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getInterStart() {
        return interStart;
    }

    public int getInterEnd() {
        return interEnd;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public TrafficLight getLightStart() {
        return lightStart;
    }

    public TrafficLight getLightEnd() {
        return lightEnd;
    }

    public List<Car> getCars() {
        return cars;
    }

}
