package suffering;

import static suffering.TrafficLight.Color.GREEN;
import static suffering.TrafficLight.Color.RED;

public class TrafficLight {
    enum Color{
        RED, GREEN
    }

    private Color curColor;
    private Street street;
    private final boolean end;

    public TrafficLight(boolean end) {
        this.curColor = RED;
        this.end = end;
    }

    public void setCurColor(Color curColor) {
        this.curColor = curColor;
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


