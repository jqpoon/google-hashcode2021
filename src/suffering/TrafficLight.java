package suffering;

import static suffering.TrafficLight.Color.GREEN;
import static suffering.TrafficLight.Color.RED;

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

    public void turnGreen(){
        curColor = GREEN;
    }

    public void turnRed(){
        curColor = RED;
    }

    public Color getCurColor(){
        return curColor;
    }

    public Street getStreet() {
        return street;
    }

    public boolean isEnd() {
        return end;
    }
}


