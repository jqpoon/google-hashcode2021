package suffering;

public class TrafficLight {
    enum Color{
        RED, GREEN
    }

    private Color curColor;
    private final Street street;
    private final boolean end;

    public TrafficLight(Color curColor, Street street, boolean end) {
        this.curColor = curColor;
        this.street = street;
        this.end = end;
    }
}


