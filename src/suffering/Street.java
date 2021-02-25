package suffering;

public class Street {
    private final String name;
    private final int interStart;
    private final int interEnd;
    private final int travelTime;
    private final TrafficLight lightStart;
    private final TrafficLight lightEnd;


    public Street(String name, int interStart, int interEnd, int travelTime) {
        this.name = name;
        this.interStart = interStart;
        this.interEnd = interEnd;
        this.travelTime = travelTime;
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
}
