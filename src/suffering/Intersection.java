package suffering;

import java.util.HashMap;
import java.util.List;

public class Intersection {
    private final HashMap<Street, TrafficLight> incoming;
    private final HashMap<Street, TrafficLight> outgoing;
    private final int id;

    public Intersection(HashMap<Street, TrafficLight> incoming,
        HashMap<Street, TrafficLight> outgoing, int id) {
        this.incoming = incoming;
        this.outgoing = outgoing;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public HashMap<Street, TrafficLight> getIncoming() {
        return incoming;
    }

    public HashMap<Street, TrafficLight> getOutgoing() {
        return outgoing;
    }
}
