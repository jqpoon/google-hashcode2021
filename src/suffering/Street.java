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
        this.lightStart = new TrafficLight(false);
        this.lightEnd = new TrafficLight(true);
        cars = new ArrayList<>();

        Intersection start = city.getIntersections().get(interStart);
        start.getIncoming().put(this, lightStart);
        Intersection end = city.getIntersections().get(interEnd);
        end.getOutgoing().put(this, lightEnd);
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
