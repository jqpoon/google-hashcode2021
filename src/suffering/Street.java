package suffering;

import java.util.ArrayList;
import java.util.List;

public class Street {
    private final String name;
    private final int interStart;
    private final int interEnd;
    private final int travelTime;
    private final TrafficLight lightStart;
    private final TrafficLight lightEnd;
    private List<Car> carsAtEnd;
    private List<Car> carsAtStart;


    public Street(String name, int interStart, int interEnd, int travelTime,
        TrafficLight lightStart, TrafficLight lightEnd) {
        this.name = name;
        this.interStart = interStart;
        this.interEnd = interEnd;
        this.travelTime = travelTime;
        this.lightStart = lightStart;
        this.lightEnd = lightEnd;
        carsAtEnd = new ArrayList<>();
        carsAtStart = new ArrayList<>();
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

    public List<Car> getCarsAtEnd() {
        return carsAtEnd;
    }

    public List<Car> getCarsAtStart() {
        return carsAtStart;
    }
}
